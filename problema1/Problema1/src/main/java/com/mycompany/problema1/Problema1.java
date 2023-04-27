
package com.mycompany.problema1;

class Terreno{
    private double costoTerreno;
    private double anchoTerreno;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;
    
    public Terreno(){}

    public Terreno(double anchoTerreno, double largoTerreno, double valorMetroCuadrado) {
        this.anchoTerreno = anchoTerreno;
        this.largoTerreno = largoTerreno;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setCostoTerreno(double costoTerreno) {
        this.costoTerreno = costoTerreno;
    }
    public void setAnchoTerreno(double anchoTerreno) {
        this.anchoTerreno = anchoTerreno;
    }
    public void setLargoTerreno(double largoTerreno) {
        this.largoTerreno = largoTerreno;
    }
    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    //calcular arrea
    public void calcularAreaTerreno(){
        this.areaTerreno=this.anchoTerreno*this.largoTerreno;
    }
    //calcular costo
    public void calcularCostoTerreno(){
        this.costoTerreno = this.areaTerreno*this.valorMetroCuadrado;
    } 
    //GET
    public double getCostoTerreno() {
        return this.costoTerreno;
    }
    public double getAnchoTerreno() {
        return this.anchoTerreno;
    }
    public double getLargoTerreno() {
        return this.largoTerreno;
    }
    public double getAreaTerreno() {
        return this.areaTerreno;
    }
    public double getValorMetroCuadrado() {
        return this.valorMetroCuadrado;
    }
       
    public String toString(){
        String msj = String.format("DATOS DEL TERRENO"
                +" \nAncho del Terreno %.2f"
                +" \nLargo del Terreno %.2f"
                +" \nValor del metro cuadrado del Terreno %.2f" 
                +" \nEl Area del Terreno %.2f"
                +" \nEl costo del Terreno %.2f", 
                this.getAnchoTerreno(),this.getLargoTerreno(),this.getValorMetroCuadrado(),this.getAreaTerreno(), this.getCostoTerreno());
        return msj;
    }
    
}

public class Problema1 {

    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10,2,2);
        terreno1.calcularAreaTerreno();
        terreno1.calcularCostoTerreno();
        System.out.println(terreno1);
    }
}
