package utfpr.ct.dainf.if62c.pratica;

public class Elipse {
    
    private double semieixo1;
    private double semieixo2;
   
    public Elipse(){
        
    }
    public Elipse(double semieixo1,double semieixo2){
        this.semieixo1 = semieixo1;
        this.semieixo2 = semieixo2;
    }
    public double  getArea(){
        double area;
        area = Math.PI * this.semieixo1 * this.semieixo2;
        return area;
    }
    public double getPerimetro(){
        double perimetro;
        perimetro = Math.PI * (3 * (this.semieixo1 + this.semieixo2) - Math.sqrt(((3 * this.semieixo1) + this.semieixo2) * (this.semieixo1 + (3 * this.semieixo2))));
        return perimetro;
    }
}