import java.util.Scanner;

public class phoneBill{
    private String plan;
    private double cost;
    private double gigabytes;
    private double additionalcost;
    private boolean hasCoupon;

    public phoneBill(String plan, double cost, double gigabytes, double additionalcost, boolean askCoupon){
        this.plan = plan;
        this.cost = cost;
        this.gigabytes = gigabytes;
        this.additionalcost = additionalcost;
        this.hasCoupon = askCoupon;
    }

public static void main(String[] args){
        double infinity = Double.POSITIVE_INFINITY;
        Scanner question = new Scanner(System.in);
        phoneBill green = new phoneBill("green",49.99,2,15,true);
        phoneBill blue = new phoneBill("blue",70,4,10,false);
        phoneBill purple = new phoneBill("purple",99.95,infinity,0,false);
        System.out.println("Hello and Welcome to the Phone Bill");
        System.out.println("What plan are you currently using?");
        String answer = question.nextLine().toLowerCase();
        double payment = 0;
        String planused;

        while(!answer.equals(green.plan) && !answer.equals(blue.plan) && !answer.equals(purple.plan) ){
            System.out.println("Please choose a real plan.");
            answer = question.nextLine().toLowerCase();
        }
        System.out.println("How many months are you looking to pay?");
        int months = question.nextInt();
        if(answer.equals(green.plan)){
            System.out.println("How many gigabytes over are you using?");
            int gigabytes = question.nextInt();

            System.out.println("Do you have a coupon?");

            String coupon = question.next();

            if(coupon.equals("yes")){
                payment = (green.cost + (gigabytes * green.additionalcost)) * months - 20;
            } else {
                payment = (green.cost + (gigabytes * green.additionalcost)) * months;
            }

        } else if (answer.equals(blue.plan)) {

            System.out.println("How many gigabytes over are you using?");
            int gigabytes = question.nextInt();
            payment = (blue.cost + (gigabytes * blue.additionalcost)) * months;
        } else if (answer.equals(purple.plan)){
            payment = purple.cost * months;

    }
    System.out.println("The cost that you need to pay for the plan is " + payment);


}

}



