public class Auto {
    private Integer cilindrata;
    private String marca;
    private String targa;
    private String modello;
    public Auto (String marca, String modello,String targa, Integer cilindrata){
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.targa = targa;
        this.modello = modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca=" + marca +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                '}';
    }
}


