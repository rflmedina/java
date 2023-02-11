package oop.javaBean;

public class PersonBean {
    private String name;
    private int age;

    // must have a default constructor
    public PersonBean() {
        this.name = "";
        this.age = 0;
    }

    // setter and getter methods

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
