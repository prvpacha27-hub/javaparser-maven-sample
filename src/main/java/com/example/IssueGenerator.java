package com.example;

public class IssueGenerator {

    // VULNERABILITY: SonarQube strictly forbids hardcoded credentials
    String dbPassword = "superSecretPassword123!";

    // BUG: SonarQube will flag this because calling .equals() on a variable before checking for null causes a NullPointerException
    public boolean checkName(String name) {
        if (name.equals("admin")) {
            return true;
        }
        return false;
    }

    // CODE SMELL: Unused variables clutter the codebase
    public void calculateSomething() {
        int unusedVariable = 42; 
        System.out.println("This method has a code smell.");
    }
}
