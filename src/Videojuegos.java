public class Videojuegos {

    String titulo;
    String plataforma;
    int horasJugadas;

    public Videojuegos(String tituto, String plataforma, int horasJugadas) {
        this.titulo = tituto;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Plataforma: " + plataforma + ", Horas jugadas: " + horasJugadas;
    }
}
