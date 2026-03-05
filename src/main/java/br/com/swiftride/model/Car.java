package br.com.swiftride.model;

public class Car {
    private long id;
    private String NomeCarro;
    private String Marca;
    private String Tipo;

    public Car(long id, String marca, String nomeCarro, String tipo) {
        this.id = id;
        Marca = marca;
        NomeCarro = nomeCarro;
        Tipo = tipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCarro() {
        return NomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        NomeCarro = nomeCarro;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}

