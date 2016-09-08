package ListHomework;

import java.util.Arrays;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(3);

        arr.add(1);
        //arr.set(1, "1");
        //System.out.println(arr.get(1));

        arr.add(2);


        arr.add(49);
        arr.add(13);
        //arr.set(3, "2");
        //System.out.println(arr.lastIndexOf("1"));
        //System.out.println(arr.remove(1));
        //System.out.println(arr.get(1));
        System.out.println(arr.reduce((a, b) -> (a + b), 0));
        //arr.removeIf((e) -> e.equals("1"));
        //arr.forEach((Integer element) -> System.out.println(element));
    }

}
