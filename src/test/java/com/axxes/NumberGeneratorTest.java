package com.axxes;

import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class NumberGeneratorTest {

    private NumberGenerator numberGenerator = new NumberGenerator();

    @Test
    public void generateNumbersAmountTest(){
         int number = numberGenerator.generate(7, 15).size();
        assertThat(number).isEqualTo(7);
        number = numberGenerator.generate(18, 15).size();
        assertThat(number).isEqualTo(18);
    }

    @Test
    public void generateNumbersMaxNumberTest(){
        List<Integer> numbers = numberGenerator.generate(30, 15);

        for (int number:numbers){
            assertThat(number).isBetween(0, 15);
        }
    }
}
