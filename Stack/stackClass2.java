
import java.util.ArrayList;
public class stackClass2 {
    class Stack {
      static  ArrayList <Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.isEmpty();
        }

        public static void push(int data){
            list.add(data);
        }

        public static  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            list.remove(list.size() -1);
            return top;
        }

        public static  int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() -1);
            return top;
        }
    }

    public static void main(String args[]){
        
        Stack.push(10);
        Stack.push(5);
        Stack.push(3);

        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
    
}
