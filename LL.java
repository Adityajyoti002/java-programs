class LL {
    Node head;
    class Node {
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add - first, last
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printlist(){
        if (head == null){
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("already null nothing to delete");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("already null nothing to delete");
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

        list.addlast("list");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();

    }
}