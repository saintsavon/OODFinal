package UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Laptop.MSI;

public class factoryTest {
	

	@Test
	void testCost() {
		MSI msi = new MSI();
		double output_c = msi.cost();
		//Testing output
		assertEquals(849.99, output_c);
		
	}

}
