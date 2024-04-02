package fr.emse.test;

import java.util.Vector;

public class MoneyBag implements IMoney{
	private Vector<Money> fMonies = new Vector<Money>();
	MoneyBag(Money m1, Money m2) {
	appendMoney(m1);
	appendMoney(m2);
	}
	public IMoney add(IMoney m) {
		return m.addMoneyBag(this);
		}
	MoneyBag(Money bag[]) {
	for (int i = 0; i < bag.length; i++)
	appendMoney(bag[i]);
	}

	private void appendMoney(Money m) {
		if (fMonies.isEmpty()) {
			fMonies.add(m);
		} else {
			int i = 0;
			while ((i < fMonies.size()) && (!(fMonies.get(i).currency().equals(m.currency()))))
				i++;
			if (i >= fMonies.size()) {
				fMonies.add(m);
			} else {
				fMonies.set(i, new Money(fMonies.get(i).amount() + m.amount(), m.currency()));
			}
		}
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
