public class Standard_deviation {
    public static void main(String[] args){
        double average = 5.5;
        double standard_deviation = 0.0;

        for(int i =1; i<=10; i++){
            double numerator_standard_deviation = Math.pow(i-average,2);
            System.out.println(numerator_standard_deviation);
            standard_deviation += numerator_standard_deviation;
        }

        System.out.println("Numerator for standard deviation:" + standard_deviation);

        double standard_deviation_whole = Math.sqrt(standard_deviation/10);
        System.out.println("The standard deviation is " + standard_deviation_whole);




    }

}
