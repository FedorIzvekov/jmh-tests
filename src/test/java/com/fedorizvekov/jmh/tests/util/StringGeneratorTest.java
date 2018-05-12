package com.fedorizvekov.jmh.tests.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringGeneratorTest {

    @Test
    public void should_generate_string_of_10_length() {
        String result = StringGenerator.generate(10);
        assertThat(result).hasSize(10);
        assertThat(result).matches("[A-Za-z]+");
    }


    @Test
    public void should_generate_string_of_100_length() {
        String result = StringGenerator.generate(100);
        assertThat(result).hasSize(100);
        assertThat(result).matches("[A-Za-z]+");
    }

}
