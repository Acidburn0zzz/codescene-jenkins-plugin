package org.jenkinsci.plugins.codescene.Domain;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

public class CodeSceneUser {
    private static final Charset UTF8 = Charset.forName("UTF8");
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

    public String asBase64Encoded() {
        final byte[] bs = (name + ":" + password).getBytes(UTF8);

        return new String(Base64.encodeBase64(bs), UTF8); }
}
