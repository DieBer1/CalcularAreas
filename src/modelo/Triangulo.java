/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Triangulo extends FiguraGeometrica
{
    private Double base, altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

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
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public Double area()
    {
        return (base*altura)/2;
    }
}
