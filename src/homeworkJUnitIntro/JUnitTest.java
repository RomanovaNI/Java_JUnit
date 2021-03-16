package homeworkJUnitIntro;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JUnitTest {
    @Test
    public void testMethods() {

        assertEquals("amaM", StringPractiseHw.getStrReverse("Mama"));
        assertEquals("amaM", StringPractiseHw.getStrReverse(" Mama "));
        assertEquals("aMaM", StringPractiseHw.getStrReverse(" MaMa "));
        //  assertEquals("amaM", StringPractiseHw.getStrReverse("mama"));
        assertNull(StringPractiseHw.getStrReverse(""));
        assertNull(StringPractiseHw.getStrReverse(null));

        assertEquals(2, StringPractiseHw.getCountWords("Two beers or not two beers", "beer"));
        assertEquals(2, StringPractiseHw.getCountWords("Two beers or not two beers", " beer "));
        assertEquals(0, StringPractiseHw.getCountWords("Two beers or not two beers", "bear"));
        assertEquals(2, StringPractiseHw.getCountWords("Two beers or not two beers", "Beer"));
        assertEquals(-1, StringPractiseHw.getCountWords(null, "beer"));
        assertEquals(-1, StringPractiseHw.getCountWords(null, null));
        assertEquals(-1, StringPractiseHw.getCountWords("Two beers or not two beers", null));
        assertEquals(-1, StringPractiseHw.getCountWords("", ""));
        assertEquals(-1, StringPractiseHw.getCountWords("", "beer"));
        assertEquals(-1, StringPractiseHw.getCountWords("Two beers or not two beers", ""));
    }
}
