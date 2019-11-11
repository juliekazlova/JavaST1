package by.epam.javaSt.kazlova;

public class Task1 {
    public boolean run(int arg){
        if(arg>9999|arg<1000)
        return false;

        int firstSum=arg%10;
        arg=arg/10;
        firstSum+=arg%10;
        arg=arg%10;

        int secondSum=arg%10;
        arg=arg/10;
        secondSum+=arg;

        return firstSum==secondSum;
    }
}
