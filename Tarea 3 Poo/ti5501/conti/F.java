package ti5501.conti;
import ti5501.contrix.A;
import ti5501.contrix.E;

public class F
{
    public float f1;
    public double f2;
    private A a; 
    


    public F()
    {
    }
    
    public static double calcular(A a){  
        double resultado = a.calcular();  
        return resultado;
    }
    
    public String fM1(){
        String x="Hola";
        return x;
    }
    
    public int fM2(E e){
        int x=e.eM3();
        return x;
    }
    
    public int fM2(double p){
        return (int)p;
    }
}

