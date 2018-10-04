
/**
 * Write a description of class SquareRoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SquareRoot
{
    public static void main(String[]args)
    {
        System.out.println(squareRoot(1.0));
    }
    
    private static double num=64;
    public static double squareRoot (double guess)
    {
        if (Math.abs(guess - (num/guess)) > .000000001)
        {
            return squareRoot((guess + (num/guess))/2);
        }
        else
        {
            return guess;
        }
    }
}