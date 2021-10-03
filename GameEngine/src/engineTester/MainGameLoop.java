package engineTester;

import org.lwjgl.opengl.Display;
import renderEngine.DisplayManager;

public class MainGameLoop {

    /**
     * @param args in main
     */
    public static void main(String[] args){
        DisplayManager.createDisplay();
        while (!Display.isCloseRequested()) {
            //render
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}
