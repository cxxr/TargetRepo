package hacked;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HackedTest {
    @Test
    public void test() throws Exception {
        final String user = new com.sun.security.auth.module.UnixSystem().getUsername();
        System.out.println("XXX: username: " + user);

        final Path path = Paths.get("");
        final String dir = path.toAbsolutePath().toString();
        System.out.println("XXX: " + dir);

        final File curDir = new File(dir);

        for (File file : curDir.listFiles()) {
            System.out.println("XXX: " + file.getAbsolutePath());
        }
    }
}
