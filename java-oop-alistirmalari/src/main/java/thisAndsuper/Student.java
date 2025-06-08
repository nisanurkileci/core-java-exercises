package thisAndsuper;

public class Student extends Person{
    String ID;
    public Student(String isim, int age, String ID) {
       super(isim, age);
       this.ID = ID;

    }
    public void printStudentInfo() {
        super.printInfo();
        System.out.println(this.ID);

    }
}
