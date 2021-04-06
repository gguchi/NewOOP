import java.util.Random;

public class Girl {

    static Random rand = new Random();

    public static String girlName;
    public static int girlAge;
    public static String girlLastName;

    public Girl(String gName, int gAge, String gLastName){

        girlName = gName;
        girlAge = gAge;
        girlLastName = gLastName;

    }


    /*
    public static String returnName(){

        String girlName = "Random";
        int girlAge = 12;
        String girlLastName = "NewRandom";

        System.out.println(girlName);
        System.out.println(girlAge);
        System.out.println(girlLastName);

        return null;
    } */

    public static String returnGirlName(){

        return girlName;

    }

    public static int returnGirlAge(){

        return girlAge;

    }

    public static String returnGirlLastName(){

        String girlLastName = "Last Name";

        return girlLastName;

    }

    public static String RandomGirlname(){
        String girlName[] = {"Olivia", "Emma", "Ava", "Sophia", "Isabella"};
        return girlName[rand.nextInt(5)];
    }

}
