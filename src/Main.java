public class Main {

    public static void main(String[] args){

        Boy newBoy = new Boy("NEW TEST", 25, "NewTEST", "ASIAN");
        Girl newGirl = new Girl("TEST", 27, "LastTEST", "CAUCASIAN");
        Relationship newRela = new Relationship();

        //Boy secondBoy = new Boy();

        //NAME
        System.out.println("\nNames: " + newBoy.returnName() + " and " + newGirl.returnGirlName());
        //AGE
        System.out.println("Age: " + newBoy.returnAge() + " and " + newGirl.returnGirlAge());
        //LAST NAME
        System.out.println("Last Names: " + newBoy.returnLastName() + " and " + newGirl.returnGirlLastName());
        //RACE
        System.out.println("RACE:" + newBoy.returnRace() + " " + newGirl.returnGirlRace());
        //RELATIONSHIP
        System.out.println("\nRelationship: " + newBoy.RandomBoyName()+ " " + newRela.RandomRelationship() + " " + newGirl.RandomGirlname() );
        //GET / SET TEST
        //System.out.println("Boy Name: " + secondBoy.returnSecondName());
        System.out.println("GETTER SETTER TEST: " + newBoy.returnVariable());
    }

}
