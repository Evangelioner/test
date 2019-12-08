public class Orders {

    private String title;
    private long id;
    private int price;
    private String status;
    private String  implementation;
    public Orders() {
    }


    public Orders(String Title, long id, int price, String status, String implementation) {

        this.title = Title;
        this.id = id;
        this.price = price;
        this.status = status;
        this.implementation= implementation;
    }
    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public void setPrice (int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status =status;
    }

    public String getImplementation () {
        return implementation;
    }


    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    @Override
    public String toString() {
        return "Order [id  = " + id + ", title =" + title + ",price= " + price + ", status = " + status + ", implementation = "
                + implementation + "]";
    }

}
