public class LLcopy {
    LL.Node head;
    class Node{
        int data;
        LL.Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        LL.Node newNode = new LL.Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        LL.Node newNode = new LL.Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        LL.Node currNode = head;
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
        LL.Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
    }
    //delete - first,last
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
}
