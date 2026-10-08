package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9/5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        double temperatureFahrenheit = temperatureFahrenheit();
        return String.format("Current weather: %.1f°C (%.1f°F) and %s", temperatureCelsius, temperatureFahrenheit, conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius = (tempFahrenheit - 32) * 5/9;
        return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData wd = WeatherData.fromFahrenheit(77, "Sunny");

        double temperatureFahrenheit = wd.temperatureFahrenheit();
        double temperatureCelsius = wd.temperatureCelsius();

        System.out.println("This should print 25.0: " + temperatureCelsius);
        System.out.println("This should print 77.0: " + temperatureFahrenheit);
        System.out.println(wd.getSummary());

    }
}
