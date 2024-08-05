package comunicacion;

public class Periodico extends Escrito{
    //Atributos
    private String fecha;
    private String primicia;
    private String interpretacion;


    //Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String interpretacion, String fecha, String primicia) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }


    //Métodos
    @Override
    public int palabrasTotales(int palabrasPagina) {
        int factor = 10;
        return palabrasPagina * getPaginas() * factor;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha + "\n" + primicia;
    }


    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
