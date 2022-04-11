/*
    Copyright (c) 2010, NullNoname
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:

        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of NullNoname nor the names of its
          contributors may be used to endorse or promote products derived from
          this software without specific prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
    AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
    IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
    ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
    LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
    CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
    SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
    INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
    CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
    ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
    POSSIBILITY OF SUCH DAMAGE.
*/
package mu.nu.nullpo.util;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.log4j.Logger;

import mu.nu.nullpo.game.component.Piece;
import mu.nu.nullpo.game.component.RuleOptions;
import mu.nu.nullpo.game.subsystem.ai.DummyAI;
import mu.nu.nullpo.game.subsystem.wallkick.Wallkick;
import net.omegaboshi.nullpomino.game.subsystem.randomizer.Randomizer;

/**
 * Generic static utils
 */
public class GeneralUtil {
	/** Log */
	static Logger log = Logger.getLogger(GeneralUtil.class);

	/**
	 * Converts play time into a String
	 * @param t Play time
	 * @return String for play time
	 */
	public static String getTime(int t) {
		if(t < 0) return "--:--.--";

		return String.format("%02d:%02d.%02d", t / 3600, (t / 60) % 60, (t % 60) * 5 / 3);
	}

	/**
	 * Converts a boolean value into "ON" or "OFF"
	 * @param bool Boolean value to be converted
	 * @return "ON" if value is true, "OFF" if value is false
	 */
	public static String getONorOFF(boolean bool) {
		return bool ? "ON" : "OFF";
	}

	/**
	 * Returns ○ if b is true, × if b is false
	 * @param b Boolean variable to be checked
	 * @return ○ if b is true, × if b is false
	 */
	public static String getOorX(boolean b) {
		if(b == true) return "c";
		return "e";
	}

	/**
	 * Get date and time from a Calendar
	 * @param calendar Calendar
	 * @return Date and Time String
	 */
	public static String getDateAndTime(Calendar calendar) {
		if (calendar == null) throw new IllegalArgumentException("The calendar object supplied is null.");
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dfm.format(calendar.getTime());
	}

	/**
	 * Export a Calendar to a String for saving/sending. TimeZone is always GMT. Time is based on current time.
	 * @return Calendar String (Each field is separated with a hyphen '-')
	 */
	public static String exportCalendarString() {
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		return exportCalendarString(c);
	}

	/**
	 * Export a Calendar to a String for saving/sending. TimeZone is always GMT.
	 * @param c Calendar
	 * @return Calendar String (Each field is separated with a hyphen '-')
	 */
	public static String exportCalendarString(Calendar c) {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		dfm.setTimeZone(TimeZone.getTimeZone("GMT"));
		return dfm.format(c.getTime());
	}

	/**
	 * Create a Calendar by using a String that came from exportCalendarString. TimeZone is always GMT.
	 * @param s String (Each field is separated with a hyphen '-')
	 * @return Calendar (null if fails)
	 */
	public static Calendar importCalendarString(String s) {
		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		dfm.setTimeZone(TimeZone.getTimeZone("GMT"));

		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

		try {
			Date date = dfm.parse(s);
			c.setTime(date);
		} catch (Exception e) {
			return null;
		}

		return c;
	}

	/**
	 * Get the number of piece types can appear
	 * @param pieceEnable Piece enable flags
	 * @return Number of piece types can appear (In the normal Tetromino games, it returns 7)
	 */
	public static int getNumberOfPiecesCanAppear(boolean[] pieceEnable) {
		if(pieceEnable == null) return Piece.PIECE_COUNT;

		int count = 0;

		for(int i = 0; i < pieceEnable.length; i++) {
			if(pieceEnable[i]) count++;
		}

		return count;
	}

	/**
	 * Returns true if enabled piece types are S,Z,O only.
	 * @param pieceEnable Piece enable flags
	 * @return <code>true</code> if enabled piece types are S,Z,O only.
	 */
	public static boolean isPieceSZOOnly(boolean[] pieceEnable) {
		if(pieceEnable == null) return false;

		for(int i = 0; i < pieceEnable.length; i++) {
			if((pieceEnable[i] == true) && (i != Piece.PIECE_S) && (i != Piece.PIECE_Z) && (i != Piece.PIECE_O))
				return false;
		}

		return true;
	}

