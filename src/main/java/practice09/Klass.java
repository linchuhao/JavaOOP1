package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private String displayName;

    private int number;

    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (student.klass.getNumber() == this.number){
            this.leader = student;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student student) {
        student.klass.setNumber(this.number);
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }
}
