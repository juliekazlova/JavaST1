package by.epam.javaSt.kazlova;

public class Task5 {
    public String run(int a, int b, int c) throws NumberFormatException {
        StringBuilder sb=new StringBuilder();
        double[] args={a, b, c};
        for(double arg: args) {
            if (arg < 0) {
                sb.append(Math.pow(arg, 4)).append("  ");
            } else {
                sb.append(Math.pow(arg, 2)).append("  ");
            }
        }
        return sb.toString();
    }
}
