package mu.nu.nullpo.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class GeneralUtilTest {

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
		boolean bool = true;
		assertEquals("ON", GeneralUtil.getONorOFF(bool));
	}
}
