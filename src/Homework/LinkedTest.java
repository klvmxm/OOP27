package Homework;

/**
 *
 */
public class LinkedTest {
    public static void main(String[] args) {

        ListedStack n = new ListedStack();
        n.push(11);
        n.push(12);
        System.out.println(n.take());
        //n.push(16);
        System.out.println(n.size());
        System.out.println(n.take());
        n.pop();
        System.out.println(n.size());
        System.out.println(n.take());
        //n.pop();
        //System.out.println(n.pop());
    }
}
