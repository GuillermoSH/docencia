package es.iespuertodelacruz.profesor.controlador;

public class Multilplicacion extends Operacion{
    
    Double multiplicacion;
    
    public Multilplicacion(double n1, double n2) {
        super(n1, n2, '*');
        multiplicacion = n1*n2;
        this.setResultado(multiplicacion);
    }
}
