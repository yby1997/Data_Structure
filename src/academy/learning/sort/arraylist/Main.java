package academy.learning.sort.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("jane","jones",123));
        employeeList.add(new Employee("john","doe",4567));
//        Employee mary = new Employee("mary","smith",22);
//        employeeList.add(mary);
        employeeList.add(new Employee("mary","smith",22));
        employeeList.add(new Employee("mike","wilson",3245));
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("john","adams",4568));
//        employeeList.forEach(employee -> System.out.println(employee));
//        System.out.println(employeeList.size());
        employeeList.add(3, new Employee("john","doe",4567));
//        employeeList.forEach(employee -> System.out.println(employee));

//        Object[] employeeArray = employeeList.toArray();
        Employee[] employeeArray2 = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee:employeeArray2){
            System.out.println(employee);
        }
        System.out.println(Arrays.toString(employeeArray2));
        System.out.println(employeeList.contains(new Employee("mary","smith",22)));
        List<Integer>a = new ArrayList<>(5);
    }
}
