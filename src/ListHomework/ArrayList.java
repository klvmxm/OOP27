package ListHomework;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 */
public class ArrayList<T> implements List<T>{

    T [] array;;
    private int size;

    public ArrayList(int a)
    {
        this.array = (T[])new Object[a];
        this.size = 0;
    }

    public void add(T element)
    {
        if(size() == array.length)
        {
            creatNewArray();
        }
        array[size] = element;
        size++;
    }

    public void creatNewArray()
    {
       array = Arrays.copyOf(array, array.length * (3/2) +1);
    }

    public void add(int idx, T element)
    {
        if(size() == array.length)
        {
            creatNewArray();
        }

        chekForAddGetSetRemove(idx);
        System.arraycopy(array, idx, array, idx + 1, size - idx);
        array[idx] = element;
        size++;
    }

    public void chekForAddGetSetRemove(int idx)
    {
        if(idx > size || idx < 0)
        {
            System.out.println(idx + " " + size);
            throw new IndexOutOfBoundsException();
        }
    }

    public T get(int idx)
    {
        chekForAddGetSetRemove(idx);
        return array[idx];
    }

    public T set(int idx, T element)
    {
        chekForAddGetSetRemove(idx);
        T value = array[idx];
        array[idx] = element;
        return value;
    }

    public T remove(int idx)
    {
        chekForAddGetSetRemove(idx);
        T value = array[idx];
        System.arraycopy(array, idx+1, array, idx, size - idx - 1);
        size--;
        return value;
    }

    public void removeVoid(int idx)
    {
        chekForAddGetSetRemove(idx);
        System.arraycopy(array, idx+1, array, idx, size - idx - 1);
        size--;

    }

    public boolean remove(Object o)
    {
        if(o == null)
        {
            for (int i = 0; i < size; i++)
            {
                if(array[i] == null)
                {
                    removeVoid(i);
                    return true;
                }
            }
        }

        else {
            for (int i = 0; i < size; i++)
            {
                if(array[i].equals(o))
                {
                    removeVoid(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int indexOf(Object o)
    {
        if(o == null)
        {
            for (int i = 0; i < size; i++)
            {
                if(array[i] == null)
                {

                    return i;
                }
            }
        }

        else {
            for (int i = 0; i < size; i++)
            {
                if(array[i].equals(o))
                {

                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o)
    {
    if(o == null)
    {
        for (int i = size-1; i >= 0; i--)
        {
            if(array[i] == null)
            {

                return i;
            }
        }
    }

    else {
        for (int i = size-1; i >= 0; i--)
        {
            if(array[i].equals(o))
            {

                return i;
            }
        }
    }
    return -1;
    }

//    List<T> subList(int fromIdx, int toIdx)
//    {
//        chekForAddGetSetRemove(fromIdx);
//        chekForAddGetSetRemove(toIdx);
//        T [] copy = (T[])new Object[array.length];
//        System.arraycopy(array, fromIdx, copy, 0, size - toIdx);
//        return  ;
//    }

    public boolean contains(Object o)
    {
        if(indexOf(o) > 0){
            return true;
        }
        return false;
    }

    public T reduce(BiFunction<T, T, T> func, T initial)
    {
        T result = null;
        for (int i = 0; i < size; i++) {
            initial = func.apply(initial, array[i]);
            result = initial;

        }
        return result;
    }

    public void removeIf(Predicate<T> prd) {
        for (int i = 0; i < size; i++) {
            if (prd.test(array[i]))  {
                remove(i);
            }
        }
    }

    public void forEach(Consumer<T> cons) {
        for(int i = 0; i < size; i++)
        {
            cons.accept(array[i]);
        }
    }

    public void clear()
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = null;
        }
    }


    public int size()
    {
        if(!isEmpty())
        {
            return size;
        }
        return 0;
    }

    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else return false;
    }
}
