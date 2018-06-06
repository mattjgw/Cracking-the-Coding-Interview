
// Write a method to replace all spaces in a string with '%20'. You may assume that the
// string has sufficient space at the end to hold the additional characters, and that you
// are given the "true" length of the string. (Note: If implementing in Java, please use a
// character array so that you can perform this operation in place

public class URLify {
	
	private static void uRLify(char[] charArray, int length) {
		int numSpaces = 0;
		for (int i = 0; i < length - 1; i++) {
			if(charArray[i] == ' ')
				numSpaces++;
				
		}
		int newLen = length + (2 * numSpaces);
		for (int i = length - 1; i >= 0; i--) {
			if(charArray[i] == ' '){
				charArray[newLen - 1] = '0';
				charArray[newLen - 2] = '2';
				charArray[newLen - 3] = '%';
				newLen -= 3;
			}
			else{
				charArray[newLen - 1] = charArray[i];
				newLen -= 1;
			}
			
		}
		return;
	}	

	public static void main(String[] args) {
		String word = "Mr John Smith    ";
		char cArray [] = word.toCharArray();
		System.out.println(cArray);
		uRLify(cArray, 13);
		System.out.println(cArray);

	}
	

}
