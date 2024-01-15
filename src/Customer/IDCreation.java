package Customer;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.StringTokenizer;
	public class IDCreation {
		String id;
		public String FileReader() {
			BufferedReader br;
			FileReader fr;
			StringTokenizer st;
			String data;
			try {
			     fr = new FileReader("ID.txt");
			     br = new BufferedReader(fr);
			     data = br.readLine();
					while(data != null) {
						st = new StringTokenizer(data);
						while(st.hasMoreElements()) {
							id = st.nextToken();
						}
						data = br.readLine();
					}
	        fr.close();
	        br.close();
	        } 
			catch (Exception e) {
				 e.printStackTrace();
				 }
			return id ;
	}
		public String RandomId() {

			int intId = Integer.parseInt(FileReader());
			intId++;
			id = Integer.toString(intId);
			return id;
		}
		public void updateId() {
			FileWriter fw;
			try {
				fw = new FileWriter("ID.txt");
				RandomId();
				fw.write(id);
				fw.close();
				} catch (Exception e) {
						e.printStackTrace();
				}
		}
	}


