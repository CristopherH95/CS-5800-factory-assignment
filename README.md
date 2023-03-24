# Pizza Chain Assignment

This repository contains an abstract factory and singleton pattern implementation for homework #2 of CS-5800 (Advanced Software Engineering).
The implementation details can be found in the `factory` package, and a driver program can be found under the
`driver` package. An example of the program's output can be found in `output.png`. Essentially, the driver program
runs through three tests:

1. Create car factories, test their methods, and attempt to create a second instance of one of them.
2. Create airplane factories, test their methods, and attempt to create a second instance of one of them.
3. Create boat factories and test their methods.

## Build & Run

To build with Maven, simply navigate to the project root in the command line and run:

```shell
mvn package
```

Alternatively, IDEs such as IntelliJ should be able to build the source files using their standard build utilities.

Once built, the project can be run using the `driver` package:

```shell
java -cp ./target/factory-assignment-1.0-SNAPSHOT.jar driver.Main
```