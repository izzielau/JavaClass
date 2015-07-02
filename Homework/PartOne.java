/**
 * Created by Izzie_Express on 7/1/2015.
 */

/*
    Given a string “Today”, reverse the string so that the result
    will be “yadoT”.
 */

public class PartOne {
    public static void main(String[] args) {
        String original = "Today";
        String newWord = "";

        int lengthOfString = original.length();

        char newLetter;

        for (int i = lengthOfString; i > 0; i--) {
            newLetter = original.charAt(i - 1);
            newWord = newWord+newLetter;
        }

        System.out.println(newWord);

    }
}