public class Month {

    public static enum MyMonth {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    final private MyMonth name; 

    public MyMonth getName() {
        return name;
    }

    public Month(MyMonth name) {
        this.name = name;
    }
}