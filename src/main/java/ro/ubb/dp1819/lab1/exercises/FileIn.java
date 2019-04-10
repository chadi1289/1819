package ro.ubb.dp1819.lab1.exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIn {
    private static final String file = "C:\\Users\\Chadi\\Desktop\\Design Patern\\ubb.dp.1819-master\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\exercises\\filein.txt";

    public static List<String> fileToStringList() {
        List<String> listString = new ArrayList<>();
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                listString.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return listString;
    }
}