import java.util.*;
public class Snake_Ladder_Problem {
    public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int END_POSITION = 100;
    public static final int Ladder = 1;
    public static final int Snake = 2;
    static int currentPosition;
    static String position;
    static Random random = new Random();

    public static int dieRoll() {
        int diceValue = random.nextInt(6) + 1;
        System.out.println("Dice value : " + diceValue);
        return diceValue;
    }

    public static int playerChecksOption() {
        int dicecount = 0;
        int currentPosition = START_POSITION;
        while (currentPosition < END_POSITION) {
            int checkOption = random.nextInt(3);
            int dice = dieRoll();
            dicecount ++;
            switch (checkOption) {
                case NO_PLAY -> {
                    position = "Not played";
                    currentPosition = currentPosition;
                }
                case Ladder -> {
                    if (currentPosition + dice > END_POSITION) {
                        currentPosition = currentPosition;
                    } else {
                        currentPosition += dice;
                    }
                }
                case Snake -> {
                    position = "Player is on Snake";
                    if (currentPosition - dice <= START_POSITION) {
                        currentPosition = START_POSITION;
                    } else {
                        currentPosition -= dice;
                    }
                }
            }
            System.out.println("Player's Position :" + position + ",  #Current Position :" + currentPosition);
        }
        return currentPosition;
    }

    public static void main (String[] args){
        System.out.println("Welcome to Snake and Ladder Game");
        playerChecksOption();

    }

}
