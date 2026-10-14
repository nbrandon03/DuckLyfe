# Duck Lyfe

Duck Lyfe is a JavaFX-based virtual pet simulation game where players manage a duck's needs, interact with its environment, and maintain its well-being.

## Features

- **Duck Needs Management:** Monitor health, hunger, happiness, and sleep.
- **Currency System:** Manage coins earned through gameplay.
- **Inventory System:** Interact with the game's inventory.
- **Park Environment:** Explore and interact with the park.
- **Persistent Data:** Save game data and settings using JSON files.
- **Interactive Controls:** Navigate the game using keyboard inputs.
- **Dynamic Gameplay:** Uses timed events to update game mechanics.

## Technologies

- Java 23
- JavaFX
- Maven
- JSON

## Prerequisites

Before running the project, install the following:

- **JDK 23** — [Download Java](https://jdk.java.net/)
- **Apache Maven** — [Installation Guide](https://maven.apache.org/install.html)
- **Visual Studio Code** — [Download VS Code](https://code.visualstudio.com/)

If you're using VS Code, install the following extensions:

- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) by Microsoft
- [Extension Pack for Java Auto Config](https://marketplace.visualstudio.com/items?itemName=redhat.java) — verify the extension name and publisher in the VS Code Marketplace before installing.

## Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/Duck-Lyfe.git
cd Duck-Lyfe
```

Replace `YOUR-USERNAME` with your GitHub username.

### 2. Verify Java and Maven

Check that Java is installed:

```bash
java --version
```

Check that Maven is installed:

```bash
mvn --version
```

Ensure Java reports version 23 and Maven is using the intended JDK.

### 3. Open the Project

Open the project folder in Visual Studio Code. Ensure that `pom.xml` is located in the project root directory.

### 4. Run the Application

From the integrated terminal, execute:

```bash
mvn javafx:run
```

Maven will resolve the configured dependencies and launch the application.

## Troubleshooting

**Java version issues**
- Ensure JDK 23 is installed and configured.
- Check that `JAVA_HOME` points to your JDK installation.
- Verify that `java --version` and `mvn --version` report the expected Java version.

**Missing dependencies**
- Confirm that Maven is installed and available in your system's PATH.
- Run the application from the directory containing `pom.xml`.
- Check your internet connection so Maven can download required dependencies.

**JavaFX launch errors**
- Verify that the required JavaFX dependencies and Maven plugin are configured in `pom.xml`.
- Review the terminal output for dependency or configuration errors.

## Project Information

Duck Lyfe was developed as a Java application project, demonstrating object-oriented programming, graphical user interface development, application state management, and persistent data storage.

