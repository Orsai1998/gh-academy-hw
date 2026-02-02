# Java Setup on macOS (Apple Silicon)

This guide explains how to install **Java JDK** on macOS (M1 / M2 / M3) and compile Java programs using `javac`.

---

## Requirements
- macOS (Apple Silicon)
- Terminal access
- Internet connection

---

## 1. Install Homebrew

Homebrew is a package manager for macOS.

```bash
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

```

## 2. Install Java JDK 17

```bash
  brew install openjdk@17
```

## 3. Configure Environment Variables
```
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zprofile
echo 'export JAVA_HOME=$(/usr/libexec/java_home -v 17)' >> ~/.zprofile
```

Apply changes:
```
source ~/.zprofile
```
## 4. Verify Installation

```
java -version
javac -version
```
Expected output:
```
javac 17.x.x
```
