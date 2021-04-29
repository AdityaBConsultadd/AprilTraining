package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StreamApi {
    /**
     * -> we create a copy that doesn't have any effect on the source
     * -> one stream can be used once
     */
    public static void main(String[] args) {
        int[] a = {1,2,343,345,456,54,53,3,24,345};
        IntStream s = Arrays.stream(a);
        System.out.println(s.max());
        System.out.println(Arrays.stream(a).average());
        System.out.println(Arrays.stream(a).min());

        for (int j : a) {
            if (j % 2 == 0) {
            }
            else
                System.out.println(j);
        }
        System.out.println();
        //filter
//        foreach
//        collect
        Arrays.stream(a).filter(n->n%2!=0).forEach(System.out::println);
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 23, 4, 5, 6, 43, 45));
        System.out.println(arrayList);
        long l =arrayList.stream().count();
        List arrayList1= new ArrayList<Integer>();
        arrayList1 =   arrayList.stream().collect(Collectors.toList());

        Student[] students= {
                new Student(1,"aditya",325),
                new Student(2,"Babita",342),
                new Student(3,"ritu",100),
                new Student(4,"Riyaz",500)

        };
//        Arrays.stream(students).forEach(System.out::println);
////
//        Arrays.stream(students).filter(n->n.total<400).forEach(System.out::println);
//
////        map
//        Arrays.stream(students).map(n->n.total+10).forEach(System.out::println);
//        for (Student s1 :students){
//            System.out.println(s1);
//        }
//        reduce
//        Arrays.stream(students).reduce((n,u)->{
//            int i= u.total;
//            int sum=0;
//            sum=sum+i;
//            return n;
//        });
        Arrays.stream(students).map(n->n.total).reduce(0,(n,u)->n+u).intValue();
        System.out.println(Arrays.stream(students).map(n->n.total+10).reduce(0,(n,u)->n+u));




    }
}
class Student{
    public int id;
    public String name;
    public int total;

    public Student(int id, String name, int total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
