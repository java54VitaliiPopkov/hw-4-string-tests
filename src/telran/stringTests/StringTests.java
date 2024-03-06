package telran.stringTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		String world = " World";
		String expected = "Hello World";

		String result = hello.concat(world);

		assertEquals(expected, result);
	}

	@Test
	void concatTestEmptyString() {
		String str1 = "";
		String str2 = "";
		String expected = "";

		String result = str1.concat(str2);

		assertEquals(expected, result);
	}

	@Test
	void concatTestWithOneEmptyString() {
		String str1 = "Hello";
		String str2 = "";
		String expected = "Hello";

		String result = str1.concat(str2);

		assertEquals(expected, result);
	}

	@DisplayName("test of the method compareTo")
	@Test
	void compareToTest() {
		String st1 = "Hello";
		String st2 = "Hello";
		String st3 = "TelRan";

		assertEquals(0, st1.compareTo(st2));
		assertTrue(st1.compareTo(st3) < 0);
		assertFalse(st3.compareTo(st1) < 0);

	}

	@DisplayName("test of the method compareToIgnoreCase")
	@Test
	void compareToIgnoreCaseTest() {
		String st1 = "hello";
		String st2 = "Hello";
		String st3 = "telRan";

		assertEquals(0, st1.compareToIgnoreCase(st2));
		assertTrue(st1.compareToIgnoreCase(st3) < 0);
		assertFalse(st3.compareToIgnoreCase(st1) < 0);

	}

	@DisplayName("test of the method startsWith")
	@Test
	void startsWithTest() {
		String str = "Hello World";

		assertTrue(str.startsWith("Hello"));
		assertFalse(str.startsWith("World"));
		assertTrue(str.startsWith(""));

//		System.out.println(str);
//	    assertFalse(str.startsWith("", 1));  //!!!Why actual is true????

		assertTrue(str.startsWith("Hello", 0));
		assertFalse(str.startsWith("World", 0));
		assertTrue(str.startsWith("World", 6));
		assertFalse(str.startsWith("Hello", 6));
	}

	@DisplayName("test of the method endsWith")
	@Test
	void endsWithTest() {
		String str = "Hello World";

		assertTrue(str.endsWith("World"));
		assertFalse(str.endsWith("Hello"));
		assertTrue(str.endsWith(""));
		assertFalse(str.endsWith("world"));
		assertFalse(str.endsWith("World "));
		assertTrue("".endsWith(""));

	}

	@DisplayName("test of the method equalsIgnoreCase")
	@Test
	void equalsIgnoreCaseTest() {
		String str1 = "Hello";
		String str2 = "HELLO";
		String str3 = "World";

		assertTrue(str1.equalsIgnoreCase(str2));
		assertFalse(str1.equalsIgnoreCase(str3));

	}

	@DisplayName("test of the method IndexOf")
	@Test
	void IndexOfTest() {
		String str = "Hello World";

		assertEquals(6, str.indexOf("World"));
		assertEquals(-1, str.indexOf("TelRan"));
		assertEquals(0, str.indexOf("Hello"));

	}

	@DisplayName("test of the method LastIndexOfTest")
	@Test
	void ILastIndexOfTestTest() {
		String str = "Hello World";

		assertEquals(7, str.lastIndexOf('o'));
		assertEquals(-1, str.lastIndexOf("m"));
		assertEquals(10, str.lastIndexOf("d"));

	}
}
