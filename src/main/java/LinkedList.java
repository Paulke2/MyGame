public class LinkedList  {
Node head;
    public void append(int data){
        if (head ==null){
            head = new Node(data);

        }
        Node current = head;
        // this while loop gets us to the end of the linked list
        while(current.next !=null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void delete(int data){
        //if we what to delete the head, thsi is how to do it
        if (head.data == data){
            head = head.next;
            return;
        }
        if(head == null){
            return;
        }
        Node current = head;
        while (current.next!=null){
            if (current.next.data == data){
                //by useing next.next we are walking over the value
                // we want to delete
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
