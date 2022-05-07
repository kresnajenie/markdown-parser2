//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            currentIndex = closeParen + 1;
            if (currentIndex == markdown.length()-1) {
                break;
            }
            if (openBracket == -1) {
                break;
            }
            if (closeBracket == -1) {
                break;
            }
            if (openParen == -1) {
                break;
            }
            if (closeParen == -1) {
                break;
            }
            toReturn.add(markdown.substring(openParen + 1, closeParen));

            
        }

        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        System.out.println(links);
        // Path fileName1 = Path.of(args[1]);
        // String content1 = Files.readString(fileName1);
        // ArrayList<String> links1 = getLinks(content1);
        // System.out.println(links1);
        // Path fileName2 = Path.of(args[1]);
        // String content2 = Files.readString(fileName2);
        // ArrayList<String> links2 = getLinks(content2);
        // System.out.println(links2);
        // Path fileName3 = Path.of(args[1]);
        // String content3 = Files.readString(fileName3);
        // ArrayList<String> links3 = getLinks(content3);
        // System.out.println(links3);
        
    }
}
