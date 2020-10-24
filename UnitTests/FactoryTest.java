package UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Laptop.MSI;
import Laptop.MacbookPro;

public class FactoryTest {
	

	@Test
	void testCost() {
		MSI msi = new MSI();
		double msi_c = msi.cost();
		assertEquals(849.99, msi_c);
		
		MacbookPro mp = new MacbookPro();
		double mp_c = mp.cost();
		assertEquals(1249.99, mp_c);
		
		// This tests both customerWantsCustomPart & getUserIput		
		boolean msi_cp = msi.customerWantsCustomPart();
		assertEquals(true, msi_cp);
		
		boolean mp_ac = mp.customerWantsAppleCare();
		assertEquals(true, mp_ac);
		
	}

}
