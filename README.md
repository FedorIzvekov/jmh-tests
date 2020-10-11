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

#### [Intel i7-10510U CPU @ 1.80GHz](results/StringConcatenation.md#intel-i7-10510u-cpu--180ghz)
* [JDK 1.8.0_192](results/StringConcatenation.md#jdk-180192)
* [JDK 11.0.18](results/StringConcatenation.md#jdk-11018)
