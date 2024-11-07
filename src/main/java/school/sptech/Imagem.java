package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public void adicionar(Figura figura){
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaArea = 0.0;
        for (Figura figura : figuras){
            somaArea += figura.calcularArea();
        }
        return somaArea;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> areaMaior = new ArrayList<>();
        for (Figura figura : figuras){
            if (figura.calcularArea() > 20){
                areaMaior.add(figura);
            }
        }
        return areaMaior;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : figuras){
            if (figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
