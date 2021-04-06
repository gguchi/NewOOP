import java.util.Random;

public class Boy {

    static Random rand = new Random();

    /*
    public static String returnName(){

    String boyName = "Random";
    int boyAge = 12;
    String boyLastName = "NewRandom";

    System.out.println(boyName);
    System.out.println(boyAge);
    System.out.println(boyLastName);

    return null;
    } */

    public static String RandomBoyName(){

        String Name[]= {"Rey", "Aron", "Mike", "Steve", "John"};

        return Name[rand.nextInt(5)];

    }

}
