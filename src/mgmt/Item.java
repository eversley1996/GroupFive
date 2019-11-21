package mgmt;

import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
	private String itemName;
	private int quantityInStock;
	private double price;
	private String manufacturer;
	private boolean taxable;
	private Date dateAdded;
	//private double taxRate; put in Sale so that everything gets taxed.
	
	public Item(String name, int qty, double price, String manufacturer, boolean taxable)
	{
		itemName = name;
		quantityInStock = qty;
		this.price=price;
		this.manufacturer=manufacturer;
		this.taxable=taxable;
	}
	public Item(String name, int qty, double price, String manufacturer, boolean taxable, Date date)
	{
		itemName = name;
		quantityInStock = qty;
		this.price=price;
		this.manufacturer=manufacturer;
		this.taxable=taxable;
		this.dateAdded = date;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		itemName = itemName;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDate(String date) {
	    String expectedPattern = "MM/dd/yyyy";
	    SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
	    try
	    {
	      String userInput = "09/22/2009";
	      this.dateAdded = formatter.parse(userInput);
	    }
	    catch (ParseException e)
	    {
	      e.printStackTrace();
	    }
	}
	
	
}



