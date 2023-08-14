package Reading_Helper;


import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;


public class PropReader {

    private PropReader() {

    }

    /**
     * method to read the config fle of the core automation
     *
     * @param key      he key param is being passed to determine the key on the config file
     * @param filePath the desired file path.
     * @return the value of the config key.
     */
    public static String readConfig(String key, String filePath) {
        File file = new File(filePath);
        return getPropValue(key, file);
    }

    /**
     * method to read the config file from automation modules.
     *
     * @param key the key param is being passed to determine the key on the config file
     * @return the value of the config key.
     */
    public static String readConfig(String key) {
        File file = new File("src/main/resources/config.properties");
        return getPropValue(key, file);
    }

    @NotNull
    private static String getPropValue(String key, File file) {

        Properties properties = new Properties();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            properties.load(bufferedReader);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}