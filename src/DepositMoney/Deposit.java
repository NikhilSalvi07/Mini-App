package DepositMoney;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.StringTokenizer;



	public class Deposit{
		double balance;
		public void DepAmt(double amt){
			BufferedReader br;
			FileReader fr;
			FileWriter fw;
			StringTokenizer st;
			String data;
			int customerId =101;


			try {
		            fr = new FileReader("MasterFile.txt");
		            br = new BufferedReader(fr);
		            String update = "";
		            data = br.readLine();

		           while (data != null) {
		                st = new StringTokenizer(data, "#");
		                String id = st.nextToken();
		                String name = st.nextToken();
		                String bal = st.nextToken();
		                String mobNo = st.nextToken();
		                double balance = Double.parseDouble(bal);

		                if (Integer.parseInt(id) == customerId) {
		                balance += amt;
		                bal = String.valueOf(balance);
		                }
		                update += id + "#" + name + "#" + bal + "#" + mobNo + "\n";
		                data = br.readLine();
		           }
		            br.close();
		            fw = new FileWriter("MasterFile.txt");
		            fw.write(update);
		            fw.close();

		        } catch (Exception e) {
		            e.printStackTrace();
		        }


		}


	}


