package java8.easy.anagramApp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string:");
		String first=scanner.nextLine();
		System.out.println("Enter second string:");
		String second=scanner.nextLine();
		Anagram anagram=new Anagram(first,second);
		if(anagram.checkAnagram())
			System.out.println("They are anagrams");
		else
		  System.out.println("They are not anagram");

	}

}
