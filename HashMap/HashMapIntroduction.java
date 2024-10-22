package HashMap;

public class HashMapIntroduction {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.hashCode());
        // if employee not available hashcode..it go object class
        String s = "AB";
        String s2 = "AB";
        System.out.println(s.hashCode());
        String s1 = new String("AB");
        String s3 = new String("AB");
        System.out.println(s1.hashCode());
        System.out.println(s.hashCode() == s1.hashCode());// both object is different,but hashcode same
        System.out.println(s == s2);// compare memory reference
        // string constant pool..string literal store
    }
}
