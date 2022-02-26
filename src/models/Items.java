package models;



public class Items {

	private String itemName;
	private ItemCategories Category;
	private int totalItemsInStock;
	
	
	public Items() {
		super();
	}

	public Items(String itemName, ItemCategories category, int totalItemsInStock) {
		super();
		this.itemName = itemName;
		Category = category;
		this.totalItemsInStock = totalItemsInStock;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemCategories getCategory() {
		return Category;
	}

	public void setCategory(ItemCategories category) {
		Category = category;
	}

	public int getTotalItemsInStock() {
		return totalItemsInStock;
	}

	public void setTotalItemsInStock(int totalItemsInStock) {
		this.totalItemsInStock = totalItemsInStock;
	}
	
	
	
	
}
