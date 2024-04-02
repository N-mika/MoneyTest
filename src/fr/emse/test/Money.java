package fr.emse.test;

public class Money implements IMoney{
	private int fAmount;
	private String fCurrency;
	public IMoney add(IMoney m) {
		return m.addMoney(this);
		}
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}


	public int amount() {
		return fAmount;
	}
	public String currency() {
	return fCurrency;
	}

	public Object add(Money m) {
		if (m.currency().equals(currency()))
			return new Money(amount() + m.amount(), currency());
		return new MoneyBag(this, m);
	}
	@Override
	public IMoney addMoney(Money money) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IMoney addMoneyBag(MoneyBag moneyBag) {
		// TODO Auto-generated method stub
		return null;
	}
}
