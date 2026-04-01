package hashTable;
import java.io.*;

public class UAManagaer {
	UAHashTable hashTable;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void readFile(String filepath) throws IOException{

		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr); 
		String[] line; 

		while(br.ready()){

			//line[0] = word // line[1] = term_id // line[2] = docCount 
 			line = br.readLine().split("\\s+"); 
			hashTable.set(line[0]);
		}

		br.close();

	}

	public void writeFile(String file) throws IOException{

		FileWriter fw = new FileWriter("Output.txt"); 
		fw.write(hashTable.toString());;
		fw.close();
	}

}
