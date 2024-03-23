/*
 * Collection Framework
 * List
 * LinkedList
 * ArrayList
 */

package collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class collection {

    public static void main(String[] args){
        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Iswarya"); /* add method */
        arrayList.add("Ajay");
        arrayList.add("Nila");
        arrayList.add("Aswitha");
        System.out.println(arrayList);
        arrayList.add(1,"karpagavalli"); /* add method  in index */
        System.out.println(arrayList);
        System.out.println(arrayList.size()); /* size method */
        final ArrayList<String> list = new ArrayList<>();

        list.add("Dhoni"); /* add method */
        list.add("hardik");
        arrayList.addAll(list);
        System.out.println(arrayList);
        list.clear(); /* clear method */
        System.out.println(list);
        System.out.println(arrayList.contains("Ajay")); /* contains method */
        System.out.println(arrayList.get(0)); /* get method */
        System.out.println(list.isEmpty()); /* empty method */
        System.out.println(arrayList.remove(2)); /* remove method */
        final ArrayList<String> arraylist = new ArrayList<>();

        arraylist.add("Apple");  /* add method */
        arraylist.add("grapes");
        arraylist.add("banana");
        System.out.println(arraylist.indexOf("Strawberry")); /* indexOf method */
        System.out.println(arraylist.lastIndexOf("black berry")); /* lastIndexOf method */
        arraylist.remove(1); /* remove method */
        System.out.println(arraylist);
        arraylist.clear(); /* clear method */
        System.out.println(arraylist);
        final LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.offer(10); /* offer method */
        linkedList.offer(20);
        linkedList.offer(30);
        linkedList.offer(40);
        System.out.println(linkedList);
        linkedList.offerFirst(30); /* offerFirst method */
        System.out.println(linkedList);
        linkedList.offerLast(50); /* offerLast method */
        System.out.println(linkedList);
        linkedList.pollFirst(); /* pollFirst method */
        System.out.println(linkedList);
        linkedList.pollLast(); /* pollLast method */
        System.out.println(linkedList);
        linkedList.removeFirst(); /* removeFirst method */
        System.out.println(linkedList);
        linkedList.removeLast(); /* removeLast method */
        System.out.println(linkedList);
        final Integer getFirst = linkedList.getFirst(); /* getFirst method */

        System.out.println(getFirst);
        final Integer getLast = linkedList.getLast(); /* removeLast method */

        System.out.println(getLast);
        System.out.println(linkedList.size()); /* size method */
    }
}


