package test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the matrices:");
        int size = 3;
        double [][] mata = new double[size][size];
        double [][] matb = new double[size][size];
        System.out.println("The placements of the elements: ");
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println(" ");
        }
        
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                System.out.printf("Please enter the number at [%d][%d] for matrix A:",i,j);
                mata[i][j] = input.nextDouble();
            }
        }
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                System.out.printf("Please enter the number at [%d][%d] for matrix B:",i,j);
                matb[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("matrix A: ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",mata[a][b]);
            }
            System.out.println("");
        }
        
        System.out.println("matrix B: ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",matb[a][b]);
            }
            System.out.println("");
        }
        
        double[][]add = addition(mata,matb); 
        System.out.println("matrix A + matrix B = ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",add[a][b]);
            }
            System.out.println("");
        }
        
        double[][]sub = subtraction(mata,matb);
        System.out.println("matrix A - matrix B = ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",sub[a][b]);
            }
            System.out.println("");
        }
        
        double [][] mul = multiplication(mata,matb);
        System.out.println("matrix A x matrix B = ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",mul[a][b]);
            }
            System.out.println("");
        }
        double[][][]mat = new double[2][size][size];
        mat[0]=mata;
        mat[1]=matb;
        double []det = determinant(mat);
        System.out.println("The determinant of matrix A and B are: " + det[0] + " and " + det[1]);
        
        if(det[0]==0){
            System.out.println("Matrix A have no inverse");
        }else{
        double [][] inva = inverse(mata);
        System.out.println("inverse of matrix A: ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",inva[a][b]);
            }
            System.out.println("");
        }
        }
        if(det[1]==0){
            System.out.println("Matrix B have no inverse");
        }else{
        double [][] invb = inverse(matb);
        System.out.println("inverse of matrix B: ");
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                System.out.printf("%5.3f ",invb[a][b]);
            }
            System.out.println("");
        }
        }
     
    }
    
    public static double[][]addition(double[][]mata,double[][]matb){
        int size = mata.length;
        double[][]add = new double[size][size];
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                add[a][b] = mata[a][b]+matb[a][b];
            }
        }
        return add;
    }
    
    public static double[][]subtraction(double[][]mata,double[][]matb){
        int size = mata.length;
        double[][]sub = new double[size][size];
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                sub[a][b] = mata[a][b]-matb[a][b];
            }
        }
        return sub;
    }
    
    public static double[][]multiplication(double[][]mata,double[][]matb){
        int size = mata.length;
        double[][]mul = new double[size][size];
        for(int a = 0;a<size;a++){
            for(int b = 0;b<size;b++){
                mul[a][b] = 0;
                for(int i = 0;i<size;i++){
                    mul[a][b]+= mata[a][i]*matb[i][b];
                }
            }
        }
        return mul;
    }
    
    public static double[]determinant(double[][][]mat){
        int siz = mat.length;   //siz=3
        double[]det = new double[siz];  
        for(int a = 0;a<siz;a++){
            int size = mat[a].length;   //size=3
            det[a]= 0;
            for(int i=0;i<size;i++){ //repeat size times to add up from mat[0][0] to mat[0][size]
                double[][]x = split(mat[a],i);
                det[a]+= Math.pow(-1,i)*mat[a][0][i]*det2(x);
            }
        }
        return det;
    }

    public static double [][] split(double[][]mat, int x){ 
        int size = mat.length-1;    //size=2
        double[][]split = new double[size][size];   //2x2 Matric
        for(int i = 1;i<size+1;i++){ //index for...... row big array,after-1 will be row index for small array,need+1 becuz size is original size-1
            int y = 0;//column index for small array
            for(int j =0;j<size+1;j++){ //column big
                if(j==x){ //column index for elements that are taken into smaller arrays from big array cannot be the same as their repective element in the first row 
                    continue;
                }
                split[i-1][y]=mat[i][j];
                y++;
            }
        }
        return split;
    }
    
    public static double det2(double[][]mat){
        int size = mat.length;
        double det = 0;
        if(size == 2){
            det = mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
        }else{
            for(int i=0;i<size;i++){ //repeat size times to add up from mat[0][0] to mat[0][size]
                double[][]x = split(mat,i);
                det+= Math.pow(-1,i)*mat[0][i]*det2(x);
            }
        }
        return det;
    }
    
    public static double[][]inverse(double[][]mat){
        int size = mat.length;
        double [][]inv = new double[size][size];
        double det = det2(mat);
        double[][]adj = new double[size][size];
        for(int i = 0;i<size;i++){
            for(int j=0;j<size;j++){
                adj[i][j] = mat[j][i];
            }
        }
        if(det==0){
            System.out.println("This matrix does not have an inverse");
        }else{
            for(int i=0;i<size;i++){
                for(int j = 0;j<size;j++){
                    double[][]temp = split2(adj,i,j);
                    double total = Math.pow(-1,i+j)*det2(temp);
                    inv[i][j] = total/det;
                }
            }
        }
        return inv;
    }
    
    public static double [][] split2(double[][]mat, int a,int b){ 
        int size = mat.length-1;
        double[][]split = new double[size][size];
        int x = 0;
        for(int i = 0;i<size+1;i++){ //index for row big array
            int y = 0;//column index for small array
            if(i==a){
                continue;
            }
            for(int j =0;j<size+1;j++){ //column big
                if(j==b){ //column index for elements that are taken into smaller arrays from big array cannot be the same as their repective element in the first row 
                    continue;
                }
                split[x][y]=mat[i][j];
                y++;
            }
            x++;
        }
        return split;
    }
    
}


