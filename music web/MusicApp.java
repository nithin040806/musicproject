import java.util.Scanner;

class MusicApp
{
    public static void  main(String[] args)  
    { 
        TeluguMusic s=new TeluguMusic();
        TamilMusic m=new TamilMusic();
        MalayalamMusic ma=new MalayalamMusic();
        Scanner sc = new Scanner(System.in); 
        try
        { 
            
            while(true)
            {

                System.out.println("1.TeluguMusic");
                System.out.println("2.TamilMusic");
                System.out.println("3.MalayalamMusic");
                System.out.println("4.exit");
                int ch;
                try{
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        String sb=s.display();
                        if(sb.equals(" "))
                        {
                            String[] abc={"a","b"};
                            main(abc);
                        }
                        SimpleAudioPlayer.filePath = "C:\\Users\\User\\Desktop\\javapack\\Music\\"+sb;
                        SimpleAudioPlayer audioPlayer =  
                            new SimpleAudioPlayer(); 
              
                        audioPlayer.play(); 
                        
                        
                        while (true) 
                        { 
                            System.out.println("1. pause"); 
                            System.out.println("2. resume"); 
                            System.out.println("3. restart"); 
                            System.out.println("4. stop"); 
                            System.out.println("5. Jump to specific time"); 
                            int c = sc.nextInt(); 
                            audioPlayer.gotoChoice(c); 
                            if (c == 4) 
                            {
                                break;
                            }
                             
                        } 

                    }
                    else if(ch==2)
                    {
                        String sb=m.display();
                        if(sb.equals(" "))
                        {
                            String[] abc={"a","b"};
                            main(abc);
                        }
                        SimpleAudioPlayer.filePath = "C:\\Users\\User\\Desktop\\javapack\\Music\\"+sb;
                        SimpleAudioPlayer audioPlayer =  
                            new SimpleAudioPlayer(); 
              
                        audioPlayer.play(); 
                        
                        
                        while (true) 
                        { 
                            System.out.println("1. pause"); 
                            System.out.println("2. resume"); 
                            System.out.println("3. restart"); 
                            System.out.println("4. stop"); 
                            System.out.println("5. Jump to specific time"); 
                            int c = sc.nextInt(); 
                            audioPlayer.gotoChoice(c); 
                            if (c == 4) 
                            {
                                break;
                            }
                             
                        } 
                    }
                    else if(ch==3)
                    {
                        String sb=ma.display();
                        if(sb.equals(" "))
                        {
                            String[] abc={"a","b"};
                            main(abc);
                        }
                        SimpleAudioPlayer.filePath = "C:\\Users\\User\\Desktop\\javapack\\Music\\"+sb;
                        SimpleAudioPlayer audioPlayer =  
                            new SimpleAudioPlayer(); 
              
                        audioPlayer.play(); 
                        
                        
                        while (true) 
                        { 
                            System.out.println("1. pause"); 
                            System.out.println("2. resume"); 
                            System.out.println("3. restart"); 
                            System.out.println("4. stop"); 
                            System.out.println("5. Jump to specific time"); 
                            int c = sc.nextInt(); 
                            audioPlayer.gotoChoice(c); 
                            if (c == 4) 
                            {
                                break;
                            }
                             
                        } 
                    }
                    else if(ch==4)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid input");
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Enter numbers only");
                }
            }
            
             
            
            sc.close(); 
        }  
          
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          } 
        
    } 
}