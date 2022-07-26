package Interface;

public class Person implements Info {
    String name;
    public Person(String  name){
        this.name = name;
    }
    public void showInfo () {
        System.out.println("My name is " + name);
    }
}
