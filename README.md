# password_authentication
Creating java authentication using individuals credentials.

First category pseudocode: 

GET a computer
Open the Zookeeper website
Prompt user to enter credentials
WHILE the user authenticate their information do the following
IF user name and password is correct 
Print out “authentication correct” 
ELSE 
Lock their account until Admin restart the password credentials

Username, password, and converting password to MD5. 

//enables the user to input any information
Scanner scan = new Scanner(System.in);

//Create a string for username

String userName; 

//create another variable for the attempts

Int attempts = 0;

/*Create a while loop because we’re unsure of the outcome that the user will input. For loop is knowing when you want the loop to end */

While {}

//Prompt the user to input their username by using System.out.println

System.out.println(“Enter user name: ”);

//here I’d be using the .nextLine because this is where the user would enter in their information.
// Same goes with the password using the .nextLine, along with “String”

// this is where the MD5 code that was given to us will go. 

Second Category pseudocode:

Once the user have inputted their correct information it’ll greet them with their correct contents that’s displayed. 

IF the credentials is correct under certain amount of tries
THEN it’ll be greeted with correct content
ELSE 
It’ll exit the user until Admin reinstate their credentials

This is where I think a Boolean would come in handy trying to figure out if  whether a login is successful or not. 
Boolean variable = false;

I think then the next step is the IF and ELSE statement
IF the username and password is the same then the second line will execute the Boolean = true;
IF the user inputted the incorrect password after 3 attempts 
Print out you’ve been blocked until Admin reinstate your credentials
ELSE continue to try inputting the correct information

If (credentials is successful) 
System.out.printn(“do you want to exit? Please input Yes or no?);
If user == ‘yes’ 
Print out you’re log out
Else 
Boolean is false;


Third Category Pseudocode: 

IF the login is successful it’ll prompt the user if they’d want to log out or not. This can be done by using IF and ELSE statement again.

IF credentials is successful
Print out (prompting user to log out by inputting the keyword yes or no);
IF the user clicked YES, Then it’ll print out you’re loged out. 
ELSE then they won’t be logged out. 

If (attempts == 3) 
System.out.println(“You’ve been blocked until Admin reinstate your credentials”);
Break;
Else 
System.out.println(“Enter the correct credentials”);
