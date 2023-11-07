package equation;


public record QuadraticEquation(double a, double b, double c) {

    public boolean isQuadratic(){
        return a != 0;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();

        if (a != 0) {
            stringBuilder.append(a).append("x^2");
        }

        if (b != 0) {
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append(" + ");
            }
            stringBuilder.append(b).append("x");
        }

        if (c != 0) {
            if (!stringBuilder.isEmpty()) {
                stringBuilder.append(" + ");
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
