package mgmt;

import java.util.ArrayList;

public class STAPM {
	private ArrayList<Item> items = new ArrayList<Item>();
//	items.add("");
//	items.add("");
//	items.add("");
	
	public STAPM() {
		
	}
	
	public static void main(String args[]) {
		STAPM s = new STAPM();
	}
	
	public void addStock(String name, int quantity, double price,String manufacturer, 
			boolean taxable, String date)
	{
		Item e = new Item(name,quantity,price,manufacturer, taxable);
		e.setDate(date);
		this.items.add(e);
	}
	
	public Item search(String itemName,ArrayList<Item> items )
	{
		for(Item i:items) {
			if(i.getItemName().equalsIgnoreCase(itemName)) {
				return i;
			}
		}
		return null;
	}
}

