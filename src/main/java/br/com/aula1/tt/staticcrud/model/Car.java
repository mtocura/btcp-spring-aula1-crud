package br.com.aula1.tt.staticcrud.model;

public class Car {

    private Long id;
    private String modelo;
    private String marca;
    private Integer ano;

    public Car(Long id, String modelo, String marca, Integer ano) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
