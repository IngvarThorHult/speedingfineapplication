public class SpeedingFine extends Fine{
    public SpeedingFine(String person, int speed) {
        super(person, speed);
        CalculateFine();
    }
    @Override
    public void PrintFine() {
        System.out.println("PERSON: " + getPerson() + "\n" +
                "SPEED: " + getSpeed() + "km\n" +
                "FINE PAYABLE: R " + Math.round(getFinePayable()));
    }
}
