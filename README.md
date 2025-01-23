# Java-programming-language
Java programming language - Samarkand State University Faculty of Intellectual Systems and Computer Technologies Software Engineering


# INSTALL

### 1. **Install Java JDK**
To run Java programs, you need to have the Java Development Kit (JDK) installed.

#### **1.1 Download and Install JDK**
- **Oracle JDK**: [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)  
  (Download the `.exe` file for Windows and install it.)
  
- **OpenJDK**: [https://jdk.java.net/](https://jdk.java.net/)  
  (A free, open-source version of the JDK.)

#### **1.2 Set PATH and JAVA_HOME**
After installing the JDK, configure the **Environment Variables**:

1. Go to **Control Panel** → **System** → **Advanced system settings**.
2. Click on **Environment Variables**.
3. Add a new **System Variable**:
   - **Variable name**: `JAVA_HOME`
   - **Variable value**: Path to your JDK installation (e.g., `C:\Program Files\Java\jdk-XX.X.X`).
4. Edit the `Path` variable under **System Variables**:
   - Add `%JAVA_HOME%\bin`.

---

### 2. **Install Visual Studio Code**
If you don’t already have VS Code installed, download it from:  
[https://code.visualstudio.com/](https://code.visualstudio.com/)

---

### 3. **Install the Java Extension Pack**

1. Open VS Code.
2. Click on the **Extensions Marketplace** (📦 icon on the left sidebar).
3. Search for **"Java Extension Pack"**.
4. Install it by clicking the **Install** button.  
   This pack includes:
   - Language Support for Java™ by Red Hat
   - Debugger for Java
   - Maven for Java
   - Java Test Runner
   - Visual Studio IntelliCode

---

### 4. **Create a Java Program**

#### **4.1 Create a Project**
1. Open a folder in VS Code or create a new one.
2. Create a new file with the `.java` extension (e.g., `SimpleCalculator.java`).

#### **4.2 Write the Code**
Copy and paste the following Java code:

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Calculate the result
        double result = firstNumber + secondNumber;

        // Display the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
```

---

### 5. **Run the Program**

1. Save the file (`Ctrl + S` or `Cmd + S` on Mac).
2. Click the **Run and Debug** button (`Play ▶` icon at the top).
3. The first time you run a program, VS Code will automatically generate a `launch.json` file.
4. Once the program runs, you’ll see output in the terminal, and you can input values when prompted.

---

### 6. **If You Encounter Issues**

#### **Check Java Installation**
In the terminal, verify Java is installed correctly:
```bash
java -version
javac -version
```
If it doesn’t work, check that JDK is installed and the PATH is set correctly.

#### **Extension Issues**
If extensions don’t work:
1. Reinstall the **Java Extension Pack**.
2. Restart VS Code.