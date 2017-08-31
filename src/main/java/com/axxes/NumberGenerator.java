package com.axxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

    private Random random = new Random();

    public List<Integer> generate(int amount, int maxNumber){
        List<Integer> numbers = new ArrayList<Integer>();

        int randomNumber;

        for (int i = 0; i < amount; i++){
            randomNumber = random.nextInt(maxNumber);
            numbers.add(randomNumber);
        }

        return numbers;
    }
}
