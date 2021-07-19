import java.util.Scanner;

public class Xd extends Power {
    private String name1;
    private static String funkcja;
    String x = "true";
    int channel = 1;
    int vol = 10;


    Scanner scanner = new Scanner(System.in);
    public Xd (String name)
    {
        this.name1 = name;
    }
    public static void setFunkcja(String c) { funkcja = c; }
    public static void getFunkcja()
    {

    }

    {
        do {
            System.out.println("__________________" + "\n" + "|      PILOT     |" + "\n" + "|  ON       OFF  |" + "\n" + "|  1     2     3 |" + "\n" + "|  4     5     6 |" + "\n" + "|  7     8     9 |" + "\n" + "|back        next|" + "\n" + "|quieter   louder|" + "\n" + "------------------");
            System.out.println("TV jest włączony, obecnie gra stacja nr: " + channel + ", poziom głośności: " + vol);


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
                    funkcja = "false";
                    break;
                default:
                    System.out.println("Coś poszło nie tak, spróbuj ponownie");
            }}
        while (funkcja.equals("true"));}

}
