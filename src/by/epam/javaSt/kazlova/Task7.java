package by.epam.javaSt.kazlova;

public class Task7 {
    public String run(int a, int b, int h) throws NumberFormatException {
        StringBuilder sb=new StringBuilder();
        sb.append("arg   -   result\n");
       while (a<=b){
           sb.append(a).append("   -   ").append(Math.pow(Math.sin(a), 2)-Math.cos(2*a)).append("\n");
           a+=h;
       }
        return sb.toString();
    }
}
