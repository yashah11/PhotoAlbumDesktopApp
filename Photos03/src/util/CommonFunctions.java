/**
 * @author Yash Shah
 * @author Aaron Argueta
 */
package util;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.User;

 
public class CommonFunctions {
	
	/**
	 * Saves the data to UserData.dat
	 * 
	 * @param users
	 * the user list
	 */
	public static void saveData(ArrayList<User> users) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("data/UserData.dat");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(users);

			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
