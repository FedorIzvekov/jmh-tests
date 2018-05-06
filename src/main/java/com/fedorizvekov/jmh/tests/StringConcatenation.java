package com.fedorizvekov.jmh.tests;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@BenchmarkMode(Mode.AverageTime)
@Fork(jvmArgsAppend = {"-Xms2G", "-Xmx2G"})
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class StringConcatenation {

    @Benchmark
    public String stringBuilder(Data data) {
        StringBuilder stringBuilder = data.stringBuilder;
        stringBuilder.append(data.secondString);
        stringBuilder.append(data.thirdString);
        return stringBuilder.toString();
    }


    @Benchmark
    public String stringBuilderLoop(Data data) {
        StringBuilder stringBuilder = data.stringBuilder;
        for (long count = 0; count < data.loopSize; count++) {
            stringBuilder.append(data.secondString);
            stringBuilder.append(data.thirdString);
        }
        return stringBuilder.toString();
    }


    @Benchmark
    public String stringBuffer(Data data) {
        StringBuffer stringBuffer = data.stringBuffer;
        stringBuffer.append(data.secondString);
        stringBuffer.append(data.thirdString);
        return stringBuffer.toString();
    }


    @Benchmark
    public String stringBufferLoop(Data data) {
        StringBuffer stringBuffer = data.stringBuffer;
        for (long count = 0; count < data.loopSize; count++) {
            stringBuffer.append(data.secondString);
            stringBuffer.append(data.thirdString);
        }
        return stringBuffer.toString();
    }


    @Benchmark
    public String stringPlus(Data data) {
        return data.firstString + data.secondString + data.thirdString;
    }


    @Benchmark
    public String stringPlusLoop(Data data) {
        String string = null;
        for (long count = 0; count < data.loopSize; count++) {
            string = data.firstString + data.secondString + data.thirdString;
        }
        return string;
    }


    @Benchmark
    public String stringConcat(Data data) {
        return data.firstString.concat(data.secondString).concat(data.thirdString);
    }


    @Benchmark
    public String stringConcatLoop(Data data) {
        String string = null;
        for (long count = 0; count < data.loopSize; count++) {
            string = data.firstString.concat(data.secondString).concat(data.thirdString);
        }
        return string;
    }


    @State(Scope.Thread)
    public static class Data {

        long loopSize = 1;

        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        String firstString;
        String secondString;
        String thirdString;

        @Setup
        public void setup() {
            firstString = "test123";
            secondString = "test456";
            thirdString = "test789";
            stringBuilder = new StringBuilder(firstString);
            stringBuffer = new StringBuffer(firstString);
        }
    }

}
