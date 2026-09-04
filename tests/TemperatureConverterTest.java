public class TemperatureConverterTest {
    public static void main(String[] args) {
        int passed = 0;
        int total = 4;

        if (Math.abs(TemperatureConverter.celsiusToFahrenheit(0) - 32.0) < 0.01) {
            System.out.println("PASS: celsiusToFahrenheit(0)");
            passed++;
        } else {
            System.out.println("FAIL: celsiusToFahrenheit(0)");
        }

        if (Math.abs(TemperatureConverter.fahrenheitToCelsius(32) - 0.0) < 0.01) {
            System.out.println("PASS: fahrenheitToCelsius(32)");
            passed++;
        } else {
            System.out.println("FAIL: fahrenheitToCelsius(32)");
        }

        if (Math.abs(TemperatureConverter.celsiusToKelvin(0) - 273.15) < 0.01) {
            System.out.println("PASS: celsiusToKelvin(0)");
            passed++;
        } else {
            System.out.println("FAIL: celsiusToKelvin(0)");
        }

        if (Math.abs(TemperatureConverter.celsiusToFahrenheit(100) - 212.0) < 0.01) {
            System.out.println("PASS: celsiusToFahrenheit(100)");
            passed++;
        } else {
            System.out.println("FAIL: celsiusToFahrenheit(100)");
        }

        System.out.println(passed + " of " + total + " tests passed.");
        if (passed != total) {
            System.exit(1);
        }
    }
}
