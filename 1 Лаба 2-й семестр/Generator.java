package org.example;

public interface Generator {
    Generator createSomeText(String someText);
    Generator createClass(String name, Modificator... modificator);
    Generator createField(String name, Object value, Type type, Modificator... modificator);
    String generate();
}