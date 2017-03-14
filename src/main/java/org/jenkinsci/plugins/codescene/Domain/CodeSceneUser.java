package org.jenkinsci.plugins.codescene.Domain;

public class CodeSceneUser {

    private final String name;
    private final String password;

    public CodeSceneUser(final String name, final String password) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The user name has to be a valid string matching your CodeScene Bot user.");
        }

        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("The password has to be a valid string matching your CodeScene Bot user.");
        }

        this.name = name;
        this.password = password;
    }

    public String name() {
        return name;
    }

    public String password() {
        return password;
    }
}
