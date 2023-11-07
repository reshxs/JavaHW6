package generator;


public interface IntGenerator {
    int nextPositive();

    default int nextNegative(){
        return -1 * nextPositive();
    }

    String getName();
}
