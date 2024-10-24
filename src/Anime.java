public class Anime {

    String nombre ;
    int numeroEpisocios;
    String genero;

    public Anime() {
    }

    public Anime(String nombre, int numeroEpisocios, String genero) {
        this.nombre = nombre;
        this.numeroEpisocios = numeroEpisocios;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEpisocios() {
        return numeroEpisocios;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEpisocios(int numeroEpisocios) {
        this.numeroEpisocios = numeroEpisocios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nombre='" + nombre + '\'' +
                ", numeroEpisocios=" + numeroEpisocios +
                ", genero='" + genero + '\'' +
                '}';
    }
}
