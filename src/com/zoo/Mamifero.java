package com.zoo;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, double comprimento, int nPatas, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, nPatas, cor, ambiente, velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    @Override
    public String toString(){
        return String.format("-------------------------------------"+"\n"+
                "Animal: "+nome+ "\n"+
                "Comprimento: "+comprimento+" cm" +"\n"+
                "Patas: "+nPatas+"\n"+
                "Cor: "+cor+"\n"+
                "Ambiente: "+ambiente + "\n"+
                "Velocidade: "+velocidade+" m/s"+"\n"+
                "Alimento: "+alimento+"\n"+
                "-------------------------------------"+"\n");
    }
}

