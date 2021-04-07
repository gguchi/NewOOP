public class Main {

    public static void main(String[] args){

        Boy newBoy = new Boy("BoyTEST", 25, "NewTEST", "ASIAN");
        Girl newGirl = new Girl("TEST", 27, "LastTEST", "CAUCASIAN");
        Relationship newRela = new Relationship();

        //NAME
        System.out.println("Names: " + newBoy.returnName() + " and " + newGirl.returnGirlName());
        //AGE
        System.out.println("Age: " + newBoy.returnAge() + " and " + newGirl.returnGirlAge());
        //LAST NAME
        System.out.println("Last Names: " + newBoy.returnLastName() + " and " + newGirl.returnGirlLastName());
        //RACE
        System.out.println("RACE:" + newBoy.returnRace() + " " + newGirl.returnGirlRace());
        //RELATIONSHIP
        System.out.println("Relationship: " + newBoy.RandomBoyName()+ " " + newRela.RandomRelationship() + " " + newGirl.RandomGirlname() );

    }

}
