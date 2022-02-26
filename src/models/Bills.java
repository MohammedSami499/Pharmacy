package models;

public class Bills {
	
	private int billNumber;
	private int billValue;
	private String billDate;
	
	public Bills() {
		
	}

	public Bills(int billNumber, int billValue, String billDate) {
		super();
		this.billNumber = billNumber;
		this.billValue = billValue;
		this.billDate = billDate;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public int getBillValue() {
		return billValue;
	}

	public void setBillValue(int billValue) {
		this.billValue = billValue;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
	
	
}
