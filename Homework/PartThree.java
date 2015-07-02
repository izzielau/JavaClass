/**
 * Created by Izzie_Express on 7/1/2015.
 */

/*
    Using loops, print the following.
    ********
    ******
    ****
    **
    *
*/

public class PartThree {
    public static void main(String args[]) {
        String asterisks = "********";

        int lengthOfAsterisks = asterisks.length();

        while (lengthOfAsterisks > 0) {
            System.out.println(asterisks.substring(0, lengthOfAsterisks));
            if (lengthOfAsterisks > 2) {
                lengthOfAsterisks = lengthOfAsterisks - 2;
            } else {
                lengthOfAsterisks = lengthOfAsterisks - 1;
            }
        }
    }
}