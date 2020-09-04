package com.company.Validation;

import org.junit.jupiter.api.Test;

import static com.company.Validation.ValidationApplication.checkEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidationApplicationTests {

	@Test
	void testCheckEqualsforNullandEmpty() {
		assertEquals(false, checkEquals(null, ""));
	}

	@Test
	void testCheckEqualsforEmptyandEmpty() {
		assertEquals(true, checkEquals("", ""));
	}

	@Test
	void testCheckEqualsforSpaceAndEmpty() {
		assertEquals(false, checkEquals(" ", ""));
	}

	@Test
	void testCheckEqualsforEqualValue() {
		assertEquals(true, checkEquals("hello", "hello"));
	}

	@Test
	void testCheckEqualsfornotEqualValue() {
		assertEquals(false, checkEquals("Hello", "hello"));
	}

}
