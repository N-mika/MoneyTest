package fr.emse.test;

import org.junit.Test;

public class MoneyBagTest {
	@Test
	public void testBagEquals(Object fMB1, Object f12CHF, Object fMB2) {
		assertTrue();
		assertEquals();
		assertTrue();
		assertTrue();
		assertTrue();
	};

	@Before
	public void setUp() {
		Money f12CHF = new Money(12, "CHF");
		Money f14CHF = new Money(14, "CHF");
		Money f7USD = new Money(7, "USD");
		Money f21USD = new Money(21, "USD");
		new MoneyBag(f12CHF, f7USD);
		new MoneyBag(f14CHF, f21USD);
	}

	private void assertEquals() {
		// TODO Auto-generated method stub

	}

	private void assertTrue() {
		// TODO Auto-generated method stub

	}
}
