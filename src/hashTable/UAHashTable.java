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
		System.out.println(word);
		System.out.println(word.hashCode());
		for(int k = 0; k < entries.length; k++) {
			if(entries[(word.hashCode() + k) % entries.length] == null) {
				entries[(word.hashCode() + k) % entries.length] = new UAEntry(word, termID);
				termID++;
				return;
			} else if(entries[(word.hashCode() + k) % entries.length].word == word) {
				return;
			}
		}
		//Getting here is a failure state
		System.out.println("Failed to insert into map");
	}
	
	public UAEntry get(String word) {
		if(entries[(word.hashCode() )% entries.length] == null) //This is correct unless we delete files
			return null;
		for(int k = 0; k < entries.length; k++) {
			if(entries[(word.hashCode() + k) % entries.length].word == word) {
				return entries[(word.hashCode() + k) % entries.length];
			}
		}
		//We've searched the hash table and failed to find
		System.out.println("Failed to find " + word);
		return null;
	}
	
	public String toString() {
		String map;
		map = String.format("%-40s %-10s %-10s %-10s %n", "Term", "TermID", "DocCount", "Start");
		map += String.format("%-40s %-10s %-10s %-10s %n", "----------------------------------------", "----------", "----------", "----------");
		for(int i=0;i<entries.length;i++) {
			if (entries[i] == null) {
				map += String.format("%-40s %-10d %-10d %-10d %n", "Blank", -1, -1, -1);
			} else map += entries[i].toString();
		}
		return map;
	}
}
