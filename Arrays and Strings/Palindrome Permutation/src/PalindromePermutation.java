
// Given a string, write a function to check if it is a permutation of a
// palindrome. A palindrome is a word or phrase that is the same forwards
// and backwards. A permutation is a rearrangement of letters. The palindrome
// does not need to be limited to just dictionary words

public class PalindromePermutation {
	
	public static boolean palindromePermutation(String phrase){
		String raw = phrase.toUpperCase().replaceAll(" ", "");
		System.out.println(raw);
		int characters [] = new int[91]; // Assumption
		for (int i = 0; i < raw.length(); i++)
			characters[raw.charAt(i)]++;
		int oddVar = 0;
		for(int i = 0; i < characters.length; i++){
			if(raw.length() % 2 == 0){ // Even case
				if(characters[i] % 2 == 1)
					return false;
			}
			if(raw.length() % 2 == 1){ // Odd case
				if(characters[i] % 2 == 1)
					if(oddVar == 0)
						oddVar = 1;
					else
						return false;
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(palindromePermutation("Tact Coa"));
		System.out.println(palindromePermutation("This is not a palindrome"));
	}

}
