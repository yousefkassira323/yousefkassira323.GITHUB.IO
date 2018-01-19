public class RecommendAccount extends BankAccount {
    private int income; 
    private int balance;
    private String interestRate = "3%";
    private String incomeRange;
    private String maxWithdrawl;
    
    public RecommendAccount(double intRate, long incRange, String maxWith) {
        interestRate = intRate;
        incomeRange = incRange;
        maxWithdrawl = maxWith;

        Scanner keyboard = new Scanner(System.in);
        File user = new File("User.txt");
        PrintWriter outputFile  = new PrintWriter(user); 
        
        System.out.println("Enter A Username: ");
        String name = keyboard.nextLine();
        outputFile.println(username);
        
        System.out.println("Enter A Password: ");
        String pass = keyboard.nextLine(); 
        outputFile.println(password);
                 
        System.out.println("What is your annual income?"); 
        String inc = keyboard.nextInt(); 
        income = Integer.parseInt(inc);
        outputFile.println("Income: " + income);
        
        System.out.println("What is your starting balance?");
        String bal = keyboard.nextInt();
        balance = Integer.parseInt(bal);
        outputFile.println("Starting Balance: " + balance); 

        super(name, pass);

    }

    public String reciept() {
        String str = super.getUsername()
            + "\n Max Widthdrawl amount: " + getMaxWithdrawl()
            + "\n Interest Rate: " + getInterestRate();
    }

    // Edit this method to return the income range (return as string)
    public String getRecommended() {

        if (income >= 5000 && income <= 20000) {
            maxWithdrawl = "1,000";
            interestRate = "1%";
        } else if (income > 20000 && income <= 60000) {
            maxWithdrawl = "10,000";
            interestRate = "3%";
        } else if (income > 60000) {
            maxWithdrawl = "none";
            interestRate = "1%";
        }

        return incomeRange;
    }

    public double getInterestRate(){
        return interestRate;
    }
    public String getIncomeRange(){
        return incomeRange;
    }
    public String getMaxWithdrawl(){
        return maxWithdrawl;
    }
} 