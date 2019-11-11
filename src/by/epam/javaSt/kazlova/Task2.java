package by.epam.javaSt.kazlova;


public class Task2 {
    public double run(int a, int b, int c) throws NumberFormatException {
        double rezult=0;
        if(a==0|b==0|b*b<4*a*c){
            throw new NumberFormatException();
        }
        rezult=(b+Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
        return rezult;
    }
}
