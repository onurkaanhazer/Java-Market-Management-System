# Java Market Management System

## Description

This repository hosts a comprehensive Java market management system. The system is designed to facilitate the management of market operations, featuring a robust Graphical User Interface (GUI), inheritance hierarchies for product and user management, and effective use of overriding and overloading principles to enhance functionality. It also includes a suite of unit tests to ensure reliability and performance.



*An overview of the system architecture depicting the relationships between GUI components and business logic.*
![Ekran görüntüsü 2024-02-19 142830](https://github.com/onurkaanhazer/Java-Market-Management-System/assets/122304587/35c840de-ab14-41a2-a2e1-3adb3699e136)

## Features

- **Graphical User Interface (GUI)**: A user-friendly interface for interactive management of market operations, including product listings, orders, and payments.
- **Inheritance**: Utilizes object-oriented principles to create a clear hierarchy of products, including technological and food items, promoting code reusability and scalability.
- **Method Overriding**: Tailors inherited methods to specific needs of the market system, ensuring that the behavior of subclasses is appropriate for their context.
- **Method Overloading**: Provides multiple ways to use functionality within the system, like searching for products or processing payments, enhancing the system's flexibility.
- **Unit Testing**: Comprehensive tests using JUnit to validate each component's functionality and ensure robustness through automated testing practices.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse.
- Familiarity with GUI development in Java.

### Installation
1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Resolve any dependencies that are required (e.g., JUnit for testing).

### Running the Application
- Navigate to the `Main` class and run the program to launch the market management system.
- Explore different modules such as product addition, user management, and order processing through the GUI.

## Documentation

### Market Management System Structure
- **UML Diagram**: The above diagram illustrates the system's structure and the relationships between different classes.
- **Product Classes**: `TeknolojikUrun` and `GidaUrunu` are subclasses inheriting from `Urun`, demonstrating the system's use of inheritance.
- **User Management**: `User` class with `GUI_User` providing the interface elements for user interactions, managed by `KontrolorUser`.
- **Order and Payment Processing**: `SiparisVeOdeme` handles order taking and payments, with a dedicated GUI component `GUI_SiparisVeOdeme`.

### GUI Components
- `UrunGUI`: Manages the product-related user interface.
- `MusteriGUI`: Handles customer management operations.
- `SiparisGUI`: Provides an interface for viewing and editing orders.
- `YazilimKullaniciGUI`: Provides authentication and user management interface for software users.

### Testing
- Unit tests for each component ensure the system is tested and ready for deployment.
- Examples include `UrunTest`, `MusteriTest`, and `KontrolorTest`, which ensure that the logic for products, customers, and controllers is functioning correctly.

## Contributing
We welcome contributions that help improve the system. Please ensure that any contributions follow the existing code structure and include appropriate tests.

## License
This project is licensed under the MIT License - see the LICENSE.md file for details.


