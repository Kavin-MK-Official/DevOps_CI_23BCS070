public class TemperatureConverter {
    private static final String APP_BANNER = "DevOps Temperature Converter v1.1 - Extended";

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        System.out.println(APP_BANNER);
        System.out.println("25°C = " + celsiusToFahrenheit(25) + "°F");
    }
}
