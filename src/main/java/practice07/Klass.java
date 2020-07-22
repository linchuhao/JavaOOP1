package practice07;

public class Klass {

    public Klass(int number) {
        this.number = number;
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

    private int number;

    private String displayName;

}
