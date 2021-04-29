package Day4;

public class Arrays {
    public static void main(String[] args) {
//        arrays
//        1d, multi {[][][][][][]},[][][][][][][][][]
//
//        int a[10];
        int[] b= new int[10];
        int []c;
        c=new int[20];
        int[] d[];
//        a =    {1,2,4,5,6,7,7,7}
//        a[0] address is 12
//        a[1] address =16

        int[] a[]={{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7},{1,2,4,5,6,7,7,7}};



        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(j);
            }
            System.out.println();
        }




    }
}
