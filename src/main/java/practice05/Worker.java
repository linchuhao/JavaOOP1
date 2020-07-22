package practice05;

public class Worker extends Person{

    private String name;

    private int age;

    public Worker(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduce(){
        return "My name is "+ this.name + ". I am " + this.age + " years old. I am a Worker. I have a job.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
