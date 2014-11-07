package in.blogspot.randomcompiler.longest.prefix.matching.demo;

import in.blogspot.randomcompiler.longest.prefix.matching.api.NullArgumentException;
import in.blogspot.randomcompiler.longest.prefix.matching.impl.Dictionary;

public class LongestPrefixMatchingDemo {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        try {
            d.addWordToDictionary("i");
            d.addWordToDictionary("in");
            d.addWordToDictionary("india");
            d.addWordToDictionary("indian");
            d.addWordToDictionary("indianized");
            d.addWordToDictionary("chill");
            d.addWordToDictionary("child");
            d.addWordToDictionary("children");
            d.addWordToDictionary("wild");
            d.addWordToDictionary("wilderness");
            d.addWordToDictionary("call");
            d.addWordToDictionary("caller");
            
            System.out.println(d.getLongestMatchingPrefix("calle"));
            System.out.println(d.getLongestMatchingPrefix("butter"));
        } catch (NullArgumentException e) {
            e.printStackTrace();
        }
    }

}
