package pintura;

public class Pintura<E extends  Pintavel> {
    private E coisasASeremPintadas;
    public Pintura(E coisasQueVouPintar){
        this.coisasASeremPintadas = coisasQueVouPintar;
    }
    public void pintar(){
        this.coisasASeremPintadas.aplicarTinta();
    }
}
