public class Atuendo {
    int TempMaxima;
    static String cabeza;
    static String torso;
    static String Piernas;
    static String Pies;

    public void getSugerencia(int TempMaxima) {
        Atuendo.cabeza = Prenda.esAptaPara(TempMaxima, Categoria.CABEZA);
        Atuendo.torso = Prenda.esAptaPara(TempMaxima, Categoria.TORSO);
        Atuendo.Piernas = Prenda.esAptaPara(TempMaxima, Categoria.PIERNAS);
        Atuendo.Pies = Prenda.esAptaPara(TempMaxima, Categoria.PIES);
    }
}