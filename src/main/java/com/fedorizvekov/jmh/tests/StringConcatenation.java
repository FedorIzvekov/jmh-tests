package com.fedorizvekov.jmh.tests;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.fedorizvekov.jmh.tests.util.StringGenerator;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@Fork(jvmArgsAppend = {"-Xms2G", "-Xmx2G"})
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class StringConcatenation {

    @Benchmark
    public void stringBuilder(Data data, Blackhole blackhole) {
        StringBuilder result = new StringBuilder();
        for (String element : data.stringArray) {
            result.append(element);
        }
        blackhole.consume(result.toString());
    }


    @Benchmark
    public void stringBuilderWithPresetSize(Data data, Blackhole blackhole) {
        StringBuilder result = new StringBuilder(data.stringArray.length);
        for (String element : data.stringArray) {
            result.append(element);
        }
        blackhole.consume(result.toString());
    }


    @Benchmark
    public void stringBuffer(Data data, Blackhole blackhole) {
        StringBuffer result = new StringBuffer();
        for (String element : data.stringArray) {
            result.append(element);
        }
        blackhole.consume(result.toString());
    }


    @Benchmark
    public void stringBufferWithPresetSize(Data data, Blackhole blackhole) {
        StringBuffer result = new StringBuffer(data.stringArray.length);
        for (String element : data.stringArray) {
            result.append(element);
        }
        blackhole.consume(result.toString());
    }


    @Benchmark
    public void stringJoiner(Data data, Blackhole blackhole) {
        StringJoiner result = new StringJoiner("");
        for (String element : data.stringArray) {
            result.add(element);
        }
        blackhole.consume(result.toString());
    }


    @Benchmark
    public void stringStreamJoining(Data data, Blackhole blackhole) {
        String result = Arrays.stream(data.stringArray).collect(Collectors.joining());
        blackhole.consume(result);
    }


    @Benchmark
    public void stringFormat(Data data, Blackhole blackhole) {
        String result = String.format(data.formatArg, data.stringArray);
        blackhole.consume(result);
    }


    @Benchmark
    public void stringConcat(Data data, Blackhole blackhole) {
        String result = "";
        for (String element : data.stringArray) {
            result = result.concat(element);
        }
        blackhole.consume(result);
    }


    @Benchmark
    public void stringPlus(Data data, Blackhole blackhole) {
        String result = "";
        for (String element : data.stringArray) {
            result = result + element;
        }
        blackhole.consume(result);
    }


    @State(Scope.Thread)
    public static class Data {

        @Param({"15"})
        int stringLength;
        @Param({"10", "50", "100"})
        int stringCount;

        String[] stringArray;
        String formatArg;

        @Setup
        public void setup() {
            stringArray = Stream.generate(() -> StringGenerator.generate(stringLength))
                    .limit(stringCount)
                    .toArray(String[]::new);

            formatArg = "%s".repeat(stringCount);
        }

    }

}
