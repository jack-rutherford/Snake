
import java.awt.Color;

public record Constants() {
    public static final int GRID_SIZE_X = 50;
    public static final int GRID_SIZE_Y = 50;

    public static final int SNAKE_INITIAL_LENGTH = 5;
    public static final int SNAKE_INITIAL_SPEED = 50; // in milliseconds

    public static final Color COLOR_SNAKE = Color.white;
    public static final Color COLOR_FOOD = Color.BLUE;
    public static final Color COLOR_EMPTY = Color.darkGray;
}
