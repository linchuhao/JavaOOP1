package practice03;

public class Student extends Person{

    public int getKlass() {
        return klass;
    }

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    @Override
    public String introduce(){
        return "I am a Student. " + "I am at Class " + this.klass + ".";
    }
}
