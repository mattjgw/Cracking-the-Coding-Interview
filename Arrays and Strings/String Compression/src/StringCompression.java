
// Implement a method to perform basic string compression using the counts
// of repeated characters. For example, the string aabcccccaaa would become
// a2b1c5a3. If the "compressed" string would not become smaller that the 
// original string, your method should return the original string. You can
// assume the string has only uppercase and lowercase letters (a-z)

public class StringCompression {
	
	public static String stringCompressionBad(String word){
		if(word.length() == 1)
			return word;
		String compressed = "";
		compressed += word.charAt(0);
		for(int i = 1; i < word.length(); i++){
			if(word.charAt(i) != word.charAt(i-1))
				compressed += word.charAt(i);
		}
		//System.out.println(compress);
		String counted = "";
		int num;
		int place = 0;
		for(int i = 0; i < compressed.length(); i++){
			num = 0;
			for(int j = place; j < word.length(); j++){
				if(word.charAt(place) == compressed.charAt(i)){
					num++;
					place++;
				}
			}
			counted += (compressed.charAt(i) + Integer.toString(num));
		}
		if(word.length() > counted.length())
			return counted;
		return word;
	}
	
	public static String stringCompressionGood(String word) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < word.length(); i++){
			countConsecutive++;
			if(i + 1 >= word.length() || word.charAt(i) != word.charAt(i+1)){
				compressed.append(word.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
			
		}
		return compressed.length() < word.length() ? compressed.toString() : word;
	}

	public static void main(String[] args) {
		System.out.println(stringCompressionBad("aabcccccaaa"));
		System.out.println(stringCompressionGood("aabcccccaaa"));

	}

}
