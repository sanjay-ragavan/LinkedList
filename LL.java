public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int data) {
        if(tail == null){
            insertFirst(data);
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;
//        tail.next = null; //optional
        size+=1;
    }

    public void insert(int index, int data) {
        if (index == 0){
            insertFirst(data);
        }
        if(index == size){
            insertLast(data);
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(data,temp.next);
        temp.next = newNode;
    }

    public int deleteFist(){
        int value = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if(size <=1){
            deleteFist();
        }

        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFist();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node previous = get(index - 1);
        int val = previous.next.data;
        previous.next = previous.next.next;
        return val;
    }

    public void reverse(){
        Node current = head, prev = null, next;

        while(current.next != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node temp = head;
        while (temp != null){
            if(temp.data == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
