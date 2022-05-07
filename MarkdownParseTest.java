import static org.junit.Assert.*; // import assert from junit
import org.junit.*; // import junit module
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {
    @Test // create test function
    public void addition() {
        assertEquals(2, 1 + 1); // check if 2 == 1+1
    }

    @Test
    public void testMDParse1() {
        try {
        Path fileName = Path.of("./test-file.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            output.add("https://something.com");
            output.add("some-thing.html");
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse2() {
        try {
        Path fileName = Path.of("./test-file2.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> output = new ArrayList<String>();
            output.add("https://something.com");
            output.add("some-page.html");
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse3() {
        try {
        Path fileName = Path.of("./test-file3.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse4() {
        try {
        Path fileName = Path.of("./test-file4.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse5() {
        try {
        Path fileName = Path.of("./test-file5.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse6() {
        try {
        Path fileName = Path.of("./test-file6.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse7() {
        try {
        Path fileName = Path.of("./test-file7.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testMDParse8() {
        try {
        Path fileName = Path.of("./test-file8.md");
        String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);

            ArrayList<String> output = new ArrayList<String>();
            assertEquals(output, links);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void failingTest() throws Exception {
        String filename = System.getProperty("user.dir") + "/test-file.md";
        String content = Files.readString(Path.of(filename));
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> output = new ArrayList<String>();
        assertEquals(output, links);
    }
}