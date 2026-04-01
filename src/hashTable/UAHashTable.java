package hashTable;

public class UAHashTable {
	UAEntry[] entries;
	int count;
	int termID;
	
	public UAHashTable(int length) {
		this.entries = new UAEntry[length];
		this.count = 0;
		this.termID = 0;
	}
	
	public void set(String word) {
		for(int k = 0; k < entries.length; k++) {
			if(entries[(word.hashCode() + k) % entries.length] == null) {
				entries[(word.hashCode() + k) % entries.length] = new UAEntry(word, termID);
			} else if(entries[(word.hashCode() + k) % entries.length] == null) {
				
			}
		}
	}
	
	public void get(String word) {
		
	}
}
