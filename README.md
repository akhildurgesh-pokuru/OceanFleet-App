# OceanFleet-App

# OceanFleet App – Use Case–Driven OOPS & Data Structures Learning Project

##  Project Overview

OceanFleet App is a Java-based console application developed to manage vessel information and performance records. The project is designed using Object-Oriented Programming (OOPS) principles and the Java Collections Framework.

It starts with creating a basic Vessel model and gradually extends to storing vessel records, retrieving vessel details by ID, identifying high-performance vessels, and organizing the application using a clean layered architecture.

The project follows a use-case-driven development approach, with each use case introducing new Java concepts and improving the application's functionality.

##  Project Objectives

- Understand Java Classes and Objects.
- Implement Encapsulation using private variables and getter/setter methods.
- Work with constructors and JavaBeans conventions.
- Store multiple objects using `List<Vessel>`.
- Perform searching and filtering operations.
- Apply OOPS principles and separation of concerns.
- Develop a console-based Java application.

##  Technologies Used

- **Programming Language:** Java
- **Build Tool:** Maven
- **Data Structure:** Java Collections Framework (List)
- **Testing Framework:** JUnit 5
- **IDE:** IntelliJ IDEA
- **Version Control:** Git and GitHub

##  Project Structure

```text
OceanFleet-App/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Ocean/
│   │           └── OceanFleet/
│   │               ├── Vessel.java
│   │               ├── VesselUtil.java
│   │               └── UserInterface.java
│   │
│   └── test/
│       └── java/
│           └── Ocean/
│               └── OceanFleet/
│                   └── VesselTest.java
│
├── pom.xml
└── README.md
```

##  Use Cases

### UC1: Create Vessel Model
- Create a `Vessel` class.
- Define vessel attributes:
  - `vesselId`
  - `vesselName`
  - `averageSpeed`
  - `vesselType`
- Implement no-argument and parameterized constructors.
- Provide getter and setter methods.

**Concepts:** Classes, Objects, Encapsulation, Constructors and JavaBeans conventions.

### UC2: Store Vessel Records Using List
- Create a `VesselUtil` class.
- Maintain vessel records using `private List<Vessel> vesselList`.
- Implement `addVesselPerformance(Vessel vessel)` to add vessel objects.

**Concepts:** Java Collections Framework, List, Dynamic Data Storage and Object References.

### UC3: Retrieve Vessel by Vessel ID
- Implement `getVesselById(String vesselId)`.
- Search vessel records using linear search.
- Return the matching vessel if found.
- Return `null` if no matching vessel exists.
- Perform case-sensitive ID comparison.

**Concepts:** Linear Search, List Iteration, Conditional Logic and Null Handling.

### UC4: Identify High-Performance Vessels
- Implement `getHighPerformanceVessels()`.
- Identify the maximum average speed.
- Return all vessels having the highest average speed.
- Handle cases where multiple vessels share the same maximum speed.

**Concepts:** List Traversal, Maximum Value Identification and Filtering.

### UC5: Integrate User Interaction (Console Application)
- Accept the number of vessels from the user.
- Read vessel details through console input.
- Parse input using `split(":")`.
- Create and store Vessel objects.
- Retrieve vessels using their IDs.
- Display high-performance vessels.

**Input Format:**

```text
vesselId:vesselName:averageSpeed:vesselType
```

**Sample Input:**

```text
V001:Sea King:25.5:Cargo
V002:Ocean Star:30.0:Passenger
V003:Blue Wave:22.5:Cargo
```

**Sample Output:**

```text
V001 | Sea King | Cargo | 25.5 knots
V002 | Ocean Star | Passenger | 30.0 knots
V003 | Blue Wave | Cargo | 22.5 knots
```

### UC6: Refactor Using OOPS Principles

Organize the application into separate classes:

- `Vessel` – Handles vessel data.
- `VesselUtil` – Handles vessel-related operations.
- `UserInterface` – Handles console input and output.

**OOPS Principles Applied:**

- **Encapsulation:** Keeps vessel attributes private and provides controlled access through getters and setters.
- **Abstraction:** Allows users to perform operations through methods without accessing internal collection details.
- **Modularity:** Separates data, business logic and user interaction.
- **Reusability:** Makes utility methods reusable across different operations.
- **Single Responsibility Principle:** Assigns a specific responsibility to each class.

##  Testing

JUnit 5 is used to validate the application's functionality.

Testing includes:
- Testing constructors.
- Testing getter and setter methods.
- Testing vessel creation.
- Testing vessel insertion into the List.
- Testing vessel retrieval by ID.
- Testing high-performance vessel identification.

##  How to Run the Project

1. Clone the repository:

```bash
git clone <your-repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Reload the Maven project and download dependencies.

4. Run the `UserInterface.java` main class.

5. Enter vessel details through the console.

6. Execute JUnit test cases to verify the functionality.

##  Learning Outcomes

Through this project, the following concepts are practiced:

- Core Java Programming
- Object-Oriented Programming
- Constructors, Getters and Setters
- Encapsulation and Abstraction
- Java Collections Framework
- List and Object Management
- Searching and Filtering
- Console-Based Application Development
- JUnit 5 Unit Testing
- Git and GitHub Version Control

##  Author

Developed as a Java learning project to understand OOPS concepts, Data Structures and use-case-driven software development.

