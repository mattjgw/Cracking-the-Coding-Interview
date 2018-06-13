
// Assume you have a method isSubstring which checks if one word is a
// substring of another. Given two strings, s1 and s2, write code to 
// check if s2 is a rotation of s1 using only one call to isSubstring
// (e.g. "waterbottle" is a rotation of "erbottlewat"

public class StringRotation {
	
	public static boolean stringRotation(String str, String rotated){
		if(str.length() == rotated.length() && str.length() > 0){
			String full = str + str;
			return full.contains(rotated);
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(stringRotation("waterbottle", "erbottlewat"));
	}

}
