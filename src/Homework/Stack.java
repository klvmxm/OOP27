package Homework;


/**
 *
 */
public class Stack implements InterfaceStack
    {
        int [] array;
        int top;

        public Stack(int a)
        {
            this.array = new int[a];
            top = -1;
        }

        public boolean push(int element)
        {
        if(size() == array.length)
        {
            creatNewArray();
        }
        array[top+1] = element;
        top++;
        return true;
        }
        public void creatNewArray()
        {
            int [] copy = new int[array.length+1];
            System.arraycopy(array, 0, copy, 0, array.length);
            array = copy;
        }
        public Integer pop()
        {
            if(!isEmpty())
        {
            int lastOne = array[top];
            top--;
            return lastOne;
        }
            return null;
        }
        public Integer take()
        {
            if(!isEmpty())
            {
                return array[top-1];
            }
            return null;
        }

        public int size()
        {
            if(!isEmpty())
            {
                return top+1;
            }
            return 0;
        }

        public boolean isEmpty()
        {
            if(top == -1)
            {
                return true;
            }
            else return false;
        }

    }


