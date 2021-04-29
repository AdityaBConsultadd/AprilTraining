package Day8;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {
    /**
     * Throwable:
     * Error: checked
     * Error: unchecked
     * Exception:
     *
     * keyword:
     * throw
     * throws
     * finally
     * try & catch
     *
     * try & catch
     * try & multiple Catch
     * try, catch and finally
     * nested try & catch
     *
     * */

     static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int a[]={1,2,4,5,4};
        int b=5;
        int c=0;
        System.out.println(a);
//        System.out.println(a[5]);
        try{
//            System.out.println(a[1576]);
            try {
                System.out.println(b / c);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
            System.out.println("array out of bound");
        }catch (ArithmeticException e){
//            System.out.println(e);
            System.out.println("by zero");
        }
//
//        boolean flag=false;
//        try{
////            System.out.println(a[-18]);
////            System.out.println(b/c);
//            System.out.println(in.nextInt());
//        }catch (ArithmeticException e){
//            flag=true;
//            System.out.println(e);
//            System.out.println("I got an exception");
//        } finally {
//            if(flag)
//            System.out.println("we have dealt with exception");
//            else
//                System.out.println("exception not caught");
//        }
//
//        System.out.println("After the exception");
        Exceptionhandling h = new Exceptionhandling();
        try {
            h.display();
        }catch (InputMismatchException e){
            System.out.println("We have got an exception");
        }


    }

    void display() {
        int a = in.nextInt();
        int b = in.nextInt();
        if(a==0 || b==0)
            throw new ArithmeticException();
        System.out.println(a/b);

    }
}
