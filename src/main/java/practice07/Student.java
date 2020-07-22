package practice07;

import practice06.Person;

public class Student extends Person {


    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    Klass klass;

    public String introduce() {
        return super.introduce() + " I am a Student. " + "I am at Class " + this.klass.getNumber() + ".";
    }

}