package myioc;

import lombok.SneakyThrows;import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private Map<Class<?>,Object> beans = new HashMap<>();

    @SneakyThrows
    public static void main(String[] args) {
        String packageName = "myioc";
        String slashPackageName = packageName.replace(".", "/");
        URL url = ClassLoader.getSystemResource(slashPackageName);
        File directory = new File(url.toURI());
        
        File[] files = directory.listFiles();
        for (File file : files) {

            if (file.getName().endsWith(".class")) {
                String className = file.getName()
                        .substring(0, file.getName().length() - 6);

                String fullClassName = packageName + "." + className;
                Class<?> clazz = Class.forName(fullClassName);
            }
        }

    }


}
