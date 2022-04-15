package org.ObJot.arch;

public class OsArch {
    public String osarch = System.getProperty("os.arch");

    public String getOsArch() {
        return osarch;
    }
}
