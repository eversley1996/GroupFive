package mgmt;

import java.io;
import java.util.ArrayList;


public final class STAPM {
	private ArrayList<Item> items = new ArrayList<Item>();
	private String name = "Steer Town Auto Parts";
	private User currentUser; // We will use this for access control

	/* E.g, if (currentUser.getUserType == User.OWNER){
				write code to get financial report
			else{
				tell the user they dont haver permission
			}
	}
	*/
	
	public STAPM() {
		
	}
	
	public void addStock(String name, int quantity, double price,String manufacturer, 
			boolean taxable, String date){
		Item stockItem = new Item(name,quantity,price,manufacturer, taxable);
		stockItem.setDate(date);
		this.items.add(stockItem);
	}
	
	/* 
	Here I think we accept a string, look throught the arraylist and print the toString() for the Item that matches,
	then return a string instead of an Item object
	*/
	public Item search(String itemName)
	{
		for(Item i:items) {
			if(i.getItemName().equalsIgnoreCase(itemName)) {
				return i; // return i.toString() instead
			}
		}
		return null; // return "Item not found" instead
	}

	public void addCurrentUSer(User user){
		this.currentUser = user;
	}
}

