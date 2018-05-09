package com.fedorizvekov.jmh.tests.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringGeneratorTest {

    @Test
    @DisplayName("Should generate string of 10 chars length")
    void should_generate_string_of_10_length() {
        String result = StringGenerator.generate(10);
        assertThat(result).hasSize(10);
        assertThat(result).matches("[A-Za-z]+");
    }


    @Test
    @DisplayName("Should generate string of 100 chars length")
    void should_generate_string_of_100_length() {
        String result = StringGenerator.generate(100);
        assertThat(result).hasSize(100);
        assertThat(result).matches("[A-Za-z]+");
    }

}
