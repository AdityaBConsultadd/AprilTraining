package Day6;

public class Inner {
   static class InnerClass{
       InnerClass(){
           display();
       }
          void display(){
              System.out.println("Hey i am in a inner class");
          }
    }

    public static void main(String[] args) {
       Inner.InnerClass innerClass= new Inner.InnerClass();
       Inner inner = new Inner();
        display();
    }
    static void display(){
        System.out.println("Hey I am in outer class");
    }

}


