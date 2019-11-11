package by.epam.javaSt.kazlova;

public class Task8 {
    public long run(int[] a, int k){
        long result=0;
        for(int arg: a){
           if(arg%k==0){
               result+=arg;
           }
        }
        return result;
    }
}
