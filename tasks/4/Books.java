import java.util.Date;

public class Books {



    private String title;

    private long price;

    private String availability;
    private String  publication;

    public Books() {
    }


    public Books(String Title, long price, String availability, String publication) {
        this.title = Title;
        this.price = price;
        this.availability = availability;
        this.publication= publication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice (long price) {
        this.price = price;
    }

    public String  getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability =availability;
    }

    public String getPublication () {
        return publication;
    }


    public void setPublication(String publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Book [title =" + title + ",price= " + price + ", availability = " + availability + ", date of publication = "
                + publication + "]";
    }

}
