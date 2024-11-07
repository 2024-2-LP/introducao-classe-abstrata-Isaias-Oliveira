package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        Double resultado = raio * raio * Math.PI;
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
