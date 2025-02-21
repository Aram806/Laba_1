package org.example;

public class GeneratorJava implements Generator {
    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public Generator createSomeText(String txt) {
        stringBuilder.append(txt).append("\n");
        return this;
    }

    @Override
    public Generator createClass(String name, Modificator... modificator) {
        for (Modificator m : modificator) {
            stringBuilder.append(m.getValue()).append(" ");
        }
        stringBuilder.append("class ").append(name).append(" {\n");
        return this;
    }

    @Override
    public Generator createField(String name, Object value, Type type, Modificator... modificator) {
        for (Modificator m : modificator) {
            stringBuilder.append(m.getValue()).append(" ");
        }
        stringBuilder.append(type.getValue()).append(" ").append(name);
        if (value != null) {
            stringBuilder.append(" = ").append(value);
        }
        stringBuilder.append(";\n");
        return this;
    }

    @Override
    public String generate() {
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}