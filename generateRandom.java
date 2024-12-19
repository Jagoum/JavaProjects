import java.util.Random;
//import java.util.*;
public class generateRandom {
    public static void main (String[] args)
    {
        Random rand = new Random();
int randNumber = rand.nextInt(5 + 1);
//double randNumber2 = rand.nextDouble(10);

int randomNum = rand.nextInt(5) + 1;
System.out.println("Random number : " + randNumber);
//System.out.println("Random number : " + randNumber2);
System.out.println("Random number : " + randomNum);

}
}
