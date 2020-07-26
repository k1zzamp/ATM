package ru.sbrf.information;

public class Account
{
	private Currency currency;
	private String firstName;
	private String lastName;
	private int id;
	private int balance;
	private Bank bank;

	public Account(CurrencyType type, String firstName, String lastName, int id, int balance, Bank bank)
	{
		this.currency = new Currency(type);
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.balance = balance;
		this.bank = bank;
	}

	public Currency getCurrency()
	{
		return currency;
	}

	public void setCurrency(Currency currency)
	{
		this.currency = currency;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public Bank getBank()
	{
		return bank;
	}

	public void setBank(Bank bank)
	{
		this.bank = bank;
	}
}
