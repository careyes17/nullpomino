package mu.nu.nullpo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class GeneralUtilTest {

	@Test
	void dateFormatValidatorValidatesCorrectFormat() {
		String format = "yyyy-MM-dd";
		String toValidate = "1970-01-01";
		assertTrue(GeneralUtil.validateDateFormat(format, toValidate));
	}

	@Test
	void dateFormatValidatorDoesNotValidateIncorrectFormat() {
		String format = "yyyy-MM-dd";
		String toValidate = "1970/01/01";
		assertFalse(GeneralUtil.validateDateFormat(format, toValidate));
	}

	@Test
	void IllegalArgumentExceptionIfFormatIsNull() {
		String format = null;
		String toValidate = "1970/01/01";
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.validateDateFormat(format, toValidate);
		});
	}

	@Test
	void IllegalArgumentExceptionIfToValidateIsNull() {
		String format = "yyyy-MM-dd";
		String toValidate = null;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.validateDateFormat(format, toValidate);
		});
	}

	@Test
	void correctDateAndTimeShouldBeReturned() {
		Calendar calendar = mock(Calendar.class);
		Long testMilliseconds = 0l;
		when(calendar.getTime()).thenReturn(new Date(testMilliseconds));
		
		String expectedFormat = "yyyy-MM-dd HH:mm:ss";
		String actualFormatted = GeneralUtil.getDateAndTime(calendar);
		assertTrue(GeneralUtil.validateDateFormat(expectedFormat, actualFormatted));
	}

	@Test
	void throwsIllegalArgumentExceptionIfCalendarIsNull() {
		Calendar calendar = null;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.getDateAndTime(calendar);
		});
	}

	@Test
	void stringsShouldBeCombined() {
		String[] strings = { "test1", "test2", "test3" };
		String separator = ", ";
		int startIndex = 1;
		String underTest = GeneralUtil.combineStrings(strings, separator, startIndex);
		assertEquals("test2, test3", underTest);
	}

	@Test
	void aStringShouldBeReturnedWithoutSeparator() {
		String[] strings = { "test1" };
		String separator = ", ";
		int startIndex = 0;
		String underTest = GeneralUtil.combineStrings(strings, separator, startIndex);
		assertEquals("test1", underTest);
	}

	@Test
	void anEmptyStringIsReturnedWhenStartIndexEqualsStringArrayLength() {
		String[] strings = { "test1" };
		String separator = ", ";
		int startIndex = 1;
		String underTest = GeneralUtil.combineStrings(strings, separator, startIndex);
		assertEquals("", underTest);
	}

	@Test
	void throwsIllegalArgumentExceptionIfStringArrayIsNull() {
		String[] strings = null;
		String separator = ", ";
		int startIndex = 0;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.combineStrings(strings, separator, startIndex);
		});
	}

	@Test
	void throwsIllegalArgumentExceptionIfStringArrayIsEmpty() {
		String[] strings = {};
		String separator = ", ";
		int startIndex = 0;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.combineStrings(strings, separator, startIndex);
		});
	}

	@Test
	void throwsIllegalArgumentExceptionIfSeparatorIsNull() {
		String[] strings = { "test1", "test2", "test3" };
		String separator = null;
		int startIndex = 0;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.combineStrings(strings, separator, startIndex);
		});
	}

	@Test
	void throwsIllegalArgumentExceptionIfStartIndexIsBelowZero() {
		String[] strings = { "test1", "test2", "test3" };
		String separator = ", ";
		int startIndex = -1;
		assertThrows(IllegalArgumentException.class, () -> {
			GeneralUtil.combineStrings(strings, separator, startIndex);
		});
	}

	@Test
	void throwsArrayIndexOutOfBoundsExceptionWhenStartIndexIsGreaterThanStringArrayLength() {
		String[] strings = { "test1", "test2", "test3" };
		String separator = ", ";
		int startIndex = 4;
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			GeneralUtil.combineStrings(strings, separator, startIndex);
		});
	}

	@Test
	void returnsOnForTrue() {
		boolean bool = true;
		assertEquals("ON", GeneralUtil.getONorOFF(bool));
	}

	@Test
	void returnsOffForFalse() {
		boolean bool = false;
		assertEquals("OFF", GeneralUtil.getONorOFF(bool));
	}
}
