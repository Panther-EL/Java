public class Average_of_first_ten_integers {
    public static void main (String[] args){
        int sum = 0;
        for(int i =1; i<=10; i++){
             sum += i;
            System.out.println("The sum is:" + sum );
        }

        double average = (sum)/10.0;
        System.out.println("The average of the first ten integers is:" + average);

    }
}
