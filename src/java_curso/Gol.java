package java_curso;

public class Gol implements Carro{
    final int limiteDeVelocidade = 150;
    public int velocidadeAtual = 0;
    @Override
    public void acelerar() {
        if(this.velocidadeAtual < limiteDeVelocidade) this.velocidadeAtual += 10;
        System.out.println("Acelerando . . .");
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
