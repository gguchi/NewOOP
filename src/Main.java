public class Main {

    public static void main(String[] args){

        Boy newBoy = new Boy();
        Girl newGirl = new Girl();
        Relationship newRela = new Relationship();

        /*
        newBoy.RandomBoyName();
        newGirl.RandomGirlname();
        newRela.RandomRelationship();
        */

        //NAME
        System.out.println("Names: " + newBoy.RandomBoyName() + " and " + newGirl.RandomGirlname());
        //AGE
        System.out.println("Age: " + newBoy.returnAge() + " and " + newGirl.returnGirlAge());
        //LAST NAME
        System.out.println("Last Names: " + newBoy.returnLastName() + " and " + newGirl.returnGirlLastName());

        System.out.println("Relationship: " + newBoy.RandomBoyName()+ " " + newRela.RandomRelationship() + " " + newGirl.RandomGirlname() );

    }

}
