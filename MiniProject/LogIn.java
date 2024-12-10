import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogIn {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> Name = new ArrayList<String>();
    static ArrayList<String> Email = new ArrayList<String>();
    static ArrayList<String> Password = new ArrayList<String>();

    public static void main(String args[]) {
        while (true) {
            System.out.println("\n1 -> Sign Up\n2 -> Log In\n3 -> Exit");
            System.out.print("Enter Your Choice : ");
            int N = sc.nextInt();
            sc.nextLine();
            if (N == 1) {
                SignUp();
            } else if (N == 2) {
                LogIn();
            } else if (N == 3) {
                break;
            } else {
                System.out.print("Invalid Choice");
            }
        }
    }

    public static void LogIn() {
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        System.out.println("|\t\t\t\t\t\t   LOG IN\t\t\t\t\t\t\t\t\t\t|");
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        String User;
        while (true) {
            System.out.print("Enter UserName : ");
            String userName = sc.nextLine();
            if (!checkName(userName)) {
                System.out.println("Invalid Username");
            } else {
                User = userName;
                break;
            }
        }
        while(true)
        {
            System.out.print("Enter password : ");
            String passKey = sc.nextLine();
            if(!checkPassword(passKey)){
                System.out.println("Invalid Password");
            }else{
                break;
            }
        }
        int count = 0;
        boolean flag = true;
        for (String nVal : Name) {
            if (nVal.equals(User)) {
                flag = false;
                welcomeUser(User, count);
            }
            count++;
        }
        if (flag) {
            System.out.print("Invalid Username or Password!");
            return;
        }
    }

    public static void welcomeUser(String name, int ind) {
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        System.out.println("|\t\t\t\t\t\t   Welcome " + name + "\t\t\t\t\t\t\t\t\t\t|");
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        System.out.println("User Name : " + name);
        System.out.println("Email Address : " + Email.get(ind));
        System.out.println();
        for (int i = 0; i < 133; i++) {
            System.out.print("-");
        }
        while (true) {
            System.out.println("\n1 -> Sign Out\n2 -> Exit");
            System.out.print("Enter Your Choice :");
            int choice = sc.nextInt();
            if (choice == 1) {
                break;
            } else if (choice == 2) {
                return;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void SignUp() {
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        System.out.println("|\t\t\t\t\t\t   SIGN UP\t\t\t\t\t\t\t\t\t\t|");
        for (int i = 0; i < 133; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
        boolean nameFlag = false, emailFlag = false, passwordFlag = false;
        String name, email, password;

        while (true) {
            System.out.print("Enter Your Name : ");
            name = sc.nextLine();
            boolean cName = checkName(name);
            // System.out.println(cName);
            if (cName) {
                nameFlag = true;
                // Name.add(name);
                break;
            } else {
                System.out.println("Invalid User Name! Try another User Name ?");
            }
        }

        while (true) {
            System.out.print("Enter Your Email Address : ");
            email = sc.nextLine();
            /*char Em[] = email.toCharArray();
            boolean spre = false, dot = false;
            for (int i = 0; i < Em.length; i++) {
                if (Character.isUpperCase(Em[i])) {
                    System.out.println("Email should be in lower Case Only ! ");
                    // continue;
                } else if (Em[i] == '.') {
                    dot = true;
                } else if (!Character.isLetterOrDigit(Em[i])) {
                    spre = true;
                }
            }
            if (!spre) {
                System.out.println("Email Address must Contains '@'");
                // continue;
            }
            if (!dot) {
                System.out.println("Email Address must contain '.'");
                // continue;
            }
            if (spre && dot) {
                emailFlag = true;
                break;
            }*/
            String regex="[a-z][a-zA-Z0-9_\\-\\.]+[@][a-z]+[\\.][a-z]{2,3}";
            Pattern pat=Pattern.compile(regex);
            Matcher mat=pat.matcher(email);
            //emailFlag=Pattern.matches(regex,email);
            emailFlag=mat.matches();
            if(emailFlag)
            {
                break;
            }
        }
        // Email.add(email);

        while (true) {
            System.out.print("Enter Your Password : ");
            password = sc.nextLine();
            char pass[] = password.toCharArray();
            boolean lf = false, uf = false, lenf = false, df = false, sf = false;
            if (pass.length >= 8) {
                lenf = true;
            }
            for (int i = 0; i < pass.length; i++) {
                if (Character.isUpperCase(pass[i])) {
                    uf = true;
                } else if (Character.isLowerCase(pass[i])) {
                    lf = true;
                } else if (Character.isDigit(pass[i])) {
                    df = true;
                } else if (!Character.isAlphabetic(pass[i])) {
                    sf = true;
                }
            }
            if (!(lenf && uf && lf && df && sf)) {
                System.out.println(
                        "Invalid Password!\n* Password must have 8 characters\n* atleast one lower and upper case letter\n* must have atleast one digit");
            } else {
                passwordFlag = true;
                break;
            }
        }

        if (nameFlag && emailFlag && passwordFlag) {
            System.out.println("Your Account Created Successfully :)");
            Name.add(name);
            Email.add(email);
            Password.add(password);
        }

    }

    public static boolean checkName(String name) {
        for (String nVal : Name) {
            if (nVal.equals(name)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public static boolean checkPassword(String password) {
        for (String nPass : Password) {
            if (nPass.equals(password)) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
