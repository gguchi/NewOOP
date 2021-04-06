import java.util.Random;

public class Relationship {

    static Random rand = new Random();

    static String RandomRelationship()
    {
        String[] relationship = {"hates", "loves", "is indifferent to", "is angry with", "is apologetic to"};

        return relationship[(int)(Math.random()*5)];
    }

}
