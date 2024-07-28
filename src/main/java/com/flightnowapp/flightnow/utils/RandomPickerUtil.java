package com.flightnowapp.flightnow.utils;

import java.util.List;
import java.util.Random;

public class RandomPickerUtil {
    public static <T> T randomPicker(List<T> items) {
        Random random = new Random();
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}
