/* The video game machines at your local arcade output tokens according to how well you play the game. 
You can redeem 10 tokens for a candy bar or 3 coupons for a gumball. 
You prefer candy bars to gumballs. Write a program that defines a variable initially assigned to the number of 
tokens you win. Next, the program should output how many candy bars and gumballs you can get
if you spend all of your tokens on candy bars first, and any remaining tokens on gumballs.*/
public class tokenMachineRedeemer{
    
    public static void main(String[]args){
        /*
        candy bar = 10
        gumball = 3
         */
        int tokensWon = 68; // Here we are setting that the customer won 68 tokens.
        int numCandyBars = tokensWon/10; // This function gives us the # of candy bars we'll be able to buy. Candy bars are worth 10 tokens.
        int leftoverCoupons = tokensWon%10; // Using %, we are able to get the remainder of our tokens after spending it on candy bars.
        int numGumballs = leftoverCoupons/3; /*  This function then tells us the # of gumballs we'll be able to buy with the leftover tokens. 
        Gumballs are worth 3 tokens.*/ 
        System.out.println("\n");
        System.out.println("\tVideo Game Token Redeemer\t\n");
        System.out.println("By winning "+tokensWon+" tokens, you are able to buy");
        System.out.println(numCandyBars+" Candy Bars & ");
        System.out.println(numGumballs+" Gumballs ");
        System.out.println("\n");

    }
}