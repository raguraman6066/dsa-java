package HashSet;

import java.util.HashSet;
import java.util.Set;

import HashMap.Employee;

public class HashSetInternal {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // internal ds for hashset is hashmap
        set.add("A");// hashMap.put("A",PRESENT) present is object of object class -Object obj=new
                     // Object()
        System.out.println(set.add("A"));// false

        // hashset - not allow duplicate value..hashmap -allow duplicate value..not
        // duplicate key
        // select *from Employee

        Set<Employee> empSet = new HashSet<>();
        Employee e = new Employee(1);
        Employee e1 = new Employee(1);
        Employee e2 = new Employee(3);
        Employee[] emp = new Employee[3];
        emp[0] = e;
        emp[1] = e1;
        emp[2] = e2;

        for (int i = 0; i < emp.length; i++) {
            empSet.add(emp[i]);
        }
        System.out.println(empSet);
    }
}
