package Day7;

import java.util.List;

public class Interfaces implements Demo2,Practice {
    /**abstraction: interface
     * implemented*/
    public static void main(String[] args) {
        Practice interfaces = new Interfaces();
        Demo2 interfaces1 = new Interfaces();


    }

//    @Override
//    public void display() {
//        System.out.println("Hey I am working");
//    }
}
interface Practice {
    static void display(){
        System.out.println("Hey I am interface Practice");
    }
}
interface Demo2{
    static void display(){
        System.out.println("Hey I am interface Demo2");
    }
}