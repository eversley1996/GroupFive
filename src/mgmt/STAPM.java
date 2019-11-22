package mgmt;

import java.io.*;
import java.util.ArrayList;

/**
 * This class represents Steer Town Auto Parts 
 * @author GroupFive
 * @version 1.0
 */

public final class STAPM implements Serializable {
	private static final long serialVersionUID = 1L;
	private static ArrayList<Item> items = new ArrayList<Item>();
	private static ArrayList<User> users = new ArrayList<User>();
	private String name;
	private User currentUser; // We will use this for access control

	/* E.g, if (currentUser.getUserType == User.OWNER){
				write code to get financial report
			else{
				tell the user they dont haver permission
			}
	}
	*/

	public STAPM() {
		this.name =  "Steer Town Auto Parts";
	}

	public String search(String itemName)
	{	String result = "";
		for(Item i:items) {
			if(i.getItemName().contains(itemName)) {
				result+= i.toString() + "\n"; //Because multiple items may have same substring
			}
		}
		if(result.equals("")){
			return "Item not found";
		}
		return result;
	}

	public String stockList(){
		String result = "";
		for (Item i: items){
			result += i.toString() + "\n";
		}
		return result;
	}

	public static ArrayList<Item> getAllItems(){
		return items;
	}

	//Haven't figured this out yet
	public String genFinReport(User currentUser){
		if (currentUser.getUserType.equals(UserType.Manager)){
			return "You do not have permission to access this feature";
		}else{
			//write code to display report
		}
	}

	public String addUser(User user, String username, String password, UserType userType){
		if(user.getUserType.equals(UserType.Manager)){
			return "You do not have permision to add users";
		}else{
			User newUser = new User(username, password, userType);
			users.add(newUser);
			return "User added successfully.";
		}
	}

	public String removeUser(User user, int idNum){
		if(user.getUserType.equals(UserType.Manager)){
			return "You do not have permission to remove users";
		}else{
			ArrayList<User> toRemove = new ArrayList<User>();
			for(User u: users){
				if( u.getUserID == idNum){
					toRemove.add(u);
				}
			}

			users.removeAll(toRemove);
			return "User removed successfully";
		}
	}

	public String getName(){
		return name;
	}
}

