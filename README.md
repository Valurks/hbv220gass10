# Assignment 10 – Composite Pattern
This project demonstrates the use of the **Composite Design Pattern** in Java.  
It evaluates arithmetic expressions using a combination of `NumberLeaf`, `PlusComposite`, and `MultiplyComposite` components.

## Overview
The example implemented in `Main.java` evaluates the expression:

This is achieved by:
- Creating leaf nodes for numbers
- Combining them using composite nodes for addition and multiplication
- Evaluating the expression via `getResult()` calls

## Prerequisites

- Java 17 or higher
- Apache Maven

# ▶How to Run the main method
The `pom.xml` file is configured with the `exec-maven-plugin`.
Run the main method with mvn exec:java.

# License
This project is licensed under the MIT License.
It includes contributions by Adam and Valur, and Helmut Neukirchen, the original author of the template repository.

[Link to the license](LICENSE)

# Documentation
You can view an UML diagram [here](src/site/markdown/documentation.md)

You can generate full documentation including Javadoc and license details by running:

#### mvn site

### Then open the generated site with:
- open target/site/index.html      # macOS
- start target\site\index.html     # Windows
Navigate to Project Reports > JavaDoc to view generated documentation for all classes and methods, including Main.
