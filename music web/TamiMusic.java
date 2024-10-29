import java.util.Scanner;
class TamilMusic
{
    String display()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.jailer");
        System.out.println("2.Vikram");
        System.out.println("3.Vettayan");
        System.out.println("4.Leo");
        System.out.println("5.Back");
        System.out.println("Enter your choice:");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return jailer();
            }
            else if(c==2)
            {
                return vikram();
            }
            else if(c==3)
            {
                return vettayan();
            }
            else if(c==4)
            {
                return leo();
            }
            else if(c==5)
            {
                return " ";
            }
           else{
                System.out.println("Invalid input");
                display();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter numbers only");
            display();
        }
        return " ";
    }
    String jailer()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Hukum");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Hukum.aifc";
            }
            else if(c==2)
            {
                return display();
            }
           else{
                System.out.println("Invalid input");
                display();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter numbers only");
            jailer();
        }
        return " ";
    }
    String vikram()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Vikram Title Track");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Vikram-Title-Track.aifc";
            }
            else if(c==2)
            {
                return display();
            }
           else{
                System.out.println("Invalid input");
                vikram();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter numbers only");
            vikram();
        }
        return " ";
    }
    String vettayan()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Hunter Vantaar");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Hunter-Vantaar.aifc";
            }
            else if(c==2)
            {
                return display();
            }
           else{
                System.out.println("Invalid input");
                display();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter numbers only");
            vettayan();
        }
        return " ";
    }
    String leo()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Ordinary Person");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Ordinary-Person.aifc";
            }
            else if(c==2)
            {
                return display();
            }
           else{
                System.out.println("Invalid input");
                display();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter numbers only");
            leo();
        }
        return " ";
    }
}