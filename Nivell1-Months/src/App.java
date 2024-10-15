import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Month> monthList = new ArrayList<>();

        for(MyMonth myMonth: MyMonth.values()) {
            if (myMonth != MyMonth.AUGUST) {
                Month month = new Month(myMonth);
                monthList.add(month);
            }
        }

        System.out.println("ArrayList of months without August");
        for (int i=0;i<monthList.size();i++) {
            System.out.println(monthList.get(i).getName());
        }
      
        MyMonth name = MyMonth.AUGUST;
        Month month = new Month(name);
        monthList.add(7, month);

        System.out.println("\nArrayList with august");
        for (int i=0;i<monthList.size();i++) {
            System.out.println(monthList.get(i).getName());
        }

        monthList.remove(5);
        HashSet<Month> monthHashSet = new HashSet<>(monthList);

        System.out.println("\nHashSet from the ArrayList without June (unordered collection)");
        for (Month m : monthHashSet) {
            System.out.println(m.getName());
        }

        monthHashSet.add(new Month(MyMonth.JUNE));
        monthHashSet.add(null);

        // Try to duplicate month (not possible)
        monthHashSet.add(monthList.get(1));

        System.out.println("\nHashSet with null value and added June, but no duplication");
        for (Month m : monthHashSet) {
            try { // Necessary to prevent null elements to fail
                System.out.println(m.getName());
            } catch (NullPointerException e) {
                System.out.println("Access to hastSet element exception: " + e.getMessage());
            }
        }

        Iterator<Month> monthIterator1 = monthList.iterator();

        System.out.println("\nIterator from ArrayList");
        while(monthIterator1.hasNext()) {
            System.out.println(monthIterator1.next().getName());
        }

        System.out.println("\nEnsure no null in the HashSet");
        monthHashSet.remove(null);
        for (Month m : monthHashSet) {
            System.out.println(m.getName());
        }

        System.out.println("\nIterator from HashSet");
        Iterator<Month> monthIterator2 = monthHashSet.iterator();
        while(monthIterator2.hasNext()) {
            System.out.println(monthIterator2.next().getName());
        }
    }
}