
public class Main {

    public final static void main(String[] args) {

        BookStore bukva = new BookStore();

        Book book1 = new Book("Bad Blood", 18,
                2, 3625732574267L);
        Coloring coloring1 = new Coloring("Sun", 6,
                4, 6437484357314L);
        Calendar calendar1 = new Calendar("2019", 1,
                1, 5634264835168L);

        // поміщення у магазин
        bukva.addItem(book1);
        bukva.addItem(coloring1);
        bukva.addItem(calendar1);

        for (String element : bukva.getListOfItems()) {
            System.out.println(element);
        }

        System.out.println();

        // сортування методом класу
        BookStore.sortByName(bukva.getList(), true);
        BookStore.sortByAge(bukva.getList(), false);
        // сортування методом обєкту
        bukva.sortByName(true);

        for (String element : bukva.getListOfItems()) {
            System.out.println(element);
        }

        System.out.println();

        for (Stuff element : bukva.findByAge(6, 18)) {
            System.out.println(element.getTitle());
        }

    }
}
