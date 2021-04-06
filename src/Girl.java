import java.util.Random;

public class Girl {

    static Random rand = new Random();

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
    String girlName="GirlRandom";

    return girlName;
}

    public static int returnGirlAge(){

        int boyAge = 12;

        return boyAge;

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
