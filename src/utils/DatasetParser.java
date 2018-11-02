package utils;

import models.Lego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatasetParser {

    public static ArrayList<Lego> parseDataSet(String datasetPath) {
        ArrayList<Lego> items = new ArrayList<>();

        try (FileReader fileStream = new FileReader(new File(datasetPath));
            BufferedReader bufferedReader = new BufferedReader(fileStream)) {
            String line;
            boolean firstLine = true;

            while ((line = bufferedReader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] elements = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                if (elements.length == 14) {

                    // removing quiotes around strings
                    for (int i = 0; i < elements.length; i++)
                        elements[i] = elements[i].replaceAll("^\"|\"$", "");

                    items.add(new Lego(elements));
                }
            }
            return items;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return null;
    }
}
