
public class Test {

    public static void main(String s[]) throws Exception {

        Books book1 = new Books("Dsadasd", 20, "dssadd", "Address 1");
        Books book2 = new Books("asdsad", 21, "asdsdasd", "Address 2");
        Books book3 = new Books("dasda", 15, "dasd", "Address 3");
        Books book4 = new Books("asdasd", 13, "dasdsad", "Address 4");

        final Books[] books = new Books[]{book1, book2, book3, book4};

        final FileUtil<Books> util = new LibraryFileUtil();

        util.writeToFile(books);

        // Check result
        System.out.println("initial array");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        final Books[] readedValues = util.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues.length; i++) {
            System.out.println(readedValues[i]);

        }
        Orders order1 = new Orders("asds", 1233, 323, "sds", "asd");
        Orders order2 = new Orders("dsadsa", 3132, 31, "asd", "asds");
        Orders order3 = new Orders("dsadsa",312312, 123, "as", "sd");
        Orders order4 = new Orders("adssadd", 2222, 313, "ads", "assd");

        final Orders[] orders = new Orders[]{order1, order2, order3, order4};

        final FileUtil<Orders> util1 = new OrdersFileUtil();

        util1.writeToFile(orders);

        // Check result
        System.out.println("initial array");
        for (int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }

        final Orders[] readedValues1 = util1.readFromFile();

        System.out.println("readed array");
        for (int i = 0; i < readedValues1.length; i++) {
            System.out.println(readedValues1[i]);
        }

    }
}