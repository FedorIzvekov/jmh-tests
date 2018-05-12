package com.fedorizvekov.jmh.tests;

import java.util.concurrent.TimeUnit;
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
        StringBuilder stringBuilder = data.stringBuilder;
        stringBuilder.append(data.firstString);
        stringBuilder.append(data.secondString);
        stringBuilder.append(data.thirdString);
        blackhole.consume(stringBuilder.toString());
    }


    @Benchmark
    public void stringBuilderLoop(Data data, Blackhole blackhole) {
        StringBuilder stringBuilder = data.stringBuilder;
        for (long count = 0; count < data.loopSize; count++) {
            stringBuilder.append(data.firstString);
            stringBuilder.append(data.secondString);
            stringBuilder.append(data.thirdString);
        }
        blackhole.consume(stringBuilder.toString());
    }


    @Benchmark
    public void stringBuffer(Data data, Blackhole blackhole) {
        StringBuffer stringBuffer = data.stringBuffer;
        stringBuffer.append(data.firstString);
        stringBuffer.append(data.secondString);
        stringBuffer.append(data.thirdString);
        blackhole.consume(stringBuffer.toString());
    }


    @Benchmark
    public void stringBufferLoop(Data data, Blackhole blackhole) {
        StringBuffer stringBuffer = data.stringBuffer;
        for (long count = 0; count < data.loopSize; count++) {
            stringBuffer.append(data.firstString);
            stringBuffer.append(data.secondString);
            stringBuffer.append(data.thirdString);
        }
        blackhole.consume(stringBuffer.toString());
    }


    @Benchmark
    public void stringPlus(Data data, Blackhole blackhole) {
        blackhole.consume(data.firstString + data.secondString + data.thirdString);
    }


    @Benchmark
    public void stringPlusLoop(Data data, Blackhole blackhole) {
        for (long count = 0; count < data.loopSize; count++) {
            blackhole.consume(data.firstString + data.secondString + data.thirdString);
        }
    }


    @Benchmark
    public void stringConcat(Data data, Blackhole blackhole) {
        blackhole.consume(data.firstString.concat(data.secondString).concat(data.thirdString));
    }


    @Benchmark
    public void stringConcatLoop(Data data, Blackhole blackhole) {
        for (long count = 0; count < data.loopSize; count++) {
            blackhole.consume(data.firstString.concat(data.secondString).concat(data.thirdString));
        }
    }


    @State(Scope.Thread)
    public static class Data {

        long loopSize = 1;
        @Param({"25"})
        int stringLength;

        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        String firstString;
        String secondString;
        String thirdString;

        @Setup
        public void setup() {
            firstString = StringGenerator.generate(stringLength);
            secondString = StringGenerator.generate(stringLength);
            thirdString = StringGenerator.generate(stringLength);

            stringBuilder = new StringBuilder();
            stringBuffer = new StringBuffer();
        }
    }

}
