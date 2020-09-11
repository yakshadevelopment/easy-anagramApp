package java8.easy.anagramApp;

import static org.junit.Assert.*;
import static java8.easy.anagramApp.TestUtils.*;
import org.junit.Test;

public class AnagramTest {

	@Test
	public void testCheckAnagram() throws Exception {
		Anagram anagram1=new Anagram("Conversation","Voices rant on");
		Anagram anagram2=new Anagram("School Master","The classrooms");
		yakshaAssert(currentTest(),(anagram1.checkAnagram()?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(anagram2.checkAnagram()?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}
