package java_curso;

public class SerVivo {
    protected int idade;
    public SerVivo(int idade){
        this.idade = idade;
    }
    public void respirar() {
        System.out.println("Respirando");
    }
    public void dormir(){
        System.out.println("Dormindo");
    };
}