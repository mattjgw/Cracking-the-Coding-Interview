
// Implement an algorithm to determine if a string has all unique 
// characters. What if you cannot use additional data structures?

public class isUnique {
	
	public static boolean withDataStructures(String word){
		// O(n); Works for ASCSII characters; not case sensitive
		if(word.length() > 128)
			return false;
		boolean characters[] = new boolean [128];
		for(int i = 0; i < characters.length; i++)
			characters[i] = true;
		for(int i = 0; i < word.length(); i++){
			if(!characters[word.charAt(i)])
				return false;
			characters[word.charAt(i)] = false;
		}
		return true;
	}
	
	public static boolean withoutDataStructures(String word){
		// O(n^2); Works for all characters; not case sensitive
		for (int i = 0; i < word.length() - 1; i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j))
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(withDataStructures("pythagoras"));
		System.out.println(withDataStructures("word"));
		System.out.println(withoutDataStructures("pythagoras"));
		System.out.println(withoutDataStructures("word"));
	}

}
