package br.com.senai.enuns;

public enum Genero {
    M("Masculino"),F( "Ferminino"), O("Outros");

    private String tipo;
    Genero(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}
