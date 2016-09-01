package Homework;

/**
 *
 */
public class ListedStack implements InterfaceStack{

    Node first;
    private int count;


    public boolean push(int element)
    {
        Node next = first;
        first = new Node(element);
        first.previous = next;
        count++;
        return true;
    }

    public Integer pop()
    {
       if(!isEmpty())
       {
           Node tmp = first;
           first = first.previous;
           count--;
           return tmp.value;
       }
        return null;
    }
    public Integer take()
    {
        if(!isEmpty()) {
            return first.value;
        }
        return null;

    }

    public int getCount()
    {
        return this.count;
    }

    public int size()
    {
        return getCount();
    }

    public boolean isEmpty()
    {
        return first == null;
    }

}

