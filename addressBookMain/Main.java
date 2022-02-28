package addressBookMain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("----------Phone Book-----------");
		Scanner sc = new Scanner(System.in);
		AddressBookServices add = new AddressBookServices();				//created objects
		while (true) {					
			System.out.println("Enter to avail services: ");
			System.out.println(
					"\n1: To add contact \n 2: To edit existing contact \n 3: To delete contact \n 4: To display contact list \n 5: To Exit");

			int choices = sc.nextInt();

			switch (choices) {
			case 1:
				add.addContact();
				break;
			case 2:
				add.edit();
				break;
			case 3:
				add.delete();
				break;
			case 4:
				add.displayContact();
				break;
			case 5:
				sc.close();
				return;
			}
		}

	}
}