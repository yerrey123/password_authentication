import java.util.Scanner;

public class password {
   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      
      int attempts = 0;
      String userName, passWord;
      String choice;
     
      
      //Introduction
      System.out.print("Welcome to Zoo land: ");
      System.out.println("Please enter your credentials to login to your account!");
      //Ask users to input their username with a requirement
      
      System.out.println("Please enter in your Username: ");
      userName = scan.nextLine();
      
      System.out.println("Enter password: ");
      passWord = scan.nextLine();
     


      
      /* Ideally there's going to be another file that contained all of the saved password and username
      where it'll be able to athenticate it directly from the server. But this is the simplest way. 
           
      */
      
      //This is what the username and password for zookeeper
      
      
      
      if (userName.equals("Zookeeper") && (passWord.equals("zookeeper123"))) {
         System.out.println("Welcome you're logged in as Zookeeper, and as a zookeeper you have all of the animals information");
         
      }
       
      
      //this is the vet user & pass
      else if (userName.equals("Veterinarian") && (passWord.equals("vet12345"))) {
         System.out.println("Welcome you're logged in as Veterinarian, and as a Veterinarian you'll have access to all of the conditions of all animals");
         
         
      }
      // this is the admin user && pass
                
      else if (userName.equals("Admin") && (passWord.equals("Admin0909"))) {
      
         System.out.println("Welcome you're logged in as Administrator, you have all of the administrative power");
        
           
         }
         //prompt the user that this is incorrect
         
      else {
      
          System.out.println("You've entered incorrect credentials, try again! ");
          
            
          attempts++;
          
          if (attempts == 3) {
            System.out.println("Maximum attempt has been reached");
          
          }
          else {
            System.out.println("Enter the correct credentials");
            
          }
 
              
      }
      
         
         // gives the user a choice whether they'd want to exit by yes or no
         
         
         
       
       boolean yn = true;
       while (yn) {
         System.out.println("You've successfully logged in, do you want to log out? (yes or no): ");
         choice = scan.nextLine();
         
         switch (choice) {
            case "yes":
               yn = true;
               break;
               
            case "no":
               yn = false;
               System.out.println("Continue browsing");
               break;
               
            
            default: 
            
               System.out.println("Please enter again ");
               boolean repeat = true;
               
               
               while (repeat) {
                  System.out.println("Do you want to log out? (yes or no): ");
                  
                  choice = scan.nextLine();
                  
                  switch (choice) {
                  case "yes":
                     yn = true;
                     break;
               
                  case "no":
                     yn = false;
                     System.out.println("Continue browsing");
                     break;
            
       
                    }
                                    
               }
         
         }
                System.out.println("You're logged out. Goodbye"); 
                break;

            
             }  

      
         }
 

   }
   
   


