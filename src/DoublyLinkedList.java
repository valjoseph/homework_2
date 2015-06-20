/**
 * Created by valjosephargate on 6/19/15.
 */
public class DoublyLinkedList {
    public Node first;
    public Node last;
    public int size;

    public DoublyLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    public void add(int data)
    {
        //if list is empty, add node and set as first
        //else add node after last and set as last
        if(first == null){
            first = new Node(null,data,null);
            last = first;
        }
        else
        {
            Node temp = new Node(last,data,null);
            temp = last;
        }
        size++;
    }

    public void remove(int data)
    {
        if (first.data == data)
        {
            first.next = first;
            size--;
        }
        else {
            Node cursor = first;
            while (cursor.next != null) {
                if (cursor.next.data == data)
                    cursor.next = cursor.next.next;
                    cursor.next.previous = cursor;
            }
            if (last.data == data)
            {
                last.previous = last;
            }
            size--;
        }
    }

    public int size(){
        return size;
    }

    public void print(){
        Node cursor = first;
        while(cursor != null)
        {
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }
}
