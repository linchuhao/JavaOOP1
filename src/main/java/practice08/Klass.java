package practice08;

public class Klass {

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    private String displayName;

    private int number;

    private Student leader;

}
