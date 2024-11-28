public class Student extends Person{
    private String major;
    public Student(String name,int yearOfBirth,String major){
        super(name, yearOfBirth);
        this.major = major;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getYearOfBirth() {
        return super.getYearOfBirth();
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString()+ ",Major name : "+ major;
    }
}
