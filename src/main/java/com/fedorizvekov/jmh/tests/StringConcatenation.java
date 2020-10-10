package com.fedorizvekov.jmh.tests;

import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import com.fedorizvekov.jmh.tests.util.StringGenerator;
import com.fedorizvekov.jmh.tests.util.StringRepeater;
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
    public void stringFormat(Data data, Blackhole blackhole) {
        blackhole.consume(String.format(data.formatArg, data.stringArray));
    }


    @Benchmark
    public void stringBuilder(Data data, Blackhole blackhole) {
        StringBuilder stringBuilder = data.stringBuilder;
        for (String str : data.stringArray) {
            stringBuilder.append(str);
        }
        blackhole.consume(stringBuilder.toString());
    }


    @Benchmark
    public void stringBuffer(Data data, Blackhole blackhole) {
        StringBuffer stringBuffer = data.stringBuffer;
        for (String str : data.stringArray) {
            stringBuffer.append(str);
        }
        blackhole.consume(stringBuffer.toString());
    }


    @Benchmark
    public void stringJoiner(Data data, Blackhole blackhole) {
        StringJoiner stringJoiner = data.stringJoiner;
        for (String str : data.stringArray) {
            stringJoiner.add(str);
        }
        blackhole.consume(stringJoiner.toString());
    }


    @Benchmark
    public void stringPlus(Data data, Blackhole blackhole) {
        String string = data.emptyString;
        for (String str : data.stringArray) {
            string = string + str;
        }
        blackhole.consume(string);
    }


    @Benchmark
    public void stringConcat(Data data, Blackhole blackhole) {
        String string = data.emptyString;
        for (String str : data.stringArray) {
            string = string.concat(str);
        }
        blackhole.consume(string);
    }


    @State(Scope.Thread)
    public static class Data {

        @Param({"15"})
        int stringLength;
        @Param({"5", "10", "25"})
        int stringCount;

        String[] stringArray;
        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        StringJoiner stringJoiner;
        String formatArg;
        String emptyString;

        @Setup
        public void setup() {
            stringArray = Stream.generate(() -> StringGenerator.generate(stringLength))
                    .limit(stringCount)
                    .toArray(String[]::new);

            formatArg = StringRepeater.repeat("%s", stringCount);

            stringBuilder = new StringBuilder();
            stringBuffer = new StringBuffer();
            stringJoiner = new StringJoiner("");
            emptyString = "";
        }

    }

}
