package generator;

public class SerialIntGenerator implements IntGenerator{
    private static int counter = 0;

    @Override
    public int nextPositive() {
        counter += 1;
        return counter;
    }

    @Override
    public String getName() {
        return "SerialIntGenerator";
    }
}
