package updateMobNum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Signin.CustomerSignIn;

public class MobileNumber {
	CustomerSignIn csi = new CustomerSignIn();
	public void UpMobNum(){
		BufferedReader br;
		FileReader fr;
		FileWriter fw;
		StringTokenizer st;
		String data;
		String custId = csi.idcap;

		try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter the new Mobile Number : ");
				String num = br.readLine();
	            fr = new FileReader("MasterFile.txt");
	            br = new BufferedReader(fr);
	            String Update = "";
	            data = br.readLine();
	           while (data != null) {
	                st = new StringTokenizer(data, "#");
	                String id = st.nextToken();
	                String name = st.nextToken();
	                String bal = st.nextToken();
	                String mobNo = st.nextToken();
	                long mobNumber = Long.parseLong(mobNo);
	                System.out.print("Your Previous Mobile Number was : ");
	                System.out.println(mobNo);
	                if (Integer.parseInt(id) == Integer.parseInt(custId)) {
	                    mobNumber = Long.parseLong(num);
	                    mobNo = String.valueOf(mobNumber);
	                    }
	                    Update += id + "#" + name + "#" + bal + "#" + mobNo + "\n";                 
	                    data = br.readLine();
	                System.out.print("Your Updated Mobile Number is : ");
	                System.out.println(mobNo);
	           }
	            br.close();
	            fw = new FileWriter("MasterFile.txt");
	            fw.write(Update);
	            fw.close();
	            br.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	}
}