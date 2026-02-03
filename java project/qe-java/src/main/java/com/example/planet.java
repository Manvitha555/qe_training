public class planet {


    public static void main(String[] args) {

        double seconds = 1_000_000_000;
        double earthSeconds = 31_557_600;

        double mercuryYear = 0.2408467;
        double venusYear = 0.61519726;
        double marsYear = 1.8808158;
        double jupiterYear = 11.862615;
        double saturnYear = 29.447498;
        double uranusYear = 84.016846;
        double neptuneYear = 164.79132;

        double ageMercury = seconds / (earthSeconds * mercuryYear);
        double ageVenus = seconds / (earthSeconds * venusYear);
        double ageEarth = seconds / earthSeconds;
        double ageMars = seconds / (earthSeconds * marsYear);
        double ageJupiter = seconds / (earthSeconds * jupiterYear);
        double ageSaturn = seconds / (earthSeconds * saturnYear);
        double ageUranus = seconds / (earthSeconds * uranusYear);
        double ageNeptune = seconds / (earthSeconds * neptuneYear);

        System.out.printf("Mercury: %.2f%n", ageMercury);
        System.out.printf("Venus: %.2f%n", ageVenus);
        System.out.printf("Earth: %.2f%n", ageEarth);
        System.out.printf("Mars: %.2f%n", ageMars);
        System.out.printf("Jupiter: %.2f%n", ageJupiter);
        System.out.printf("Saturn: %.2f%n", ageSaturn);
        System.out.printf("Uranus: %.2f%n", ageUranus);
        System.out.printf("Neptune: %.2f%n", ageNeptune);
    }
}
