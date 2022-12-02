package dev.kearls;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static dev.kearls.Common.getInput;


public class RockPaperScissors {
    public int getTotalScore(String filename) throws IOException {
        List<String> lines = getInput(filename);
        for (String line : lines) {
            var blah = line.split(" ");
            //System.out.println("Blah has " + blah.length + " parts: " + Arrays.toString(blah));
        }

        return 0;
    }


}
