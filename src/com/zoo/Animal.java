package com.zoo;

public class Animal {
    protected String nome;
    protected double comprimento;
    protected int nPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;

    public Animal(String nome, double comprimento, int nPatas, String cor, String ambiente, double velocidade){
        this.nome = nome;
        this.comprimento = comprimento;
        this.nPatas = nPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public int getnPatas() {
        return nPatas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
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
                "-------------------------------------"+"\n");
    }
}
