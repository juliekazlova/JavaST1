package by.epam.javaSt.kazlova;

public class Task3 {
    public String run(double a, double b) throws NumberFormatException {
        if(a<=0|b<=0){
            throw new NumberFormatException();
        }
        StringBuilder sb=new StringBuilder("Периметр: ");
        sb.append(a+b+Math.sqrt(a*a+b*b)).append(". Площадь: ").append(a*b/2).append(".");
        return sb.toString();
    }
}
