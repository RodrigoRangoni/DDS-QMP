public class Usuarie {
    String userName;
    String password;
    public static int TempMaxima;

    public static void GetTemperatura(String ciudad) {
        Usuarie.TempMaxima = AdapterWeather.GetTemperatura(ciudad);
    }

}
