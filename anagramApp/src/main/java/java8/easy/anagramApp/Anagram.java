package java8.easy.anagramApp;
import java.util.Arrays;

public class Anagram {
	private String string1;
	private String string2;
	public Anagram() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anagram(String string1, String string2) {
		super();
		this.string1 = string1;
		this.string2 = string2;
	}
	public boolean checkAnagram()
	{
		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		String str1="";
		String str2="";
		for(int i=0;i<string1.length();i++)
		{
			char ch=string1.charAt(i);
			if(Character.isLetter(ch))
				str1=str1+ch;
		}
		for(int i=0;i<string2.length();i++)
		{
			char ch=string2.charAt(i);
			if(Character.isLetter(ch))
				str2=str2+ch;
		}
		char []arr1=str1.toCharArray();
		char []arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		str1=String.valueOf(arr1);
		str2=String.valueOf(arr2);
		if(str1.equalsIgnoreCase(str2))
			return true;
		else
			return false;

	}
	
}
