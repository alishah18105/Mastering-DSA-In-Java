
public class Queue3 {
    public static class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class Queue{
       static Node head = null;
       static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            if(head == tail){
                tail = null;
            }
            int result = head.data;
            head = head.next;
            return result;
        }

         public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        
    }
public static void main(String args[]) {
        
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);
        Queue.add(5);
        Queue.add(6);
        Queue.remove();
        Queue.remove();
        Queue.add(10);
        Queue.add(18);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
