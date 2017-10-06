import java.util.ArrayList;

public class UniqueChars {

  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static String uniqueCharacters(String input) {

    ArrayList<Character> uniques = new ArrayList<>();
    uniques.add(input.charAt(0));

    for (int i = 0; i < input.length(); i++) {
        if (uniques.get(0) != input.charAt(i)) {
          uniques.add(input.charAt(i));
      }
    } return uniques.toString();
  }
}
