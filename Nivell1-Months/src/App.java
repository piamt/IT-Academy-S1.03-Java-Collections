import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Month> monthList = new ArrayList<>();

        for(Month.MyMonth myMonth: Month.MyMonth.values()) {
            if (myMonth != Month.MyMonth.AUGUST) {
                Month month = new Month(myMonth);
                monthList.add(month);
            }
        }

        // Print list of months without August
        for (int i=0;i<monthList.size();i++) {
            System.out.println(monthList.get(i).getName());
        }
      
        Month.MyMonth name = Month.MyMonth.AUGUST;
        Month month = new Month(name);
        monthList.add(7, month);

        // Print list of months with August
        System.out.println("ArrayList with august");
        for (int i=0;i<monthList.size();i++) {
            System.out.println(monthList.get(i).getName());
        }

        // Remove month of June to test HashSet later
        monthList.remove(5);

        // Create a HashSet from the ArrayList
        HashSet<Month> monthHashSet = new HashSet<>(monthList);

        // Print hashset (unordered list of months)
        System.out.println("HashSet:");
        for (Month m : monthHashSet) {
            System.out.println(m.getName());
        }

        // Add missing month
        monthHashSet.add(new Month(Month.MyMonth.JUNE));

        // Add null value
        monthHashSet.add(null);

        // Try to duplicate month (not possible)
        monthHashSet.add(monthList.get(1));

        // Print HashSet again
        System.out.println("HashSet with null value and added June");
        for (Month m : monthHashSet) {
            try {
                System.out.println(m.getName());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }

        Iterator<Month> monthIterator1 = monthList.iterator();

        System.out.println("Iterator from ArrayList");
        while(monthIterator1.hasNext()) {
            System.out.println(monthIterator1.next().getName());
        }

        System.out.println("Ensure no null in the HashSet");
        monthHashSet.remove(null);
        for (Month m : monthHashSet) {
            System.out.println(m.getName());
        }

        System.out.println("Iterator from HashSet");
        Iterator<Month> monthIterator2 = monthHashSet.iterator();
        while(monthIterator2.hasNext()) {
            System.out.println(monthIterator2.next().getName());
        }
    }
}