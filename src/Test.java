public class Test {
    public static void main(String[] args) {
        Person person = new Person("jassi",2003);
        Student student = new Student("Tasnim",2002,"Mathematics");
        Instructor instructor = new Instructor("Sristy",2001,50000);
        System.out.println(person);
        System.out.println(student);
        System.out.println(instructor);
    }
}
