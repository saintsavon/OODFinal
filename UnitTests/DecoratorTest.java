package UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Desktop.*;

class DecoratorTest {
	
	@Test
	void test() {
		double brows = new BrowsingStation().cost();
		assertEquals(1000, brows);
		
		double game = new GamingStation().cost();
		assertEquals(2000, game);
		
		double work = new WorkStation().cost();
		assertEquals(3000, work);
		
		String description = new BrowsingStation().getDescription();
		assertEquals("Casual Browsing Desktop", description);
		
		String description1 = new GamingStation().getDescription();
		assertEquals("High End Gaming Desktop", description1);
		
		String description2 = new WorkStation().getDescription();
		assertEquals("High End Work Station", description2);
		
	}

}
