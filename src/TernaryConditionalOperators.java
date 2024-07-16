public class TernaryConditionalOperators {
    public static void main(String[] args) {

        // Ternary Operator
        String makeOfMotorcycle = "Ducati";
        boolean isDomestic = makeOfMotorcycle == "Ducati" ? false : true;
        String s = (isDomestic) ? "This bike is domestic": "This bike is not domestic";
        System.out.println(s);

        // Ternary Operator
        int age = 18;
        String canVote = (age >= 18) ? "They can vote!" : "They can not vote!" ;
        System.out.println(canVote);

        // if-then-else statement
        age = 17;
        if(age >= 18){
            System.out.println("They can vote!");
        } else{
            System.out.println("They can not vote!");
        }

        // Ternary Operator
        age = 20;
        String canDrink = (age >= 21) ? "They can drink!" : "They can not drink";
        System.out.println(canDrink);

        // If-Then-Else
        age = 36;
        if(age >= 21){
            System.out.println("They can drink!");
        } else {
            System.out.println("They can not drink!");
        }

        String raceName = "Clear Sky";
        int firstAge = 25;
        int sescondAge = 22;

        boolean racerOrder = (firstAge < sescondAge) ? true : false;
        String racerStart = racerOrder ? "The first racer on team " + raceName +" is the youngest!" : "The first racer on team " + raceName + " is the oldest racer!";
        System.out.println(racerStart);

    }
}
