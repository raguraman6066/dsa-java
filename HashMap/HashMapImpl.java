package HashMap;

import java.util.Map;
import java.util.HashMap;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<Employee, Integer> m = new HashMap<>();
        Employee employee1 = new Employee(1);
        Employee employee2 = new Employee(2);
        Employee employee3 = new Employee(3);
        Employee employee4 = new Employee(4);
        // from second employee onwards it checks the hashcode is same or not..using
        // equal method..if not.it crete new index..otherwise replay the value in
        // existing index
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee2.equals(employee1));
        m.put(employee1, 55);
        m.put(employee2, 80);
        m.put(employee3, 60);
        m.put(employee4, 57);
        System.out.println(m.get(employee1));
        System.out.println(m);

        // map is interface but not collection framework

    }
}
