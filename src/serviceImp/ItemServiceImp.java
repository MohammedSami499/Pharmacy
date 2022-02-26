package serviceImp;

import java.util.ArrayList;

import models.Items;
import service.ItemService;

public class ItemServiceImp implements ItemService {

	ArrayList<Items> items ;
	
	public ItemServiceImp() {
		items = new ArrayList<>();
	}
	
	@Override
	public void addItem(Items item) {
		items.add(item);
		
	}

	@Override
	public void deleteItem(int id) {
		items.remove(id);
		
	}

	@Override
	public int totalNumberOfItems() {
		return items.size();
	}

}
