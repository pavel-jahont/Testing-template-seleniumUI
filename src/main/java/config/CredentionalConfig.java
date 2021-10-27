package config;

import locators.Locators;

import java.io.InputStream;
import java.util.Properties;

public class CredentionalConfig {

    private static final Properties credentional;

    static {
        credentional = new Properties();

        InputStream inputSteamFile = Locators.class.getResourceAsStream("/credentional.properties");

        try {

            credentional.load(inputSteamFile);

        } catch (Exception e) {
            System.out.println("File not found:" + e);
        }
    }

    public static String getCredentional(String locatorName) {
        return credentional.getProperty(locatorName);
    }
}
