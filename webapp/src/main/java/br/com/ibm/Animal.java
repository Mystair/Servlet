package br.com.ibm;

abstract class Animal {
    public abstract String onomatopeia();
    public void dorme() {
        System.out.println("zZz");
    }
    public void susto(){
        System.out.println("RaaaAAAAH!");
    }
}

class Gato extends Animal {
    public String onomatopeia() {
        return "Miau, miau! e ronrona.(e moide :3)";
    }
}
