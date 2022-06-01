package academy.learning.sort.doublylinkedlists;



public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("jane","jones",123);
        Employee johnDoe = new Employee("john","doe",4567);
        Employee marySmith = new Employee("mary","smith",22);
        Employee mikeWilson = new Employee("Mike","wilson",324);

        EmployeeDoublyLinkedList list =new EmployeeDoublyLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());


        Employee billEnd=new Employee("bill","end",78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
    }


}
