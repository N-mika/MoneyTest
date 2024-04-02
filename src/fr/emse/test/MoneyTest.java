package fr.emse.test;
import static org.junit.Assert.*;
import org.junit.Test;

public class MoneyTest {
	@Test
	public void testSimpleAdd() {
		Money m12CHF = new Money(12, "CHF"); // création de données
		Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(26, "CHF");
		Money result = (Money) m12CHF.add(m14CHF); // exécution de la méthode testée
		assertTrue(expected.equals(result)); // comparaison
	}
	@Test
	public void testMixedSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(expected, f12CHF.add(f7USD));
	}

	@Before
	public void testEquals() {
		Money m12CHF = new Money(12, "CHF");
		Money m14CHF = new Money(14, "CHF");
		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF, m12CHF);
		assertEquals(m12CHF, new Money(12, "CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
	}
	private void assertEquals(Money m12chf, Money m12chf2) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(boolean equals) {
		// TODO Auto-generated method stub
		
	}
}