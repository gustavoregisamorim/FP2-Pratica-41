import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

public class Pratica41 {
    
    public static void main(String[] args) {
        
        Elipse elipse = new Elipse(5,5);
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(5,5);
        
        System.out.println(elipse.getArea());
        System.out.println(elipse.getPerimetro());
        System.out.println(circulo2.getArea());
        System.out.println(circulo1.getPerimetro());
    }
}