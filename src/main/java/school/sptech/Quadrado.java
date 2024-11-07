package school.sptech;

public class Quadrado extends Figura {

    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double calcularArea() {
       Double resultado = lado * lado;
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
