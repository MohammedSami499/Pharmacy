package service;

import models.Items;

public interface ItemService {
	
	public void addItem(Items item);
	
	public void deleteItem(int id);
	
	public int totalNumberOfItems();
	
	
}
