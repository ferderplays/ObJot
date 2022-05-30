package org.objot;

import org.objot.ui.MainWindow;
import org.objot.ui.loading.LoadingScreen;

public class Main {
	/**
     * Objot is a high-security OS,
     * it hides your IP, and checks whether a jar file contains anything, that is
     * malicious;
     * How do u know something is malicious? (some of u may ask me this)
     * -> I have a lot of experience with checking jar files for malware
     * 
     * @throws InterruptedException
     */

    public static boolean loaded = false;

    public static void main(String[] args) throws InterruptedException {
    	LoadingScreen ls = new LoadingScreen();
    	Thread.sleep(10000);
    	ls.dispose();
    	loaded = true;
    	Integer k = 1;

    	switch (k) {
			case 1:
				new MainWindow();
		}
    }
}
