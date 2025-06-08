package Static;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Can" , 220);
        Student s2 = new Student("Ali" , 230);
        System.out.println("Online Öğrenci :" + Student.howStudent());
    }
}
