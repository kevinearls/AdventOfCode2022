package dev.kearls;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalorieCounting {
    @Test
    public void testExample() throws Exception{
        String inputFileName = "/Users/kearls/sources/kevinearls/AdventOfCode2022/Day1/src/main/resources/TestInput.txt";  // FIXME how to find relative path
        CalorieCounting calorieCounting = new CalorieCounting();
        assertEquals(24000, calorieCounting.findMaximumCalories(inputFileName));
    }

    @Test
    public void testPart1() throws Exception {
        String inputFileName = "/Users/kearls/sources/kevinearls/AdventOfCode2022/Day1/src/main/resources/input.txt";  // FIXME how to find relative path
        CalorieCounting calorieCounting = new CalorieCounting();
        System.out.println(calorieCounting.findMaximumCalories(inputFileName));
    }

}
