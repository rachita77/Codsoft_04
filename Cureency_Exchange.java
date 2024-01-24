import java.util.Scanner;

public class Cureency_Exchange 
{
    public static void main(String[] args) 
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Choose one of the currency");
        System.out.println("1) Dollares to Indian reupee");
        System.out.println("2) Dollares to Pound");
        System.out.println("3) Dollares to Euro");
        System.out.println("Enter your choice:");
        int exchange = as.nextInt();
        switch (exchange) 
        {
            case 1:
                System.out.println("Enter the Dollare money");
                double usd = as.nextDouble();
                if(usd >= 0)
                {
                    System.out.println("converted amount is:" + usd*82.87 + " Rs.");
                }
                else
                {
                    System.out.println("The Dollare money must be positive");
                }
                break;
            

            case 2:
                System.out.println("Enter the Dollare money");
                double po = as.nextDouble();
                if(po >= 0)
                {
                    System.out.println("converted amount is:" + po*0.78 + " pound");
                }
                else
                {
                    System.out.println("The Dollare money must be positive");
                }
                break;

            
            case 3:
                System.out.println("Enter the Dollare money");
                double euro = as.nextDouble();
                if(euro >= 0)
                {
                    System.out.println("converted amount is:" + euro*0.91 + " euro");
                }
                else
                {
                    System.out.println("The Dollare money must be positive");
                }
                break;

            default:
                break;
        }
        as.close();
    }
}
