import java.util.List;
import java.util.Map;

public class AdapterWeather {

    public static int GetTemperatura(String ciudad) {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(ciudad);
        condicionesClimaticas.get(0).get("PrecipitationProbability");
    }

}
