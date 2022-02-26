package serviceImp;

import java.util.ArrayList;

import models.Vendors;
import service.VendorService;

public class VendorServiceImp implements VendorService {

	ArrayList<Vendors> vendors ;
	
	public VendorServiceImp() {
		vendors = new ArrayList<>();
	}
	
	@Override
	public void addVendor(Vendors vendor) {
		vendors.add(vendor);
		
	}

	@Override
	public void removeVendor(int id) {
		vendors.remove(id);
		
	}

}
