import java.util.Random;

public class Boy {

    static Random rand = new Random();

    String boyRace;
    private static String boyName;
    protected static int boyAge;
    public static String boyLastName;

    public Boy(String name, int age, String lastName, String mRace) {

        boyName = name;
        boyAge = age;
        boyLastName = lastName;
        boyRace = mRace;

    }

    public String returnRace(){

        return boyRace;

    }

    public static String returnName(){

        return boyName;

    }

    public static int returnAge(){

        return boyAge;

    }

    public static String returnLastName(){

        return boyLastName;

    }

    public static String RandomBoyName(){

        String Name[]= {"Rey", "Aron", "Mike", "Steve", "John"};

        return Name[rand.nextInt(5)];

    }

}
