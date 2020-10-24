package UnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Desktop.*;

class decoratorTest {
	
	String description = "Casual Browsing Desktop";

	@Test
	void test() {
		double brows = new BrowsingStation().cost();
		assertEquals(1000, brows);
		
		String description = new BrowsingStation().getDescription();
		assertEquals("Casual Browsing Desktop", description);
		
	}

}
