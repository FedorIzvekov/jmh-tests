package com.fedorizvekov.jmh.tests;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import com.fedorizvekov.jmh.tests.util.StringGenerator;
import org.apache.logging.log4j.LogManager;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.slf4j.LoggerFactory;

@BenchmarkMode(Mode.AverageTime)
@Fork(jvmArgsAppend = {"-Xms2G", "-Xmx2G"})
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class Logging {

    @Benchmark
    public void slf4jInfoConcatenation(Data data) {
        data.slf4j.info(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void slf4jInfoPlaceholder(Data data) {
        data.slf4j.info(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @Benchmark
    public void slf4jWarmConcatenation(Data data) {
        data.slf4j.warn(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void slf4jWarmPlaceholder(Data data) {
        data.slf4j.warn(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @Benchmark
    public void slf4jErrorConcatenation(Data data) {
        data.slf4j.error(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void slf4jErrorPlaceholder(Data data) {
        data.slf4j.error(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @Benchmark
    public void log4j2InfoConcatenation(Data data) {
        data.log4j2.info(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2InfoSupplierConcatenation(Data data) {
        data.log4j2.info(() -> data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2InfoPlaceholder(Data data) {
        data.log4j2.info(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @Benchmark
    public void log4j2WarmConcatenation(Data data) {
        data.log4j2.warn(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2WarmSupplierConcatenation(Data data) {
        data.log4j2.warn(() -> data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2WarmPlaceholder(Data data) {
        data.log4j2.warn(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @Benchmark
    public void log4j2ErrorConcatenation(Data data) {
        data.log4j2.error(data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2ErrorSupplierConcatenation(Data data) {
        data.log4j2.error(() -> data.messages[0] + data.messages[1] + data.messages[2] + data.messages[3] + data.messages[4]);
    }


    @Benchmark
    public void log4j2ErrorPlaceholder(Data data) {
        data.log4j2.error(data.placeholder, data.messages[0], data.messages[1], data.messages[2], data.messages[3], data.messages[4]);
    }


    @State(Scope.Benchmark)
    public static class Data {

        @Param({"15"})
        int stringLength;

        int messageCount = 5;

        org.slf4j.Logger slf4j;
        org.apache.logging.log4j.Logger log4j2;

        String[] messages;
        String placeholder;


        @Setup
        public void setup() {
            slf4j = LoggerFactory.getLogger(Logging.class);
            log4j2 = LogManager.getLogger(Logging.class);

            messages = Stream.generate(() -> StringGenerator.generate(stringLength))
                    .limit(messageCount)
                    .toArray(String[]::new);

            placeholder = "{}".repeat(messageCount);
        }

    }

}
