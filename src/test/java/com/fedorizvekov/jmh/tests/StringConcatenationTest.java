package com.fedorizvekov.jmh.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;

import com.fedorizvekov.jmh.tests.util.StringGenerator;
import com.fedorizvekov.jmh.tests.util.StringRepeater;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openjdk.jmh.infra.Blackhole;

@ExtendWith(MockitoExtension.class)
class StringConcatenationTest {

    @Captor
    private ArgumentCaptor<String> stringCaptor;

    @InjectMocks
    private StringConcatenation benchmark;

    @Mock
    private Blackhole blackhole;

    private StringConcatenation.Data data;
    private MockedStatic<StringGenerator> stringGenerator;
    private MockedStatic<StringRepeater> stringRepeater;


    @BeforeEach
    void setUp() {
        stringGenerator = mockStatic(StringGenerator.class);
        stringRepeater = mockStatic(StringRepeater.class);

        data = new StringConcatenation.Data();
        data.stringLength = 6;
        data.stringCount = 2;

        stringGenerator.when(() -> StringGenerator.generate(anyInt())).thenReturn("test_1").thenReturn("test_2");
        stringRepeater.when(() -> StringRepeater.repeat(anyString(), anyInt())).thenReturn("%s%s");

        data.setup();
    }


    @AfterEach
    void tearDown() {
        stringGenerator.close();
        stringRepeater.close();
    }


    @Test
    void should_stringBuilder() {
        benchmark.stringBuilder(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }


    @Test
    void should_stringBuffer() {
        benchmark.stringBuffer(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }


    @Test
    void should_stringJoiner() {
        benchmark.stringJoiner(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }


    @Test
    void should_stringFormat() {
        benchmark.stringFormat(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }


    @Test
    void should_stringPlus() {
        benchmark.stringFormat(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }


    @Test
    void should_stringConcat() {
        benchmark.stringFormat(data, blackhole);

        verify(blackhole).consume(stringCaptor.capture());
        assertThat(stringCaptor.getValue()).isEqualTo("test_1test_2");
    }

}
