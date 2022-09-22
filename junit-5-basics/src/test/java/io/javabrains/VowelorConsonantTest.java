package io.javabrains;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VowelorConsonantTest {
@Test
public void TestVowel() {
	assertEquals("vowel",Vowelorconsonant.vowelorconsonant('a'));

}
@Test
public void TestConsonant() {
	assertEquals("consonant",Vowelorconsonant.vowelorconsonant('s'));

}
@Test
public void TestVowelorConsonant() {
	assertEquals("consonant",Vowelorconsonant.vowelorconsonant('e'));

}
}
