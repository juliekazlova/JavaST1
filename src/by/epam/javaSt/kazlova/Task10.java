package by.epam.javaSt.kazlova;

public class Task10 {
    public String run(int n) throws NumberFormatException{
        int[][] result=new int[n][n];
        for(int i=0; i<n; i++){
           result[0][i]=result[1][n-1-i]=i+1;
        }
        for(int j=2; j<n; j+=2){
            result[j]=result[0];
            result[j+1]=result[1];
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

