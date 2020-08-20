package by.htp.les10.entity;

public class Customer{
	private int id;
	private String FIO;
	private String addres;
	private int creditCardNumber;
	private int bankNumber;

	public Customer() {
		this.id = 0;
		this.FIO = "Anonymous";
		this.addres = "Unknown";
		this.creditCardNumber = 0;
		this.bankNumber = 0;
	}
	
	public Customer(int id, String FIO, String addres, int creditCardNumber, int bankNumber) {
		this.id = id;
		this.FIO = FIO;
		this.addres = addres;
		this.creditCardNumber = creditCardNumber;
		this.bankNumber = bankNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFIO() {
		return FIO;
	}

	public void setFIO(String fIO) {
		FIO = fIO;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(int bankNumber) {
		this.bankNumber = bankNumber;
	}

	@Override
	public String toString() {
		return "Customer " + FIO + ": id = " + id + ", addres = " + addres + ", creditCardNumber = " + creditCardNumber
				+ ", bankNumber = " + bankNumber;
	}

}
