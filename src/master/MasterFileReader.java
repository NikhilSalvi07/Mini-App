package master;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class MasterFileReader {
	public void FileReader() {
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
					String id = st.nextToken();
					String name = st.nextToken();
					String balance = st.nextToken();
					String mobNo = st.nextToken();
					System.out.println(id+"#"+name+"#"+balance+"#"+mobNo);
				}
				data = br.readLine();
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}