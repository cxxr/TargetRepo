package me.seancassidy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {
    private static final Logger log = LogManager.getLogger();

    private final String name;

    public MyClass(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String... args) {
        final MyClass myClass = new MyClass("Sean");
        log.info("Hello, {}", myClass.getName());
    }
}
