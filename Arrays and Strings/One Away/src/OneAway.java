
// There are three types of edits that can be performed on strings: insert a
// character, remove a character, or replace a character. Given two strings,
// write a function to check if they are one edit (or zero edits) away

public class OneAway {
	
	public static boolean oneAway(String a, String b){
		if (a == b)
			return true;
		if(a.length() == b.length()){
			boolean replace = false;
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) != b.charAt(i)){
					if(replace)
						return false;
					replace = true;
				}
			}
			return true;
		}
		
		if(a.length() - b.length() == 1){
			for (int i = 0; i < b.length(); i++) {
				if(a.charAt(i) == b.charAt(i))
					continue;
				else if(a.charAt(i + 1) == b.charAt(i))
					continue;
				else
					return false;
				
			}
			return true;
		}
		
		if(b.length() - a.length() == 1){
			for (int i = 0; i < a.length(); i++) {
				if(b.charAt(i) == a.charAt(i))
					continue;
				else if(b.charAt(i + 1) == a.charAt(i))
					continue;
				else
					return false;
				
			}
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println(oneAway("pale", "ple"));
		System.out.println(oneAway("pales", "pale"));
		System.out.println(oneAway("pale", "bale"));
		System.out.println(oneAway("pale", "bake"));

	}

}
