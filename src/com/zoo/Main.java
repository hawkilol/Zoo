package com.zoo;

public class Main {

    public static void main(String[] args){
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2.0);
        System.out.println(camelo);
        Peixe tubarão = new Peixe("Tubarão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
        System.out.println(tubarão);
        Mamifero urso = new Mamifero("Urso-do-canadá", 180, 4, "Vermelho", "Terra", 0.5, "Mel");
        System.out.println(urso);
    }
}
