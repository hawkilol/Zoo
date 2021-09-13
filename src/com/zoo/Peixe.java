package com.zoo;

public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome, double comprimento, int nPatas, String cor, String ambiente, double velocidade, String caracteristica) {
        super(nome, comprimento, nPatas, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    @Override
    public String toString(){
        return String.format("-------------------------------------"+"\n"+
                "Animal: "+nome+ "\n"+
                "Comprimento: "+comprimento+" cm"+"\n"+
                "Patas: "+nPatas+"\n"+
                "Cor: "+cor+"\n"+
                "Ambiente: "+ambiente + "\n"+
                "Velocidade: "+velocidade+" m/s"+"\n"+
                "Caracteristica:"+caracteristica+"\n"+
                "-------------------------------------"+"\n");
    }
}
