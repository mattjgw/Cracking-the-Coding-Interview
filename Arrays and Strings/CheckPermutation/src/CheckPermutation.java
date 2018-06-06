

// Given two strings, write a method to decide if one is a permutation
// of the other

public class CheckPermutation {
	
	public static boolean checkPermutation(String a, String b){
		// Assume only ASCII characters, not case sensitive
		int characters [] = new int [128];
		for (int i = 0; i < a.length(); i++)
			characters[a.charAt(i)]++;
		for (int i = 0; i < a.length(); i++){
			characters[b.charAt(i)]--;
			if(characters[b.charAt(i)] < 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPermutation("pool", "loop"));
		System.out.println(checkPermutation("apple", "orange"));

	}

}
