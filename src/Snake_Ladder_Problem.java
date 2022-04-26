import java.util.*;
public class Snake_Ladder_Problem {
    public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Roll The Dies");
        Random random = new Random();
        int position= 0;
        int dies = random.nextInt(6) + 1;
        System.out.println("Dies Value Is " + dies);

        int options = random.nextInt(3);
        System.out.println(options);
        switch (options){
            case Ladder :
                position += dies;
                break;
            case Snake:
                if (position != 0)
                    position -= dies;
                break;
            case NO_PLAY:
                break;
        }
        System.out.println("Player At Position " + position);
    }
}
