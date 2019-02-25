package main;

public class GraphicsTest {

    private static final int DEFAULT_WIDTH = 1080;
    private static final int DEFAULT_HEIGHT = 720;

    private static final boolean isResizable = false;

    private static NewFrame testFrame = new NewFrame(
            DEFAULT_WIDTH, DEFAULT_HEIGHT, isResizable, "Test");

    public static void main(String[] args) {
        testFrame.showFrame(true);
    }

}
