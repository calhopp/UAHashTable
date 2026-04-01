package hashTable;

public class UAEntry {
	String word;
	int termID;
	int docCount = -1;
	int start = -1;
	
	public UAEntry(String word, int termID) {
		this.word = word;
		this.termID = termID;
		this.docCount = -1;
		this.start = -1;
	}
	
	public String toString() {
		return String.format("%-40s %-10d %-10d %-10d %n", word, termID, docCount, start);
	}
}
