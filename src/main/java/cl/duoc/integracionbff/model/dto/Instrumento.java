package cl.duoc.integracionbff.model.dto;

public class Instrumento {
    
    private int    idInstrumento;
    private String nombre;
    private String marca;
    private int idCategoria;

    public Instrumento() {
    }

    public int getIdInstrumento() {
        return idInstrumento;
    }
    public void setIdInstrumento(int idInstrumento) {
        this.idInstrumento = idInstrumento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }


    
}
