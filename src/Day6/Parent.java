package Day6;

public class Parent {
    String name="aditya";
    int age=10;
    public static void main(String[] args) {
        Child child= new Child();
        child.display();
        child.ageAfter10(10);
        Parent parent = new Parent();
        parent.display();
        parent.ageAfter10(19);

    }
    void display(){
        System.out.println("Hey this is parent");
    }
    void ageAfter10(int age){
        age= age+10;
        System.out.println(age);
    }
}
/**
 * keyword: extends
 *
 * syntax: class child<name> extends parent<name>{}
 *
 * types:
 * single:
 * multilevel:
 * hierarchy
 *
 * */
class Child extends Parent{
    Child() {
        name = "aditya";
        age = 10;
    }
}
