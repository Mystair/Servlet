package br.com.ibm;

public interface Pet {
    String nome();
    String especie();
    String raca();
}

class petGato implements Pet {
    public String nome(){
        return "O nome do meu pet é Jefferson,";
    }
    public String especie(){
        return "Ele é um gato.";
    }
    public String raca(){
        return "A raça dele é Laranja(Tenha medo).";
    }
}
