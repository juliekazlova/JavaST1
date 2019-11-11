package by.epam.javaSt.kazlova;

public class Task6 {
    public String run(int a, int b, int c) throws NumberFormatException {
        double[] args={a, b, c};
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        for(double arg: args) {
            if (arg < min) {
                min=arg;
            }
            if(arg>max){
                max=arg;
            }
        }
        return min+" "+max;
    }
}
