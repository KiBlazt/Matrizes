import java.rmi.server.ObjID;

import javax.naming.spi.DirStateFactory.Result;

public class App {
    int[][] matriz2 = {{4,9,2},{0,5,7},{3,1,8}};
    int[][] matriz1= {{8,2,1},{5,3,0},{9,7,3}};
    int[][] res= new int[3][3];
    
    
    public static void main(String[] args) throws Exception {
        App obj1= new App();
        obj1.Mostrar();
        System.out.println(" la suma es ");
        obj1.SumaResultado();
        System.out.println(" la resta es ");
        obj1.ResResultado();
    }
    public void SumaResultado(){
        System.out.println(" Suma");
        for (int i = 0; i < this.matriz1.length; i++) {
            for (int j = 0; j < this.matriz1[i].length; j++) {
                this.res[i][j]= this.matriz1[i][j]+this.matriz2[i][j];
                
                
                System.out.print(this.res[i][j]+ "  ");
            }
            System.out.println(" ");
        }
        
    }
    public void ResResultado(){
        System.out.println(" Resta ");
        for (int i = 0; i < this.matriz1.length; i++) {
            for (int j = 0; j < this.matriz1[i].length; j++) {
                this.res[i][j]= this.matriz1[i][j]-this.matriz2[i][j];
                
                
                System.out.print(this.res[i][j]+ "  ");
            }
            System.out.println(" ");
        }
        
    }
    public void Mostrar(){
            System.out.println("MATRISES ");
            System.out.println(" Matris 1");
            for (int i = 0; i < this.matriz1.length; i++) {
                for (int j = 0; j < this.matriz1[i].length; j++) {
                    
                    
                    System.out.print(matriz1[i][j]+ "  ");
                }
                System.out.println(" ");
            }
            System.out.println("Matris 2");
            for (int i = 0; i < this.matriz2.length; i++) {
                for (int j = 0; j < this.matriz2[i].length; j++) {
                    
                    
                    System.out.print(matriz2[i][j]+ "  ");
                }
                System.out.println(" ");
            }
            
        
    }
}
