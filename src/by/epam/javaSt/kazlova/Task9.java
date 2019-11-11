package by.epam.javaSt.kazlova;

public class Task9 {
    public String run(int[] a, int[] b, int k) throws NumberFormatException{
        if(k>a.length){
            throw new NumberFormatException();
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<a.length+b.length; i++) {
            if (i < k) {
                sb.append(a[i]);
            } else {
                if (i < k + b.length) {
                    sb.append(b[i - k]);
                } else {
                    if (i <k+b.length+a.length) {
                        sb.append(a[i-b.length]);
                    }
                }
            }
            sb.append("  ");
        }
        return sb.toString();
    }
}
