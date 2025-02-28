
class LL{
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
    
    }
    
    void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
        
    }
    
    void displayText(){
        Node curNode = head;
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(curNode != null){
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }
         System.out.println("Null");
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.displayText();
        
    }
}
