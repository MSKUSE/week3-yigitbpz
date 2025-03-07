public class FindGrade{

    public static void main(String[] args) {
    if (args.length >= 1 ) {
        int score = Integer.parseInt(args[0]);

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score <= 100) {
            System.out.println("B");
        } else if (score >= 70 && score <= 100) {
            System.out.println("C");
        } else if (score >= 60 && score <= 100) {
            System.out.println("D");
        } else if (score >= 0 && score <= 100) {
            System.out.println("F");
        } else {
            System.out.println("Invalid Grade!!!");
        }
    }else {
        System.out.println("Please Enter a Grade!!!");
    }}}

        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F