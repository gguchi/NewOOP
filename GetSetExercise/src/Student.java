public class Student {

    private String student_name;
    private int student_id;
    private String student_curriculum;

    //SETTERS

    public void setName(String name){

        this.student_name = name;

    }

    public void setID(int id){

        this.student_id = id;

    }

    public void setCourse(String course){

        this.student_curriculum = course;

    }

    //GETTERS

    public String getCourse(){

        return student_curriculum;

    }

    public String getName(){

        return student_name;

    }

    public int getID(){

        return student_id;

    }

}
