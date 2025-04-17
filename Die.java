import java.util.Random;

public class Die {
    private int value;
    private final Random rand;

    public Die(){
        this.value = 0;
        this.rand = new Random();
    }

    //roll the die (1-6)
    public void roll(){
        this.value = this.rand.nextInt(6) + 1;
    }

    //check against another die
    public boolean equals(Die die2) {
        return this.value == die2.value;
    }

    //return string value
    public String toString(){
        return switch (this.value) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            default -> "unknown";
        };
    }

    public int getValue(){
        return this.value;
    }

}
