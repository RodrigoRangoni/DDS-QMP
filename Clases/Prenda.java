public class Prenda {
    Categoria categoria;
    int TempMaxima;

    public static String esAptaPara(int TempMaxima, Categoria categoria) {
        return "Gorra";
    }

    public Categoria getCategoria() {
        return Categoria.CABEZA;
    }
}