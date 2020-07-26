package ru.sbrf.information;

public class Bank
{
	private String bankTitle;
	private int bankId;

	public Bank(String bankTitle, int bankId)
	{
		this.bankTitle = bankTitle;
		this.bankId = bankId;
	}

	public String getBankTitle()
	{
		return bankTitle;
	}

	public void setBankTitle(String bankTitle)
	{
		this.bankTitle = bankTitle;
	}

	public int getBankId()
	{
		return bankId;
	}

	public void setBankId(int bankId)
	{
		this.bankId = bankId;
	}
}
