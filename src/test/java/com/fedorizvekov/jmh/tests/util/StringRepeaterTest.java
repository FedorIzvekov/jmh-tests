package com.fedorizvekov.jmh.tests.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringRepeaterTest {

    @Test
    @DisplayName("Should repeat string 1 times")
    void should_repeat_1_times() {
        String result = StringRepeater.repeat("Test", 1);
        assertThat(result).hasSize(4);
        assertThat(result).isEqualTo("Test");
    }


    @Test
    @DisplayName("Should repeat string 5 times")
    void should_repeat_5_times() {
        String result = StringRepeater.repeat("Test", 5);
        assertThat(result).hasSize(20);
        assertThat(result).isEqualTo("TestTestTestTestTest");
    }

}
