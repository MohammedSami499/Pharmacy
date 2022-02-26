package serviceImp;

import java.util.ArrayList;

import models.Bills;
import service.BillsService;
import service.PrintingData;

public class BillsServiceImp implements BillsService , PrintingData {

	ArrayList<Bills> bills;
	
	public BillsServiceImp() {
		bills = new ArrayList<Bills>() ;
	}
	
	@Override
	public void createBill(Bills bill) {
		
		bills.add(bill);
	}

	@Override
	public String editBill(int id, Bills bill) {
		
		bills.set(id, bill);
		
		return "updated";
	}

	@Override
	public void removeBill(int id) {
		bills.remove(id);
		
	}

	@Override
	public void showAllData() {

		for(Bills bill : bills) {
			System.out.println(bill.getBillNumber()+ " , "+bill.getBillValue() +" , " + bill.getBillDate() + " .");
		}
		
		
	}

	@Override
	public void showItemData(int id) {
		
		Bills cli = bills.get(id);
		System.out.println(cli.getBillNumber()+ " , "+cli.getBillValue() +" , " + cli.getBillDate() + " .");
		
	}

}
