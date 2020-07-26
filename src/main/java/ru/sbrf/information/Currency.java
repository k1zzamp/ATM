package ru.sbrf.information;

public class Currency
{
	private CurrencyType type;

	Currency(CurrencyType type)
	{
		this.type = type;
	}

	public CurrencyType getType()
	{
		return type;
	}

	public void setType(CurrencyType type)
	{
		this.type = type;
	}
}
