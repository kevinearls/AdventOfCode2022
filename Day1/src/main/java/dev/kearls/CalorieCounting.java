package dev.kearls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CalorieCounting {
    public Integer findMaximumCalories(String inputFileName) throws IOException {
        var lines = getInput(inputFileName);

        int maximum = Integer.MIN_VALUE;
        int total = 0;
        for (String line : lines) {
            if (line.trim().isEmpty()) {
                //System.out.println("BLANK");
                if (total > maximum) {
                    maximum = total;
                }
                total = 0;
            } else {
                //System.out.println(line);
                var current = Integer.parseInt(line);
                total += current;
            }
        }

        if (total > maximum) {
            maximum = total;
        }

        return maximum;
    }

    public List<String> getInput(String filename) throws IOException {
        Path inputFile = Paths.get(filename);



        List<String> lines = Files.readAllLines(inputFile);
        System.out.println("Input has " + lines.size() + " lines");

        return lines;
    }
}
