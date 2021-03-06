public class Calendar extends Stuff {

    public CalendarType kindOfCalendar;
    public Calendar() {

    }

    Calendar(final CalendarType kindOfCalendar, final int quantity,
             final float price, final int numberOfPages, final String title,
             final int age, final String publishingHouse, final long ean13,
             final String description, final Size size) {
        super(quantity, price, numberOfPages, title, age, publishingHouse,
                ean13, description, size);
        this.kindOfCalendar = kindOfCalendar;
    }

    Calendar(final String title, final int age, final int quantity,
             final long ean13) {
        super(quantity, 0, 0, title, age,
                "", ean13, "",
                new Size(0, 0));

        this.kindOfCalendar = CalendarType.WALL_CALENDARS;
    }

    public CalendarType getKindOfCalendar() {
        return kindOfCalendar;
    }

    public final void setKindOfCalendar(CalendarType kindOfCalendarObj) {
        this.kindOfCalendar = kindOfCalendarObj;
    }

    @Override
    public String toString() {
        return "Kind of calendar " + kindOfCalendar + "\n";
    }

}

