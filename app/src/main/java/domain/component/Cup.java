package domain.component;

public class Cup {
    private static Cup instance;

    private final int MAX_COUNT_OF_DOUBLE = 3;

    private Die firstDie;
    private Die secondDie;
    private int total;
    private int countOfDouble;

    private Cup() {
        this.firstDie = new Die();
        this.secondDie = new Die();
        this.total = 0;
        this.countOfDouble = 0;
    }

    public static Cup getInstance() {
        if (instance == null) {
            instance = new Cup();
        }
        return instance;
    }

    public void roll() {
        resetTotal();
        firstDie.roll();
        secondDie.roll();
        total = firstDie.getFaceValue() + secondDie.getFaceValue();
        if (isDouble()) {
            addCountOfDouble();
        } else {
            resetCountOfDouble();
        }
    }

    private void resetTotal() {
        total = 0;
    }

    public int getTotal() {
        return total;
    }

    public boolean isDouble() {
        return firstDie.getFaceValue() == secondDie.getFaceValue();
    }

    private void addCountOfDouble() {
        countOfDouble++;
    }

    public void isThirdDouble() {
        return countOfDouble == MAX_COUNT_OF_DOUBLE;
    }
}
