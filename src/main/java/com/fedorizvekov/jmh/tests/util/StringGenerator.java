package com.fedorizvekov.jmh.tests.util;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringGenerator {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generate(int length) {

        Random random = new Random();

        return IntStream.range(0, length)
                .mapToObj(i -> CHARACTERS.charAt(random.nextInt(CHARACTERS.length())))
                .map(Object::toString)
                .collect(Collectors.joining());
    }

}
