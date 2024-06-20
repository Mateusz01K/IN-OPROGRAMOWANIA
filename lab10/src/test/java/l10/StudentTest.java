package l10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	Student testowy;

	@Before
	public void setUp() throws Exception {
		testowy = new Student("Marta", "Nowakowska", "w12345", 6, "informatyka");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStudent() {
		testowy.setImie("Klaudia");
		assertEquals("Klaudia", testowy.getImie());
	}

}
