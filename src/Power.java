import java.nio.channels.Channel;
import java.util.Scanner;


public class Power {


    private boolean onOff = false;
    private String name;
    static String funkcja;
    String x = "true";
    int channel = 1;
    int vol = 10;
    int p = 0;


    Scanner scanner = new Scanner(System.in);

    public Power(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Power() {

    }
    public void setOnOffdwa(boolean a) {
        onOff = a;
    }

    public void getOnOffdwa() {}

    public static void setFunkcja(String c) {
        funkcja = c;
    }

    public static void getFunkcja() {

    }

    public void setOnOff(boolean a) {
        onOff = a;
    }

    public void getOnOff() {
        while (p == 0) {

        System.out.println("__________________" + "\n" + "|      PILOT     |" + "\n" + "|  ON       OFF  |" + "\n" + "|  1     2     3 |" + "\n" + "|  4     5     6 |" + "\n" + "|  7     8     9 |" + "\n" + "|back        next|" + "\n" + "|quieter   louder|" + "\n" + "------------------");
        System.out.println("TV jest obecnie wyłączony");

        getOnOffdwa();
        setOnOffdwa(scanner.nextBoolean());
        getOnOffdwa();

       if (onOff==true)
        {


            System.out.println("__________________" + "\n" + "|      PILOT     |" + "\n" + "|  ON       OFF  |" + "\n" + "|  1     2     3 |" + "\n" + "|  4     5     6 |" + "\n" + "|  7     8     9 |" + "\n" + "|back        next|" + "\n" + "|quieter   louder|" + "\n" + "------------------");
            System.out.println("TV jest obecnie włączony, kanał: " +channel + ", głośność: " + vol );
            getFunkcja();
            setFunkcja(scanner.nextLine());
            getFunkcja();


            do {
                System.out.println("__________________" + "\n" + "|      PILOT     |" + "\n" + "|  ON       OFF  |" + "\n" + "|  1     2     3 |" + "\n" + "|  4     5     6 |" + "\n" + "|  7     8     9 |" + "\n" + "|back        next|" + "\n" + "|quieter   louder|" + "\n" + "------------------");
                System.out.println("TV jest obecnie włączony, kanał: " +channel + ", głośność: " + vol );
                getFunkcja();
                setFunkcja(scanner.nextLine());
                getFunkcja();

                switch (funkcja) {

                    case "next":
                        if (channel >= 1 && channel < 9)
                            ++channel;
                        else if (channel == 9)
                            channel = channel - 8;
                        break;

                    case "back":
                        if (channel > 1 && channel <= 9)
                            --channel;
                        else if (channel == 1)
                            channel = channel + 8;
                        break;

                    case "louder":
                        if (vol >= 0 && vol < 15)
                            ++vol;
                        break;

                    case "quieter":
                        if (vol > 0 && vol <= 15)
                            --vol;
                        break;

                    case "1":
                        channel = 1;
                        break;
                    case "2":
                        channel = 2;
                        break;
                    case "3":
                        channel = 3;
                        break;
                    case "4":
                        channel = 4;
                        break;
                    case "5":
                        channel = 5;
                        break;
                    case "6":
                        channel = 6;
                        break;
                    case "7":
                        channel = 7;
                        break;
                    case "8":
                        channel = 8;
                        break;
                    case "9":
                        channel = 9;
                        break;
                    case "false":
                        onOff = false;
                        break;
                    default:
                        System.out.println("Coś poszło nie tak, spróbuj ponownie");
                }
            }

            while (onOff == true);
        }
        }
    }

}