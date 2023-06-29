public class Student {
    //attributes

    private  String name;
    private  int age;
    private int grade;
    private int roll;

    private final int id;

    //constructor
    Student(int id,String name, int age, int grade,int roll){
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.roll = roll;
    }

    //getter
    public void getInfo(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Grade: "+this.grade);
        System.out.println("Roll: "+this.roll);
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }


    public static void main(String[] args) {
        Student student = new Student(1,"John Doe",18,10,12);
        student.getInfo();
    }
}
