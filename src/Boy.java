import java.util.Random;

public class Boy {

    static Random rand = new Random();


    public static String returnName(){
/*
    System.out.println(boyName);
    System.out.println(boyAge);
    System.out.println(boyLastName);
*/

    String boyName="BoyRandom";

    return boyName;
    }

    public static int returnAge(){

        int boyAge = 12;

        return boyAge;

    }

    public static String returnLastName(){

        String boyLastName = "Last Name";

        return boyLastName;

    }

    public static String RandomBoyName(){

        String Name[]= {"Rey", "Aron", "Mike", "Steve", "John"};

        return Name[rand.nextInt(5)];

    }

}
