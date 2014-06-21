package com.gmail.jr08102000.KnightCraft.configuration;

/**
 * @author jr0810 6/20/2014.
 */
public class configClasses extends configLoader{

    private static configClasses instance;

    private configClasses() {
        super("職業.yml");
        validateKeys();
    }

    public static configClasses getInstance() {
        if (instance == null) {
            instance = new configClasses();
        }

        return instance;
    }

    protected boolean validateKeys() {
        return true;
    }

    protected void loadKeys() {
    }

}
