# DuckLyfe2 Setup Instructions

## Prerequisites

### For Windows:
1. Install **Visual Studio Code** from [https://code.visualstudio.com/](https://code.visualstudio.com/).
2. Install the following extensions in Visual Studio Code:
   - **Extension Pack for Java** (by Microsoft)
   - **Extension Pack for Java Auto Config** (by Microsoft)

### For macOS:
1. Install **Visual Studio Code** from [https://code.visualstudio.com/](https://code.visualstudio.com/).
2. Install **Homebrew** (a package manager for macOS):
   - Open the Terminal and run the following command:
     ```sh
     /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
     ```
   - Follow the on-screen instructions to complete the installation.
   - After installation, verify that Homebrew is installed by running:
     ```sh
     brew --version
     ```
3. Install **Maven** using Homebrew:
   - Run the following command in the Terminal:
     ```sh
     brew install maven
     ```
   - Verify Maven installation by running:
     ```sh
     mvn --version
     ```
4. Install the following extensions in Visual Studio Code:
   - **Extension Pack for Java** (by Microsoft)
   - **Extension Pack for Java Auto Config** (by Microsoft)

---

## Running the Project

### Option 1: Run the JAR

1. Download the JAR file from the repository.
2. Ensure Java 23 is installed.
3. Open the JAR file to launch the application.

If double-clicking the JAR does not work, open a terminal in the directory containing the file and run:

```sh
java -jar DuckLyfe2.jar
```

Replace `DuckLyfe2.jar` with the actual name of the JAR file.

### Option 2: Run from Source

1. Clone the repository or download the project files.
2. Open the `DuckLyfe2` folder in Visual Studio Code.
3. Ensure `pom.xml` is present in the project root.
4. Open the integrated terminal.
5. Run the following command:

```sh
mvn javafx:run
```

---

## Troubleshooting

- **Missing Dependencies**: If you encounter issues with missing dependencies, ensure that Maven is installed and properly configured.
- **JavaFX Errors**: Ensure that the `javafx-maven-plugin` is configured in the `pom.xml` file and that all required JavaFX dependencies are included.
- **Homebrew Issues (macOS)**: If Homebrew commands fail, ensure that Homebrew is installed and up-to-date by running:
  ```sh
  brew update
  ```
- **JDK Version**: The project requires **JDK 23**. Ensure that your system has JDK 23 installed and configured. You can verify your Java version by running:
  ```sh
  java --version
  ```
  If the version is incorrect, download and install JDK 23 from [https://jdk.java.net/](https://jdk.java.net/).

---

## Additional Notes

- **Java Version**: Ensure that your `JAVA_HOME` environment variable is set to the JDK 23 installation directory.
- **Maven Version**: Ensure that Maven is installed and up-to-date. You can verify Maven by running:
  ```sh
  mvn --version
  ```
- **Extensions**: The required Visual Studio Code extensions (Extension Pack for Java and Extension Pack for Java Auto Config) will automatically configure your environment for Java development.
- **Mac Users**: If you encounter permission issues with Homebrew, try running the commands with `sudo` (e.g., `sudo brew install maven`).

If you encounter any issues, refer to the official documentation for Visual Studio Code, Homebrew, Maven, or JavaFX.
