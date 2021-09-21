# Smart Home

This project provides scaffolding for a simulated "Smart Home."

## Purpose

The project is primarily intended as a facilitation tool for object-oriented design discussions. The content follows the "Button and Lamp" example from [Agile Software Development: Principles, Practices, and Patterns](https://www.pearson.com/us/higher-education/program/Martin-Agile-Software-Development-Principles-Patterns-and-Practices/PGM272869.html). The content was originally adapted to this format by [@moonmaster9000](https://github.com/moonmaster9000).

## Setup

Project dependencies are listed in `.tool-versions`:

* Java JDK version 8 (or later)
* Gradle 7.2 or later (if not using the `./gradlew` or `gradlew.bat` wrapper scripts)

## Components

### Smart Home

The Smart Home integrates the various components into a functional whole. It provides the main application component.

The component is included in the top-level project within the `:smart-home` scope:

```shell script
# Build the smart-hone project
./gradlew :smart-home:build

# Run the smart-home project
./gradlew :smart-home:run
```

### Switch 9000

The `switch-9000` project provides a class, `Switch9000`, with a single method, `isOn()`.

The component is included in the top-level project within the `:switch-9000` scope:

```shell script
# Build the switch-9000 project
./gradlew :switch-9000:build
```

### Bulb 9000

The `bulb-9000` project provides a class, `Bulb9000`, with two void methods, `turnOn()` and `turnOff()`.

The component is included in the top-level project within the `:bulb-9000` scope:

```shell script
# Build the bulb-9000 project
./gradlew :bulb-9000:build
```

## Exercises

Begin by implementing the Smart Home application with a single switch (provided by `Switch9000`) and bulb (provided by `Bulb9000`), such that the switch controls the bulb.

That is, while the application is running:

* When the switch is flipped on, the bulb should turn on.
* When the switch is flipped off, the bulb should turn off.
