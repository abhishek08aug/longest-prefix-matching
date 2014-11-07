package in.blogspot.randomcompiler.longest.prefix.matching.impl;

import in.blogspot.randomcompiler.longest.prefix.matching.api.NullArgumentException;

public class Dictionary {
    private Letter rootLetter;
    
    public Dictionary() {
        rootLetter = new Letter();
        rootLetter.setEndingChar(false);
    }
    
    public void addWordToDictionary(String word) throws NullArgumentException {
        if(word == null) {
            throw new NullArgumentException("addWordToDictionary called with null argument");
        }
        Letter currentLetter = rootLetter;
        for(int i = 0; i < word.length(); i++) {
            currentLetter = currentLetter.addNextLetter(word.charAt(i));
            if(i == word.length() -1)
                currentLetter.setEndingChar(true);
        }
    }
    
    public String getLongestMatchingPrefix(String input) throws NullArgumentException {
        if(input == null) {
            throw new NullArgumentException("getLongestMatchingPrefix called with null argument");
        }
        String longestMatchingPrefix = null;
        StringBuilder currentWord = new StringBuilder();
        Letter currentLetter = rootLetter;
        for(int i = 0; i < input.length(); i++) {
            currentLetter = currentLetter.getNextLetter(input.charAt(i));
            
            if(currentLetter != null) {
                currentWord.append(currentLetter.getValue());
                if(currentLetter.isEndingChar()) {
                    longestMatchingPrefix = currentWord.toString();
                }
            } else {
                break;
            }
        }
        return longestMatchingPrefix;
    }
}
