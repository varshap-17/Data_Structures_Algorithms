package bridgelabz;

import java.util.Arrays;

public class Anagram {
	
	static void isAnagram(String str1,String str2) {
		String s1=str1.replaceAll("\\s", " ");
		String s2=str2.replaceAll("\\s", " ");
		boolean status=true;
		if(s1.length()!=s2.length()) {
			status=false;
		}else {
			char[] arrayS1=s1.toCharArray();
			char[] arrayS2=s2.toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status=Arrays.equals(arrayS1, arrayS2);
		}
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		}else
			System.out.println(s1+" and "+s2+" are not anagrams");
	}
	public static void main(String[] args) {
		isAnagram("heart","earth");
		isAnagram("triangle","integral");
		isAnagram("toss","shot");
	}
}
