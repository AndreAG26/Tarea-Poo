package ti5501.conti;
import ti5501.contrix.A;
import ti5501.contrix.E;

public class F
{
    public float f1;
    public double f2;
    protected A f; 
    


    public F()
    {
    }
    
    public static double calcular(E e){  
        double resultado = e.eM1();  
        return resultado;
    }
    
    public String fM1(){
        String x="Hola";
        return x;
    }
    
    public int fM2(){
        int x=0;
        return x;
    }
    
    public int fM2(double p){
        return (int)p;
    }
}

