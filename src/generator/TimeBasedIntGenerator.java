package generator;

public class TimeBasedIntGenerator implements IntGenerator{
    @Override
    public int nextPositive() {
        return (int) (System.currentTimeMillis() % 1_000_000);
    }

    @Override
    public String getName() {
        return "TimeBasedIntGenerator";
    }
}
