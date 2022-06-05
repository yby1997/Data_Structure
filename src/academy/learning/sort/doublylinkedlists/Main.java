package academy.learning.sort.doublylinkedlists;


import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",4567);
        Employee marySmith = new Employee("mary","smith",22);
        Employee mikeWilson = new Employee("Mike","wilson",324);
        Employee larry = new Employee("larry","yang",886);

        EmployeeDoublyLinkedList list =new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        list.addBefore(larry,marySmith  );

        list.printList();
        System.out.println(list.getSize());


        Employee billEnd=new Employee("bill","end",78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());


        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(janeJones);
        linkedList.addFirst(johnDoe);
        linkedList.addFirst(marySmith);
        linkedList.addFirst(mikeWilson);

        Iterator<Employee> iter = linkedList.iterator();
        System.out.println("head -> ");
        while(iter.hasNext()){
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
    }


}
