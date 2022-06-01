package academy.learning.sort.linkedlists;

import academy.learning.sort.linkedlists.Employee;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",4567);
        Employee marySmith = new Employee("mary","smith",22);
        Employee mikeWilson = new Employee("Mike","wilson",3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());

        System.out.println(1%10);

    }


}
