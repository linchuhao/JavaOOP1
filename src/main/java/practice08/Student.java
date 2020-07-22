package practice08;

public class Student extends Person {


    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    public String getName() {
        return super.getName();
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    Klass klass;

    public String introduce() {
        if (this == this.klass.getLeader()){
            return super.introduce() + " I am a Student. " + "I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + " I am a Student. " + "I am at Class " + this.klass.getNumber() + ".";
    }

}