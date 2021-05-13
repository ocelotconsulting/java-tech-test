package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestWordTest {
    // returns the longest word in the given string
    // a word is defined as any string of characters without whitespace surrounded by whitespace

   String longestWord(String text) {
        return "";
    }

    @Test
    void examples() {
        assertEquals("sebastian", longestWord("hello my name is sebastian jones"));
        assertEquals("twenty", longestWord("four score and twenty years ago"));
    }
}
