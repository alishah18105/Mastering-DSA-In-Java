
//Stack Implementation With Array List

public class stackClass {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;

        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

       public static void push(int data){ // Push method: To add data in the stack at the top
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        }

        public static int pop(){  //Pop Method: To remove the top value from the stack 
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){ //Peek Method: To return top value of the stack
            if(isEmpty()){
                return -1;
            }
            return head.data; 
        }

        public static void main(String args[]){
           
            Stack.push(10);
            Stack.push(5);
            Stack.push(7);
            Stack.push(4);
            
            while(!Stack.isEmpty()){
                System.out.println(Stack.peek());
                Stack.pop();
            }




        }
    }
}
