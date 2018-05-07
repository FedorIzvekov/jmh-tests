package com.fedorizvekov.jmh.tests.util;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringRepeater {

    public static String repeat(String string, int times) {

        return IntStream.range(0, times).mapToObj(i -> string).collect(Collectors.joining());

    }

}
