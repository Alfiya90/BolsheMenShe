package Interface;

public class Animal implements Info {
    int id;
    public Animal (int id){
        this.id = id;
    }
    public void showInfo (){
        System.out.println("my ID is "+id);
    }
}
