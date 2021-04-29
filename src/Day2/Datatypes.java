package Day2;

import java.util.Scanner;

public class Datatypes{
    int a=10;
    public static void main(String[] args) {
//        boolean
        boolean bool=true;  // 1byte
//        unsigned
        char character='a'; // 2 bytes
//        integers
        byte bytes=-128;// 1 byte
        short shorts=2334; //  2 bytes 32000
        int integer=235435999; // 4 bytes
        long longdata=239438492; // 8 bytes
//        floating point
        float floating=2354359999f; // 4bytes
        double doubledata=324325436.0; // 8 bytes

//        non : strings ,arrays, collection, class
        String string ="hgcgh";
        int nd=10;
//        System.out.printf();
        /**
         * Naming of variables
         * -No limit of the size
         * -can't give a name with numeric
         * -we can use alphanumeric
         * -underscore can be used (_)
         * variable or function : the first alphabet should in lowercase after that we can use camel case
         * class: it should start with a capital and afterwards the camelcase
        * */
//        System.out.printf("Hey %d",integer);
        System.out.print(" Aditya");

//        keyword: 64



        Scanner in = new Scanner(System.in);

//
//        boolean bool=in.nextBoolean();  // 1byte
////        unsigned
//        char character=in.next().charAt(0); // 2 bytes
////        integers
//        byte bytes=in.nextByte();// 1 byte
//        short shorts=in.nextShort(); //  2 bytes 32000
//        int integer=in.nextInt(); // 4 bytes
//        long longdata=in.nextLong(); // 8 bytes
////        floating point
//        float floating=in.nextFloat(); // 4bytes
//        double doubledata=in.nextDouble();

        String s = in.next();

//        System.out.println(a);

    }
    void display(){
        System.out.println(a);
        a=10;
    }
}
