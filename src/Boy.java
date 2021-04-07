import java.util.Random;

public class Boy {

    static Random rand = new Random();

    String boyRace;
    private String boyName = "Private Name";
    protected static int boyAge;
    public static String boyLastName;

    private int testVariable;


    public Boy(String name, int age, String lastName, String mRace) {

        boyName = name;
        boyAge = age;
        boyLastName = lastName;
        boyRace = mRace;

    }


    //SETTERS

    public void privateName(String secondName){

        this.boyName = secondName;

    }


    public void setValue(int newValue){

        this.testVariable = newValue;

    }

    public void setName(String setName){

        this.boyName = setName;

    }

    public void setAge(int setAge){

        this.boyAge = setAge;

    }

    public void setRace(String setRace){

        this.boyRace = setRace;

    }

    public void setLastName(String setLastName){

        this.boyLastName = setLastName;

    }


    //GETTER

    public String returnSecondName(){

        return boyName;

    }

    public int returnVariable(){

        return testVariable;

    }

    public String returnRace(){

        return boyRace;

    }

    public String returnName(){

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
