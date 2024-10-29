
import java.util.Scanner;

class TeluguMusic
{
    String display()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Devara");
        System.out.println("2.Saripodha Sanivaram");
        System.out.println("3.Om Beem Bush");
        System.out.println("4.Pushpa 2");
        System.out.println("5.Back");
        System.out.println("Enter your choice:");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return Devara();
            }
            else if(c==2)
            {
                return SaripodhaSanivaram();
            }
            else if(c==3)
            {
                return OmBeemBush();
            }
            else if(c==4)
            {
                return Pushpa();
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
    String Devara()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.AyudhaPooja");
        System.out.println("2.Chuttamalle");
        System.out.println("3.FearSong");
        System.out.println("4.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "AyudhaPooja.aifc";
            }
            else if(c==2)
            {
                return "Chuttamalle.aifc";
            }
            else if(c==3)
            {
                return "FearSong.aifc";
            }
            else if(c==4)
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
            Devara();
        }
        return " ";
    }
    String SaripodhaSanivaram()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Garam Garam");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Garam-Garam.aifc";
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
            SaripodhaSanivaram();
        }
        return " ";
    }
    String OmBeemBush()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Anuvanuvuu");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Anuvanuvuu.aifc";
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
            OmBeemBush();
        }
        return " ";
    }
    String Pushpa()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Pushpa-Pushpa");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Pushpa-Pushpa.aifc";
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
            Pushpa();
        }
        return " ";
    }
}