package uninove.temperatura;

public class Temperatura {
    public static float celciusParaFahrenheit(float tempCelcius) {
        return (1.8f * tempCelcius) + 32;
    }
    
    public static float fahrenheitParaCelcius(float tempFahrenheit) {
        return (tempFahrenheit - 32) / 1.8f;
    }
}
