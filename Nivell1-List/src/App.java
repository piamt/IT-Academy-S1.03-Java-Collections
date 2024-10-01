import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> myList = new ArrayList<>();
        List<Integer> myListReversed = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }

        System.out.println(myList);

        ListIterator<Integer> it
            = myList.listIterator(myList.size());

        while(it.hasPrevious()) {
            myListReversed.add(it.previous());
        }

        System.out.println(myListReversed);
    }
}
