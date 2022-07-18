package bridgelabz;

public class Regex {
	public static void main(String[] args) {
		String str=new String("name");
		String str1=new String("full_name");
		String str2=new String("88805XXXXX");
		String str3=new String("24/06/1964");
		
		System.out.println("Initial String: "+str);
		System.out.println("Initial String: "+str1);
		System.out.println("Initial String: "+str2);
		System.out.println("Initial String: "+str3);
		
		str=str.replaceAll("name","Sauparnika");
		str1=str1.replaceAll("full_name","Sauparnika_kumar");
		str2=str2.replaceAll("88805XXXXX","9731634271");
		str3=str3.replaceAll("24/06/1964","17/06/1998");
		
		System.out.println("\nthe string modified: "+str);
		System.out.println("the string modified: "+str1);
		System.out.println("the string modified: "+str2);
		System.out.println("the string modified: "+str3);
	}
}
