public class Stuff {
// виправити мод досупу
    private int quantity;
    private float price;
    private int numberOfPages;
    private String title;
    protected int age;
    private String publishingHouse;
    private long ean13;
    private String description;
    private Size size;

    //public String getTitle() { return title; }

    Stuff(final int quantityObj, final float priceObj,
          final int numberOfPagesObj, final String titleObj, final int ageObj,
          final String publishingHouseObj, final long ean13Obj,
          final String descriptionObj, final Size sizeObj) {
        this.quantity = quantityObj;
        this.price = priceObj;
        this.numberOfPages = numberOfPagesObj;
        this.title = titleObj;
        this.age = ageObj;
        this.publishingHouse = publishingHouseObj;
        this.ean13 = ean13Obj;
        this.description = descriptionObj;
        this.size = sizeObj;
    }

    Stuff(final int quantity, final float price, final int numberOfPages) {
        this(quantity, price, numberOfPages, "", 0,
                "", 0,"",
                new Size(0, 0));
    }

    Stuff() {
        this(0, 0, 0);
    }

    // для доступу до полів класу через get set
    public final int getQuantity() {
        return quantity;
    }
    public final void setQuantity(int quantityObj) {
        this.quantity = quantityObj;
    }

    public void setPrice(float priceObj) {
        this.price = priceObj;
    }

    public float getPrice() {
        return price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public final void setNumberOfPages(int numberOfPagesObj) {
        this.numberOfPages = numberOfPagesObj;
    }

    public final String getTitle() {
        return title;
    }

    public final void setTitle(String titleObj) {
        this.title = titleObj;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int ageObj) {
        this.age = ageObj;
    }

    public final String getPublishingHouse() {
        return publishingHouse;
    }
    public final void setPublishingHouse(String publishingHouseObj) {
        this.publishingHouse = publishingHouseObj;
    }

    public final long getEan13() {
        return ean13;
    }
    public final void setEan13(long ean13Obj) {
        this.ean13 = ean13Obj;
    }

    public final String getDescription() {
        return description;
    }
    public final void setDescription(String descriptionObj) {
        this.description = descriptionObj;
    }

    public final void setSize(final Size sizeObj) {
        this.size = sizeObj;
    }

    public final Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return " Name: " + title + "\n Quantity: " + quantity + "\n EAN13: "
                + ean13 + "\n";
    }
}

