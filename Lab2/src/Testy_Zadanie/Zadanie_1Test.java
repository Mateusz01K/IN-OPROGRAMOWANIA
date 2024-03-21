package Testy_Zadanie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Zadanie_1Test {
	Zadanie_1 testowy;

	@BeforeEach
	void setUp() throws Exception {
		testowy = new Zadanie_1();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSzuk() {
		assertEquals(1, testowy.szuk(new int[] {1,2,3,4}, 2));
		assertEquals(2, testowy.szuk(new int[] {2,2,3,4}, 2));
		assertEquals(-3, testowy.szuk(new int[] {-1,-3,-5,-11}, -3));
		assertEquals(3, testowy.szuk(new int[] {1,2,3,4}, 4));
		assertEquals(4, testowy.szuk(new int[] {1,2,3,4}, 5));
		assertEquals(0, testowy.szuk(new int[] {}, 0));
		
		try {
			testowy.szuk(null, 0);
			fail("wyjatek null nie jest obsluzony");
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("Wyjatek null jest obsluzony");
		}
		
		try {
			testowy.szuk(new int[] {}, 0);
			fail("wyjatek pustej tablicy nie jest obsluzony");
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("Wyjatek pustej tablicy jest obsluzony");
		}
	}

}
