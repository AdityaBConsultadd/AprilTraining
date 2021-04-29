package Day7;

public class AbstractClass extends Demo{
    @Override
    void hello() {
        System.out.println("hey my name is aditya");
    }

    void hello(int i){

    }

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.hello();
        abstractClass.display();
        abstractClass.hello(3);
    }
    /**
     * */
}
abstract class Demo {
    abstract void hello();
    void display(){
        System.out.println("Hey I am from abstract class");
    }
}