package dev.kearls;

import org.junit.jupiter.api.Test;
import dev.kearls.Common;

import java.io.IOException;
import java.util.List;

import static dev.kearls.Common.getInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRockPaperScissors {
    @Test
    public void testStrategy() throws Exception {
        String inputFileName = "src/main/resources/TestInput.txt";

        List<String> lines = getInput(inputFileName);
        System.out.println(lines);
    }

    @Test
    public void testPart1Example() throws IOException {
        String inputFileName = "src/main/resources/TestInput.txt";
        var rps = new RockPaperScissors();
        assertEquals(15, rps.getTotalScore(inputFileName));
    }

    @Test
    public void testPart1() throws IOException {
        String inputFileName = "src/main/resources/input.txt";
        var rps = new RockPaperScissors();
        assertEquals(15, rps.getTotalScore(inputFileName));
    }

}
