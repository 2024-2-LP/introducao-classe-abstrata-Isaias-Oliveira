package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        Double resultado = base * altura / 2;
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
