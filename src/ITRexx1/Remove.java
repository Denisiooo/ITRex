package ITRexx1;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Remove {
    private String name;
    private final List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public Remove(String name) {
        this.name = name;
        System.out.println("input -> " + name);
    }

    public void rename() {
        //first
        name = name.replace("ci", "si");
        name = name.replace("ce", "se");
        name = name.replace("ck", "k");
        name = name.replace("c", "k");
        //second
        name = name.replace("ee", "i");
        name = name.replace("oo", "u");
        StringBuilder sb = new StringBuilder(name);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1) && alphabet.contains(sb.charAt(i))) {
                sb.replace(i, i + 2, String.valueOf(sb.charAt(i)));
            }
        }
        //third
        String[] sentence = sb.toString().split("\\s|[,.;:]");
        String finalString = "";
        for (String subStr : sentence) {
            if (subStr.endsWith("e"))
                subStr = subStr.substring(0, subStr.length() - 1);
            finalString += subStr + " ";
        }
        //forth
        finalString = finalString.toLowerCase(Locale.forLanguageTag(finalString));
        finalString = finalString.replace("th ", " ");
        finalString = finalString.replace(" th ", " ");
        finalString = finalString.replace(" a ", " ");
        finalString = finalString.replace(" an ", " ");
        System.out.println("output -> " + finalString);
    }

}

