package Transaction;

import java.util.Scanner;

import Home.HomePage;
import updateMobNum.MobileNumber;
public class Menu {
	public void transMenu(){
		HomePage hp = new HomePage();
		MobileNumber mb = new MobileNumber();
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		do{
		System.out.println("                     Transaction Menu");
		System.out.println("1. Deposit. ");
		System.out.println("2. Withdraw. ");
		System.out.println("3. Reports. ");
		System.out.println("4. Update Mobile No. ");
		System.out.println("5. Home. ");
		System.out.println("6. Exit the Application ");

		int opt = 0;
		System.out.println("Enter your Option : ");

	try {	
		opt = input.nextInt();

		switch(opt) {
		case 1:


		case 2:

		case 3:

		case 4:
			mb.UpMobNum();
			break;
		case 5:
			System.out.println("Returned To Home.");
			hp.home();
			exit = true;
			break;
		case 6:
			System.out.println("Thank You for using this Application.");
			System.out.println("Visit Again.");
			System.exit(0);
			break;
		 default:
             System.out.println("Invalid choice. Please enter a valid option.");
		}
	}catch(Exception e) {
		System.out.println("Invalid input. Please enter a number.");    
	}
	}while(!exit);
		input.close();
	}
}

