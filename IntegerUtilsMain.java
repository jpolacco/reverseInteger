/**
 * Client program that runs a few cases of the reverse method in IntegerUtils
 *
 * @author (your name here)
 * @version (date code was completed here)
 */
public class IntegerUtilsMain
{
   public static void main(String[] args){
       IntegerUtils utils = new IntegerUtils(); // instantiate an IntegerUtils object
       System.out.println("The reverse of 123 is " + utils.reverse(123));
       // TO-DO: Write at least two more test cases here.
       System.out.println("The reverse of 30100 is " + utils.reverse(30100));
      System.out.println("The reverse of -2005 is " + utils.reverse(-2005));
   }
}





