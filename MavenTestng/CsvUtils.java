package MavenTestng;

import java.io.*;
import java.util.*;

public class CsvUtils {

    public static Object[][] getCSVData(String path) throws Exception {

        List<Object[]> dataList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        boolean firstRow = true;

        while ((line = br.readLine()) != null) {

            if (firstRow) {   // skip header
                firstRow = false;
                continue;
            }

            String[] values = line.split(",");
            dataList.add(values);
        }

        br.close();

        Object[][] data = new Object[dataList.size()][];

        for (int i = 0; i < dataList.size(); i++) {
            data[i] = dataList.get(i);
        }

        return data;
    }
}
