import com.senla.training.FileWorker;
import com.senla.training.TextFileWorker;



    public final class LibraryFileUtil implements FileUtil<Books> {

        private static final String TEST_FILE = "digital_Library.csv";


        private final FileWorker fileWorker;


        public LibraryFileUtil() {
            fileWorker = new TextFileWorker(TEST_FILE);
        }


        @Override
        public Books[] readFromFile() {
            final String[] lines = fileWorker.readFromFile();

            if (lines == null || lines.length == 0) {
                throw new IllegalArgumentException();
            }

            final Books[] result = new Books[lines.length];

            for (int i = 0; i < lines.length; i++) {
                result[i] = fromLine(lines[i]);
            }

            return result;
        }


        @Override
        public void writeToFile(final Books[] values) {
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
        public String toLine(final Books book) {
            if (book == null) {
                throw new IllegalArgumentException();
            }

            final String[] array = new String[] {
                    String.valueOf(book.getTitle()),
                    String.valueOf(book.getPrice()),
                    String.valueOf(book.getAvailability()),
                    String.valueOf(book.getPublication())
            };
            return String.join(";", array);
        }


        @Override
        public Books fromLine(final String line) {
            if (line == null || line.isEmpty()) {
                throw new IllegalArgumentException();
            }
            final String[] parts = line.split(";");

            final Books result = new Books(
                    parts[0],
                    Long.valueOf(parts[1]),
                    parts[2],
                    parts[3]
            );
            return result;
        }

    }

