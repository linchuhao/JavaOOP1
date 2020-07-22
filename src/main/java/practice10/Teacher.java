package practice10;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<Klass> classes = new ArrayList<>();

    public Teacher(int id, String name, int age, List classes) {
        super(id, name, age);
        this.classes = classes;
    }
    public Teacher(int id, String name, int age) {
        super(id,name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder introduction = new StringBuilder(super.introduce() + " I am a Teacher. I teach Class ");
            for (int i = 0; i < this.classes.size(); i++) {
                introduction.append(classes.get(i).getNumber());
                if (i != this.classes.size() - 1) {
                    introduction.append(", ");
                }
            }
            return introduction + ".";
        }
    }
    public boolean isTeaching(Student student) {
        for (Klass aClass : classes) {
            if (aClass.getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        for (int i = 0; i < classes.size(); i++) {
            if (student.getKlass().getNumber() == classes.get(i).getNumber()) {
                return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            }
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
