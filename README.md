# PIN Solver

![Java](https://img.shields.io/badge/Java-17-red.svg)
![Maven](https://img.shields.io/badge/Maven-3.6+-C71A36.svg)
![Unit Tests](https://img.shields.io/badge/Unit%20Tests-5%20passed-green.svg)

A Java solution for generating possible PIN combinations based on adjacent digits on a phone keypad.

## Features

- Generates all possible PIN combinations considering adjacent digits
- Supports multi-digit PINs
- Efficient backtracking algorithm
- Comprehensive unit tests

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Project Structure

```
pin-solver/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── detective/
│   │               └── Solution.java
│   └── test/
│       └── java/
│           └── com/
│               └── detective/
│                   └── SolutionTest.java
├── pom.xml
├── README.md
└── LICENSE.md
```

## Getting Started

```bash
# Clone the repository
git clone git@github.com:luismr/pin-solver.git

# Navigate to the project directory
cd pin-solver
```

## Building and Running

```bash
# Build the project
mvn clean install

# Run the tests
mvn test

# Run the application
mvn exec:java -Dexec.mainClass="com.detective.Solution"
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

Copyright © 2025 Luis Machado Reis 