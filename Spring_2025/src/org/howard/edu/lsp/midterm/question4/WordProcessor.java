package org.howard.edu.lsp.midterm.question4;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    private String sentence; 

 
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    public List<String> findLongestWords() {
        List<String> longestWords = new ArrayList<>();
        if (sentence == null || sentence.trim().isEmpty()) {
            return longestWords; 
        }

        String[] words = sentence.split("\\s+"); 
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}


/* references https://stackoverflow.com/questions/70550937/finding-the-longest-word-arraylist-java
and chat gpt */
