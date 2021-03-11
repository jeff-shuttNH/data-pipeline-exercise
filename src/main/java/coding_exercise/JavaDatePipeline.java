package coding_exercise;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class JavaDatePipeline {

    public static void main(String[] args) throws Exception {

        // http://opencsv.sourceforge.net/
        final CSVReader reader = new CSVReader(new FileReader(JavaDatePipeline.class.getResource("/file1.csv").getPath()));
        final List<String[]> myEntries = reader.readAll();

        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(myEntries.get(i)));
        }

        //TODO
    }
}
