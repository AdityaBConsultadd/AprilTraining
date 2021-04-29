package Day5;

public class OOPS {

//    functions
//    pre-defined
//    custom or user defined
    /**
     * with return and without param
     * with return and with para
     * with para and witho
     * with para and with return
     *
     *
     * */

    public static void main(String[] args) {
        /**
         *
         * functional:
         * add()
         * sub()
         * div()
         * pro()
         * sort()
         * filter()
         *
         *
         *
         * OOPs:
         *
         * Encapsulation:
         * constructors
         *
         *
         *
         *
         * inheritence
         * ploy
         * abst
         *
         * */

        A a = new A("aditya");
        A c = new A();
        A b = new A("aditya","aditya@gmail.com",32);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        a.WNPWNR();
        a.WPWNR(435);
        int x=a.WRWP(18);
        int z=a.WRWNP(a.age);
        System.out.println(z+" "+x);



    }

}


class  A{
    String name;
    String email;
    int age;
    A(){
        System.out.println("Hey this class is being called");
    }

    public A(String name) {
        this.name = name;
    }

    public A(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
    void WPWNR(int age){
        System.out.println("Hey I am "+ age +" yr old");
    }
    void WNPWNR(){
        System.out.println("Hey my name is "+name);
    }
    int WRWNP(int age){
        System.out.println("I will be 1 yr older");
        age++;
        return age;
    }
    int WRWP(int age){
        age=age+5;
        return age;
    }
}
