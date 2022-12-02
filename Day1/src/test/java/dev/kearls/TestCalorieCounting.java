package dev.kearls;

import org.junit.jupiter.api.Test;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalorieCounting {
    @Test
    public void testPart1Example() throws Exception{
        String inputFileName = "src/main/resources/TestInput.txt";
        CalorieCounting calorieCounting = new CalorieCounting();
        assertEquals(24000, calorieCounting.findMaximumCalories(inputFileName));
    }

    @Test
    public void testPart1() throws Exception {
        String inputFileName = "src/main/resources/input.txt";
        CalorieCounting calorieCounting = new CalorieCounting();
        assertEquals(71506, calorieCounting.findMaximumCalories(inputFileName));
    }

    @Test
    public void testRelativePath() {
        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
        System.out.println(path.toFile());
    }

    @Test
    public void testPart2Example() throws Exception{
        String inputFileName = "src/main/resources/TestInput.txt";
        CalorieCounting calorieCounting = new CalorieCounting();
        assertEquals(45000, calorieCounting.findTopThree(inputFileName));
    }

    @Test
    public void testPart2() throws Exception {
        String inputFileName = "src/main/resources/input.txt";
        CalorieCounting calorieCounting = new CalorieCounting();
        assertEquals(209603, calorieCounting.findTopThree(inputFileName));
    }

    @Test
    public void testStreamingStuff() throws Exception {
        String inputFileName = "src/main/resources/TestInput.txt";
        CalorieCounting calorieCounting = new CalorieCounting();
        var lines = calorieCounting.getInput(inputFileName);

        //lines.stream().
    }

}
