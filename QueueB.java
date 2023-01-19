//circular queue using array
public class QueueB {
    static class queue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

       queue(int size){
           this.size = size;
           arr = new int[size];
       }

       public static boolean isEmpty(){
           return rear ==-1 && front == -1;
       }

       public static boolean isFull(){
           return (rear+1)%size == front;
       }

       public static void add(int data){
           if (isFull()){
               System.out.println("Overflow");
               return;
           }
           //if its the first element
           if (front==-1){
               front=0;
           }
           rear = (rear+1)%size;
           arr[rear]=data;
       }
    }
}
