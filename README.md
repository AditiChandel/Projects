# Version Control System (VCS) in Java

This project implements a **Version Control System (VCS)** using Java. It provides basic functionalities to manage file versions, track changes, and maintain a history of file modifications. The system allows users to perform commit operations, view file history, and manage versioned files through a simple Command-Line Interface (CLI).

## Features
- **Versioning**: Track file versions and save changes made to files.
- **Commit**: Add changes to the version history with commit messages.
- **View History**: Display the history of a file’s versions.
- **CLI Interface**: A simple command-line interface for interacting with the system.

## Technologies Used
- **Java**: The core programming language used to build this version control system.
- **File Handling**: Uses Java’s file I/O to store version history and manage file states.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/VersionControlSystem.git
2. **Compile and Run: Navigate to the directory containing the source files and compile the Java program**:
   ```bash
   javac VersionControlSystem.java
   java VersionControlSystem
3. **Usage**
   **Commit: To commit changes to a file, use the commit command followed by a message.**
   ```bash
   java VersionControlSystem commit "Initial version of the file"
**View History: To view the version history of a file, use the history command.**
```bash
java VersionControlSystem history filename



