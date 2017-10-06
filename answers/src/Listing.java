import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Listing {
  public void listingTxt() {
    try {
      Path filePath = Paths.get("C:/greenfox/programming_basics/pallida-exam-basics/answers/favourites.txt");
      List<String> lines = Files.readAllLines(filePath);
      for (String s : lines) {
        System.out.println(s);
      }
    } catch (IOException ex) {
      System.out.println("Unable to read file: Menu.txt");
    }
  }
}
