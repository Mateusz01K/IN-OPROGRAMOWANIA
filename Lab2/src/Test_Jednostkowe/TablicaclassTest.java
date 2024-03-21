package Test_Jednostkowe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablicaclassTest {
	Tablica testowy;

	@BeforeEach
	void setUp() throws Exception {
		testowy=new Tablica();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMax() {
		assertEquals(-1, testowy.max(new int[] {-1, -5, -8, -10, -4}));
		assertEquals(5, testowy.max(new int[] {-1, 5, -8, -10, 4}));
		assertEquals(10, testowy.max(new int[] {-1, 5, -8, 10, 4}));
		assertEquals(4, testowy.max(new int[] {-1, -5, -8, -10, 4}));
		assertEquals(4, testowy.max(new int[] {4}));
		assertEquals(4, testowy.max(new int[] {4,4,4,4}));
		
		try {
			testowy.max(null);
			fail("wyjatek null nie jest obsluzony");
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("Wyjatek null jest obsluzony");
		}
		
		try {
			testowy.max(new int[] {});
			fail("wyjatek pustej tablicy nie jest obsluzony");
		}
		catch(IllegalArgumentException e)
		{
			System.err.println("Wyjatek pustej tablicy jest obsluzony");
		}
		
		
	}

}
