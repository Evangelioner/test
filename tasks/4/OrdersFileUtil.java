import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;

public final  class OrdersFileUtil implements FileUtil<Orders> {


        private static final String TEST_FILE = "digital_Library1.csv";


        private final FileWorker fileWorker;


        public OrdersFileUtil() {
            fileWorker = new TextFileWorker(TEST_FILE);
        }


        @Override
        public Orders[] readFromFile() {
            final String[] lines = fileWorker.readFromFile();

            if (lines == null || lines.length == 0) {
                throw new IllegalArgumentException();
            }

            final Orders[] result1 = new Orders[lines.length];

            for (int i = 0; i < lines.length; i++) {
                result1[i] = fromLine(lines[i]);
            }

            return result1;
        }


        @Override
        public void writeToFile(final Orders[] values) {
            if (values == null || values.length == 0) {
                throw new IllegalArgumentException();
            }
            final String[] lines = new String[values.length];
            for (int i = 0; i < values.length; i++) {
                lines[i] = toLine(values[i]);
            }
            fileWorker.writeToFile(lines);
        }


        @Override
        public String toLine(final Orders order) {
            if (order == null) {
                throw new IllegalArgumentException();
            }

            final String[] array = new String[] {
                    String.valueOf(order.getTitle()),
                    String.valueOf(order.getPrice()),
                    String.valueOf(order.getId()),
                    String.valueOf(order.getImplementation()),
                    String.valueOf((order.getStatus()))
            };
            return String.join(";", array);
        }


        @Override
        public Orders fromLine(final String line) {
            if (line == null || line.isEmpty()) {
                throw new IllegalArgumentException();
            }
            final String[] parts = line.split(";");

            final Orders result1 = new Orders(
                     parts[0],
                    Long.valueOf(parts[1]),
                    Integer.valueOf(parts[2]),
                    parts[3],
                    parts[4]
            );
            return result1;
        }

    }



