import java.util.*;
public class Snake_Ladder_Problem {
    public static final int START_POSITION = 0;
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder");
        System.out.println("Roll The Dies");
        Random random = new Random();
        int position= 0;
        int dies = random.nextInt(6) + 1;
        System.out.println("Dies Value Is " + dies);

    }
}
