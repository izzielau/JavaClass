/**
 * Created by Izzie_Express on 7/1/2015.
 */

/*
    Given a string “Today is Tuesday-It is 4 days away from the 4th
    of July”, output the number of occurrences for the character “y”.
    For example:
    input: “Today is Tuesday-It is 4 days away from the 4th of July”.
    output: “Number of occurrences for character ‘y’: 4.”
*/

public class PartTwo {
    public static void main(String args[]) {
        String phrase = "Today is Tuesday-It is 4 days away from the 4th of July";

        int lengthOfPhrase = phrase.length();
        int occurrences = 0;

        for (int i = 0; i <= lengthOfPhrase - 1; i++) {
            if (phrase.charAt(i) == 'y') {
                occurrences++;
            }
        }

        System.out.println("Number of occurrences for character 'y': "+occurrences);
    }
}