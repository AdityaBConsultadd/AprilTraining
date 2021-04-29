package Day3;

public class Operators {
    /**
     * based on operands
     *
     * unary: we one operand
     * binary: two
     * ternary: three
     *
     * task
     *unary:
     * -- , ++, +, -
     * binary:
     * arthemetic:
     * add +
     * sub  -
     * mul  *
     * div  /
     * mod  %
     *BROADMASS
     *B DMM AS
     *
     * relational:
     * <,>, <=, >= | == ,!=
     *
     *logical:
     * ||(OR) and &&(AND)
     *
     * Assignments:
     * =,+=,-=,*=,/=,%=,<<=,>>=
     * */

    public static void main(String[] args) {
        int a=(-10);
        int b=(10);
        int c=20;
        Operators op1= new Operators();
        Operators op2 = new Operators();
//        increment(++) and decrement(--)
//        prefix (--a) and postfix  (a++)
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a++);
        System.out.println(a);

        System.out.println((a+b)+c);

//        relational
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(op1 instanceof Operators);
        System.out.println();

//        logical
        System.out.println(a<b || b>c);
        System.out.println(a<b && b<c);

//      Assignments
        c&=10;
        c+=c;
        System.out.println(c);
        System.out.println();

//        bitwise shift
        int x=4; //0100 --> 0001
        int y=5; //0101 ---> 10100
        System.out.println(x>>2);
        System.out.println(y<<2);
        System.out.println(1000>>>x);

        int z= (a>b)?a:b;
//        if(a>b){
//           z=a;
//        }else
//            z=b;



    }

}
