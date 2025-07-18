package utils;
import java.util.Random;
public class TestDataGenerator {
	static Random rand=new Random();
	public static String getFirstNameRandomly() {
		String [] firstNames= {"Ahmad","Mohammad","Ali","Omar"};
		int firstNamesIndex=rand.nextInt(firstNames.length);
		return firstNames[firstNamesIndex];
	}
	public static String getLastNameRandomly() {
		String []lastNames= {"Allan","Alzboun","Arshed","Almoqdad"};
		int lastNamesIndex=rand.nextInt(lastNames.length);
		return lastNames[lastNamesIndex];
	}
	public static String getEmailRandomly(String firstName ,String lastName) {
		return firstName +lastName +rand.nextInt(10000)+"@gmail.com";
	}
	public static String getPhoneNumberRnadomly() {
		String []phoneNumbers= {"0791314605","0791234567","0799887765","0776655410"};
		int phoneNumbersIndex=rand.nextInt(phoneNumbers.length);
		return phoneNumbers[phoneNumbersIndex];
	}
	public static String getFaxRnadomly() {
		String []fax= {"009987","1122334","66778","445566"};
		int faxIndex=rand.nextInt(fax.length);
		return fax[faxIndex];
	}
	public static String getLoginNameRandomly(String firstName,String lastName) {
		return firstName+lastName+rand.nextInt(10000);
	}
	public static String getPasswordRandomly() {
		String []password= {"Ahmad12345@","Mohammad12345@","12345@"};
		int passwordIndex=rand.nextInt(password.length);
		return password[passwordIndex];
	}
	public static String getItemsType() {
		String itemType[]= {"featured","latest","bestseller","special"};
		int itemTypeIndex=rand.nextInt(itemType.length);
		return itemType[itemTypeIndex];
	}
	
}
