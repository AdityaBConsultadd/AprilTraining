package Day4;

public class Looping {
    public static void main(String[] args) {
//        loop:
//        for(init;condition;step size) :when we know the no. iterations
//        for(int i= 0;i<10;i++)
//            System.out.println("Hello");
//        int sum=0;
//        for (int i = 0; i < 80; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);
//
//
//        for(;sum>100;){
//            sum-=1000;
////            System.out.println(sum++);
//        }
//        System.out.println(sum);
//
////        while(condition)
//
//        while(sum>0){
//            System.out.println(sum);
//            sum+=100;
//        }
//        System.out.println(sum);

//        do{}while();
//        do{
//            System.out.println("Hello");
//        }while(sum>100);
//
//        int a[]={1,2,4,5,6,7,7,7};
//
//        for (int x: a) {
//            System.out.println(x);
//        }
//        System.out.println();
//
//        for (int i =0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        break and continue
        for(int i =0; i<10;i++){
            System.out.println(i);
            if(i==5)
                continue;
            if(i==7)
                break;
            System.out.println(i);

        }

    }
}
