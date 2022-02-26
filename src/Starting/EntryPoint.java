package Starting;


import models.Bills;
import models.Clients;
import models.Gender;
import models.ItemCategories;
import models.Items;
import models.Vendors;
import serviceImp.BillsServiceImp;
import serviceImp.ClientServiceImp;
import serviceImp.ItemServiceImp;
import serviceImp.VendorServiceImp;

public class EntryPoint {

	public static void main(String[] args) {
		
		BillsServiceImp billImp = new BillsServiceImp();
		
		billImp.createBill(new Bills(1, 100, "15/2/2021"));
		billImp.createBill(new Bills(2, 250, "16/2/2021"));
		billImp.createBill(new Bills(3, 340, "17/2/2021"));
		billImp.createBill(new Bills(4, 120, "18/2/2021"));
		
		ClientServiceImp clientImp = new ClientServiceImp();
		clientImp.addClient(new Clients("Mohammed Sami" ,  22, 1069484817 , "15/2/2021" , Gender.MALE , 1));
		clientImp.addClient(new Clients("Mohammed Hosny" ,  12, 1069484817 , "16/2/2021" , Gender.MALE , 2));
		clientImp.addClient(new Clients("Eslam Khafagt" ,  30, 1069484817 , "10/2/2021" , Gender.MALE , 3));
		clientImp.addClient(new Clients("Farouk Hatem" ,  18, 1069484817 , "5/2/2021" , Gender.MALE , 4));
		clientImp.addClient(new Clients("Saeed Ahmed" ,  9, 1069484817 , "8/2/2021" , Gender.MALE , 5));
		
		
		ItemServiceImp itemImp = new ItemServiceImp();
		itemImp.addItem(new Items("Revoo", ItemCategories.HEADACH , 15));
		itemImp.addItem(new Items("Cital", ItemCategories.HEAT , 22));
		itemImp.addItem(new Items("Chiclote", ItemCategories.STOMACH , 450));
		itemImp.addItem(new Items("Anything", ItemCategories.BONES , 150));
		itemImp.addItem(new Items("New Medicine", ItemCategories. HEAT , 50));
		
		
		VendorServiceImp vendorImp = new VendorServiceImp();
		vendorImp.addVendor(new Vendors("Eslam", 12, 2212, 1277067844, Gender.MALE));
		vendorImp.addVendor(new Vendors("Ahmed", 25, 56356, 1277067844, Gender.MALE));
		vendorImp.addVendor(new Vendors("Sami", 17, 5688, 1277067844, Gender.MALE));
		vendorImp.addVendor(new Vendors("Hani", 31, 38768, 1277067844, Gender.MALE));
		vendorImp.addVendor(new Vendors("Happy", 9, 78454, 1277067844, Gender.MALE));
		
		
		Clients cli = clientImp.searchClient(3);
		System.out.println(cli.getName() +" , "+ cli.getAge() +" , "+ cli.getPhoneNo() +" , "+ cli.getLastVisit() + " , "+cli.getGender() );
		
		clientImp.showAllData();
		
	}
	
}
