package Interface;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(2);
        Info info2 = new Person("Tom");
        getInfo(info1);
        getInfo(info2);

    }

    public static void getInfo(Info info) {
        info.showInfo();
    }
}




