package practice06;

public class Student extends Person{

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    private int klass;

    public String introduce() {
        return super.introduce() + " I am a Student. " + "I am at Class " + this.klass + ".";
    }

}
