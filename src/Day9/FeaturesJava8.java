package Day9;

import java.util.ArrayList;
import java.util.List;

public class FeaturesJava8 {
//    functional interface
//    static and default keyword in interface
//    lambda
//    Streams or Stream API
    public static void main(String[] args) {
        A a= (int x)->{
            System.out.println(x*x);
        };
        a.display(5);
        a.display(3);
        a=(int b)->{
            System.out.println(b+b);
        };
        a.display(5);
        a.display(43);


        List<Integer> list = new ArrayList();
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.forEach(
            System.out::println
        );

    }


}
interface A{
    void display(int a);
}
