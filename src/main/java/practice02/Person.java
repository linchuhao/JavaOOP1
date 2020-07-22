package practice02;

public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;

    private int age;

    public String introduce(){
        return "My name is "+ this.name + ". I am "+ this.age + " years old.";
    }
}
