package Signup;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import Customer.IDCreation;
public class CustomerSignup {
	DisplayId idDis = new DisplayId();
	public void Signup() {
		BufferedReader br;
		FileWriter fw;
//		
		try {
			fw = new FileWriter("MasterFile.txt",true);
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Your Name : ");
			String name = br.readLine();
			System.out.print("Enter Deposit Amount : ");
			String bal = br.readLine();
			System.out.print("Enter Your Mobile Number : ");
			String mobNo = br.readLine();
			System.out.println("-------------------------------------------------------------");

			IDCreation ranId = new IDCreation() ;
			int id= Integer.parseInt(ranId.FileReader());
			ranId.updateId();

			fw.write(id+"");
			fw.write("#");
			fw.write(name);
			fw.write("#");
			fw.write(bal);
			fw.write("#");
			fw.write(mobNo);
			fw.write("\n");
			fw.close();
//			br.close();

			idDis.idDisplay();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
