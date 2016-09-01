package Homework;

/**
 *
 */
public class ListedQue implements InterfaceStack{

    Node first, back;
    private int count;


    public boolean push(int element)
    {
        if( isEmpty( ) )
            back = first = new Node(element);
        else
            back = back.previous = new Node(element);
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