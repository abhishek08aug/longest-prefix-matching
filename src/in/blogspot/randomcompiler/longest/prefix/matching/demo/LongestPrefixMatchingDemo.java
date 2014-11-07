package in.blogspot.randomcompiler.longest.prefix.matching.demo;

import in.blogspot.randomcompiler.longest.prefix.matching.api.NullArgumentException;
import in.blogspot.randomcompiler.longest.prefix.matching.impl.Dictionary;

public class LongestPrefixMatchingDemo {

    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        try {
            d.addWordToDictionary("are");
            d.addWordToDictionary("area");
            d.addWordToDictionary("base");
            d.addWordToDictionary("cat");
            d.addWordToDictionary("cater");
            d.addWordToDictionary("basement");
            d.addWordToDictionary("child");
            d.addWordToDictionary("children");
            d.addWordToDictionary("wild");
            d.addWordToDictionary("wilderness");
            d.addWordToDictionary("call");
            d.addWordToDictionary("caller");
            
            System.out.println(d.getLongestMatchingPrefix("caterer"));
            System.out.println(d.getLongestMatchingPrefix("basement"));
            System.out.println(d.getLongestMatchingPrefix("are"));
            System.out.println(d.getLongestMatchingPrefix("arex"));
            System.out.println(d.getLongestMatchingPrefix("basemexz"));
            System.out.println(d.getLongestMatchingPrefix("xyz"));
        } catch (NullArgumentException e) {
            e.printStackTrace();
        }
    }

}
