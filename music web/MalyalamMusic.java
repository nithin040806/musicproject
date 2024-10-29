import java.util.Scanner;
class MalayalamMusic
{
    String display()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.King Of Kotha");
        System.out.println("2.Hridayam");
        System.out.println("3.Thallumala");
        System.out.println("4.MajummelBoys");
        System.out.println("5.Back");
        System.out.println("Enter your choice:");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return kingOfKotha();
            }
            else if(c==2)
            {
                return Hridayam();
            }
            else if(c==3)
            {
                return Thallumala();
            }
            else if(c==4)
            {
                return MajummelBoys();
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
    String kingOfKotha()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Kotha Raja");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Kotha-Raja.aifc";
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
            kingOfKotha();
        }
        return " ";
    }
    String Hridayam()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Darshana Hridayam");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Darshana-Hridayam.aifc";
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
            Hridayam();
        }
        return " ";
    }
    String Thallumala()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Manavaalan Thug");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Manavaalan-Thug.aifc";
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
            Thallumala();
        }
        return " ";
    }
    String MajummelBoys()
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("1.Kuthanthram");
        System.out.println("2.Back");
        int c=0;
        try{
            c=sc.nextInt();
            if(c==1)
            {
                return "Kuthanthram.aifc";
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
            MajummelBoys();
        }
        return " ";
    }
}