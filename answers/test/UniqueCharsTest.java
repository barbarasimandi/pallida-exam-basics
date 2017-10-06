import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UniqueCharsTest {

  UniqueChars uniqueChars;


  @Before
  public void setUp() throws Exception {
    uniqueChars = new UniqueChars();
  }

  @Test
  public void testUniqueChars1() throws Exception {
    assertEquals("n, g, r, m", uniqueChars.uniqueCharacters("anagram"));
  }

  @Test
  public void testUniqueChars2() throws Exception {
    assertEquals("k, s, c", uniqueChars.uniqueCharacters("kiscica"));
  }

}