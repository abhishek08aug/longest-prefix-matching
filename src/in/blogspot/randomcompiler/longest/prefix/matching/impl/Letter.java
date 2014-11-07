package in.blogspot.randomcompiler.longest.prefix.matching.impl;

import in.blogspot.randomcompiler.longest.prefix.matching.api.NullArgumentException;

import java.util.HashMap;
import java.util.Map;

public class Letter {
    private char value;
    private boolean isEndingChar;
    private Map<Character, Letter> nextLetters;
    
    Letter() {
        this.isEndingChar = false;
        nextLetters = new HashMap<Character, Letter>();
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isEndingChar() {
        return isEndingChar;
    }

    public void setEndingChar(boolean isEndingChar) {
        this.isEndingChar = isEndingChar;
    }
    
    public Letter getNextLetter(char c) throws NullArgumentException {
        if(c == '\u0000')
            throw new NullArgumentException("getNextChar called with null argument");
        return nextLetters.get(c);
    }
    
    public Letter addNextLetter(char c) throws NullArgumentException {
        if(c == '\u0000') {
            throw new NullArgumentException("addNextLetter called with null argument");
        }
        if(nextLetters.get(c) != null) {
            return nextLetters.get(c);
        }
        Letter nextLetter = new Letter();
        nextLetter.setValue(c);
        nextLetters.put(new Character(c), nextLetter);
        return nextLetter;
    }
}
