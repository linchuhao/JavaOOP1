package practice10;

public class Klass {

    private int number;

    private  Student leader;

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
        return "Class " + this.number;
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
