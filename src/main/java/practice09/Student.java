package practice09;

public class Student extends Person{

    private int id;

    private String name;

    private int age;

    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this == this.klass.getLeader()){
            return super.introduce() + " I am a Student. " + "I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + " I am a Student. " + "I am at Class " + this.klass.getNumber() + ".";
    }
}
