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

        System.out.print(newBoy.RandomBoyName()+ " " + newRela.RandomRelationship() + " " + newGirl.RandomGirlname() );

    }

}
