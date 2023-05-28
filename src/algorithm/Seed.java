package algorithm;

public enum Seed {
    Empty("-"), O("O"), X("X");

    public final String value;

    Seed(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
