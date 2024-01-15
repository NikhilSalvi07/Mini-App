package Signin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Transaction.Menu;

public class CustomerSignIn {
	Menu me = new Menu();
	public String idcap;
	String id1;
	String name1;
	String id2;
	String name2;
	public void Signin() {
		BufferedReader br;
		FileReader fr;
		StringTokenizer st;
		String data ;
		boolean valid = false;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Your Id : ");
			id1 = br.readLine();
			System.out.print("Enter Your Name : ");
			name1 = br.readLine();	

			fr =new FileReader("MasterFile.txt");
			br = new BufferedReader(fr); 
			data = br.readLine();
			boolean found = false;
			while(data != null) {
				st = new StringTokenizer(data,"#");
				id2 = st.nextToken();
				name2 = st.nextToken();
				if(id1.equals(id2) && name1.equals(name2)) {
					System.out.println("Welcome Back.");
					me.transMenu();
					found = true;
					valid = true;
					idcap = id2;
					break;
				}
				data = br.readLine();
			}
     		if(!found) {
			System.out.println("Invalid Details.Please Try again.");
			Signin();
     		}
			br.close();
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}