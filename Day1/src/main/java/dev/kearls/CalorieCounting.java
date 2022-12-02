package dev.kearls;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalorieCounting {

    // Return the total calories for the top3 elves
    public Integer findTopThree(String inputFileName) throws IOException {
        var lines = getInput(inputFileName);

        // TODO can we change the input to use a stream, and map just to totals, then sort that?
        List<Integer> totals = new ArrayList<>();
        int total = 0;
        for (String line : lines) {
            if (line.trim().isEmpty()) {
                totals.add(total);
                total = 0;
            } else {
                var current = Integer.parseInt(line);
                total += current;
            }
        }
        totals.add(total);

        Collections.sort(totals);
        Collections.reverse(totals);

        var result = totals.get(0) + totals.get(1) + totals.get(2);
        return result;
    }

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
