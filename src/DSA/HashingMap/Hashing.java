package DSA.HashingMap;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size
        System.out.println(set.size());

        // print
        System.out.println(set);

        // search
//        if(set.contains(1)){
//            System.out.println("Element exists");
//        }

        // delete
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("Element not exists");
//        }

        // iterator
        Iterator it = set.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());

        // print via loop

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