	/**
	 * Create piece ID array from a String
	 * @param strSrc String
	 * @return Piece ID array
	 */
	public static int[] createNextPieceArrayFromNumberString(String strSrc) {
		int len = strSrc.length();
		if(len < 1) return null;

		int[] nextArray = new int[len];
		for(int i = 0; i < len; i++) {
			int pieceID = Piece.PIECE_I;

			try {
				pieceID = Integer.parseInt(strSrc.substring(i, i + 1));
			} catch (NumberFormatException e) {}

			if((pieceID < 0) || (pieceID >= Piece.PIECE_COUNT)) pieceID = Piece.PIECE_I;

			nextArray[i] = pieceID;
		}

		return nextArray;
	}

	/**
	 * Load rule file
	 * @param filename Filename
	 * @return RuleOptions
	 */
	public static RuleOptions loadRule(String filename) {
		CustomProperties prop = new CustomProperties();

		try {
			FileInputStream in = new FileInputStream(filename);
			prop.load(in);
			in.close();
		} catch (Exception e) {
			log.warn("Failed to load rule from " + filename, e);
		}

		RuleOptions ruleopt = new RuleOptions();
		ruleopt.readProperty(prop, 0);

		return ruleopt;
	}

	/**
	 * Load Randomizer
	 * @param filename Classpath of the randomizer
	 * @return Randomizer (null if something fails)
	 */
	public static Randomizer loadRandomizer(String filename) {
		Class<?> randomizerClass = null;
		Randomizer randomizerObject = null;

		try {
			randomizerClass = Class.forName(filename);
			randomizerObject = (Randomizer) randomizerClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			log.warn("Failed to load Randomizer from " + filename, e);
		}

		return randomizerObject;
	}

	/**
	 * Load Wallkick
	 * @param filename Classpath of the wallkick
	 * @return Wallkick (null if something fails)
	 */
	public static Wallkick loadWallkick(String filename) {
		Class<?> wallkickClass = null;
		Wallkick wallkickObject = null;

		try {
			wallkickClass = Class.forName(filename);
			wallkickObject = (Wallkick) wallkickClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			log.warn("Failed to load Wallkick from " + filename, e);
		}

		return wallkickObject;
	}

	/**
	 * Load AI
	 * @param filename Classpath of the AI
	 * @return The instance of AI (null if something fails)
	 */
	public static DummyAI loadAIPlayer(String filename) {
		Class<?> aiClass = null;
		DummyAI aiObject = null;

		try {
			aiClass = Class.forName(filename);
			aiObject = (DummyAI) aiClass.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			log.warn("Failed to load AIPlayer from " + filename, e);
		}

		return aiObject;
	}
	
	/**
	 * Combine an array of strings into one string with separation
	 * @param strings Array of strings
	 * @param separator String that will be placed between strings
	 * @param startIndex Start index for string combination
	 * @return A string of the combined strings
	 */
	public static String combineStrings(String[] strings, String separator,
			int startIndex)
	{
		if (strings == null) throw new IllegalArgumentException("The provided string array is null.");
		if (strings.length == 0) throw new IllegalArgumentException("The provided string array is empty");
		if (separator == null) throw new IllegalArgumentException("The provided separator is null");
		if (startIndex < 0) throw new IllegalArgumentException("The start index cannot be negative");
		if (startIndex > strings.length) throw new ArrayIndexOutOfBoundsException("The start index is higher than the size of the string array");
		
		String combinedString = "";
		for (int i = startIndex; i < strings.length; i++) {
			combinedString += strings[i];
			if (i != strings.length-1) combinedString += separator;
		}
		
		return combinedString;
	}

	/**
	 * Validates the date format of a string
	 * @param format the format that is going to be compared against
	 * @param toValidate the date formatted string that is to be validated
	 * @return true if the date format is valid, false otherwise
	 */
	public static boolean validateDateFormat(String format, String toValidate) {
		if (format == null) throw new IllegalArgumentException("Format provided is null.");
		if (toValidate == null) throw new IllegalArgumentException("String to validate is null.");
		DateFormat formatter = new SimpleDateFormat(format);
		formatter.setLenient(false);
		try {
			formatter.parse(toValidate);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}
}
