package generator;

public class RandomIntGenerator implements IntGenerator{
    @Override
    public int nextPositive() {
        return (int) (Math.abs(Math.random() * 1_000_000));
    }

    @Override
    public String getName() {
        return "RandomIntGenerator";
    }
}
