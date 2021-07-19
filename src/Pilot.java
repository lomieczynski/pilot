import java.util.Scanner;

public class Pilot  {
    public static void main (String args[])
    {

        Power pilocik = new Power("pilocik");


        Scanner scanner = new Scanner(System.in);



        pilocik.getOnOff();
        pilocik.setOnOff(scanner.nextBoolean());
        pilocik.getOnOff();


        }
        
    }

