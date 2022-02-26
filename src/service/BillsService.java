package service;

import models.Bills;

public interface BillsService {
	
	public void createBill(Bills bill);
	
	public String editBill(int id , Bills bill);
	
	public void removeBill(int id);

}
