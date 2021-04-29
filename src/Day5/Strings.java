package Day5;

import java.util.Locale;

public class Strings {
    /**
     * string
     * string buffer and string builder
     * */
    public static void main(String[] args) {
        String a= "Aditya";
        String b="Aditya ";
        String c = new String("aditya");
        String d = "Good";
        String e="Morning";
        System.out.println(a + " " + a.toUpperCase());
        a=a.toUpperCase();
        d= d+e+1+2;
        System.out.println(d);
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        StringBuffer s = new StringBuffer("Aditya");
        StringBuffer s1 = new StringBuffer("Aditya");
        StringBuilder s2 = new StringBuilder("aditya");
        StringBuilder s3 = new StringBuilder("aditya");
        System.out.println(s.insert(2,"ad"));
        s2.insert(2,"ad");
        System.out.println(s2);

    }

}
