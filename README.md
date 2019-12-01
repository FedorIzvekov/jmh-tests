# Project jmh-tests
This project features JMH tests.

## Building, Running and Checking

1. Navigate to the project directory:
```
cd <projects_directory>/jmh-tests
```

2. Build the project:
```
mvn clean install
```

3. Run the server:
```
java -jar ./target/jmh-tests-1.0.0-SNAPSHOT.jar
```

## Results

### 1. String concatenation tests:

#### [CPU Intel i7-10510U 1.80GHz](results/StringConcatenation.md#cpu-intel-i7-10510u-180ghz)
* [Liberica JDK 11.0.5](results/StringConcatenation.md#liberica-jdk-1105)
* [Liberica JDK 1.8.0_232](results/StringConcatenation.md#liberica-jdk-180232)