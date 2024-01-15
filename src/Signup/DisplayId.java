package Signup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
public class DisplayId {
	String id;
	public void idDisplay() {
			BufferedReader br;
			FileReader fr;
			StringTokenizer st;
			String data ;
			try {
				fr =new FileReader("MasterFile.txt");
				br = new BufferedReader(fr); 
				data = br.readLine();
				while(data != null) {
					st = new StringTokenizer(data,"#");
					while(st.hasMoreElements()) {
						id = st.nextToken();
						String name = st.nextToken();
						String balance = st.nextToken();
						String mobNo = st.nextToken();
					}
					data = br.readLine();
				}
				System.out.println("You Have Successfully Created your account.");
				System.out.print("Your Reference Id is : ");
				System.out.println(id);
//
//				br.close();
//				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}