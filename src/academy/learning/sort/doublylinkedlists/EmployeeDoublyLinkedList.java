package academy.learning.sort.doublylinkedlists;


public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) tail = node;
        else head.setPrevious(node);

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head=node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail=node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){
        EmployeeNode node = new EmployeeNode(newEmployee);
        if(head ==null) return false;
        EmployeeNode current =head;
        while(current != null && !current.getEmployee().equals(existingEmployee) ){
            current = current.getNext();
        }
        if(current ==null) return false;
        node.setPrevious(current.getPrevious());
        node.setNext(current);
        current.setPrevious(node);
        if(head == current){
            head=node;
        }
        else{
            node.getPrevious().setNext(node);
        }
        size++;
        return true;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        //see if remove only node in list
        if(head.getNext() ==null){
            tail =null;
        }else{
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("head-> ");
        while(current != null){
            System.out.print(current);
            System.out.print("<=>");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
