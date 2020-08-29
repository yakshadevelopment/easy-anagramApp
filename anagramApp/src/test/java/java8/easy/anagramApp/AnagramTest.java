package java8.easy.anagramApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

	@Test
	public void testCheckAnagram() throws Exception {
		Anagram anagram1=new Anagram("Conversation","Voices rant on");
		Anagram anagram2=new Anagram("School Master","The classrooms");
		TestUtils.yakshaAssert(TestUtils.currentTest(),(anagram1.checkAnagram()?"true":"false"),TestUtils.businessTestFile);
		TestUtils.yakshaAssert(TestUtils.currentTest(),(anagram2.checkAnagram()?"true":"false"),TestUtils.businessTestFile);
	}


}
