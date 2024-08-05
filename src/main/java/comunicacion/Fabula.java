package comunicacion;

public class Fabula extends Escrito{
    // atributos
    private String ensenanza;
    private String interpretacion;


    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String interpretacion, String ensenanza) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }


    // Métodos
    @Override
    public int palabrasTotales(int palabrasPagina) {
        int factor = 1;
        return palabrasPagina * getPaginas() * factor;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + ensenanza;
    }


    //Getters y setters
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
