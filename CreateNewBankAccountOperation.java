package bankapplication;

import java.util.regex.Pattern;

import static java.lang.System.exit;

public class CreateNewBankAccountOperation implements BankingOperation_q {

    void CreateNewBankAccount() // To creating new user bank account
    {
        UserDetails userdetails=new UserDetails();
        System.out.println("---------------Enter Your Detail's------------------");
        flag=true; // Validating First Name
        while(flag)
        {
            try
            {
                System.out.println("Enter your first Name :");
                String firstname=input.next();
                if(Pattern.matches("[A-Za-z]*",firstname))
                {
                    userdetails.setFirstname(firstname);
                    flag=false;
                }
                else
                {
                    flag=true;
                    throw new InvalidFirstNameException("Please provide the correct First Name.\n");
                }
            }
            catch(InvalidFirstNameException e)
            {
                System.out.println("You're Entering the Invaild First Name.\n"+e);
            }
        }
        flag=true; // Validating Last Name
        while(flag)
        {
            try
            {
                System.out.println("Enter your Last Name :");
                String lastname=input.next();
                if(Pattern.matches("[A-Za-z]*",lastname))
                {
                    userdetails.setLastname(lastname);
                    flag=false;
                }
                else
                {
                    flag=true;
                    throw new InvalidLastNameException("Please provide the correct Last Name.\n");
                }
            }
            catch(InvalidLastNameException e)
            {
                System.out.println("You're Entering the Invaild Last Name.\n"+e);
            }
        }
        flag=true; // Validating Aadhar Number
        while(flag)
        {
            try
            {
                String AadharRegex = "^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$";
                System.out.println("Enter your Aadhar Number :");
                String Aadharnumber=input.next();
                if(Aadharnumber.matches(AadharRegex))
                {
                    userdetails.setAadharnumber(Aadharnumber);
                    flag=false;
                }
                else
                {
                    flag=true;
                    throw new InvalidAadharException("Please provide the correct Aadhar Number.\n");
                }
            }
            catch(InvalidAadharException e)
            {
                System.out.println("You're Entering the Invaild Aadhar Number.\n"+e);
            }
        }
        flag=true;  // Validating Age
        while(flag)
        {
            System.out.println("Enter your Age :");
            int age=input.nextInt();
            try
            {
                if(age>=18)
                {
                    userdetails.setAge(age);
                    flag=false;
                }
                else if((age>=1) && (age<=17))
                {
                    System.out.println("You're in under 18, so not eligible to create Bank Account. please Contact You're nearest branch.\n************ Thank you for using our service! Have a GREAT DAY **************");
                    exit(0);
                }
                else
                {
                    flag=true;
                    throw new InvalidAgeException("Please provide the correct age.\n");
                }
            }
            catch(InvalidAgeException e)
            {
                System.out.println("You're Entering the Invaild age.\n"+e);
            }
        }
        flag=true; // Validating Mobile Number
        while(flag)
        {
            try
            {
                String MobileNumberregex = "[6-9]{1}[0-9]{9}"; //(0/91)?
                System.out.println("Enter your Mobile Number :");
                String mobilenumber=input.next();
                if(mobilenumber.length()==10 && mobilenumber.matches(MobileNumberregex))
                {
                    userdetails.setMobilenumber(mobilenumber);
                    flag=false;
                }
                else
                {
                    flag=true;
                    throw new InvalidMobileNumberException("Please provide the correct Mobile Number.\n");
                }
            }
            catch(InvalidMobileNumberException e)
            {
                System.out.println("You're Entering the Invaild MoblieNumber.\n"+e);
            }
        }
        //System.out.println("For new account opening, Please deposite the Minimum Balance Amount 1000 in your account:");
        userdetails.setBalanceamount(0);
        userdetails.setAccountnumber();
        UserDetailSet.add(userdetails);
        System.out.println(".....................Your's New Bank account was successfully created......................");
        System.out.println("Your Account Number is : "+userdetails.getAccountnumber());
        System.out.println("Your Account Balance is : "+userdetails.getBalanceamount());
        System.out.println("Your Account Balance is very low, So please depoite money for further transaction's.\n");
    }
}
