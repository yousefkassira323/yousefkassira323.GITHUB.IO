public abstract class BankAccount 
{
    private String username; 
    private String password; 
    private String account; 
    
    public BankAccount(String name, String pass)
    {
        username = name;
        password = pass;         
        
        getRecommended();       
        toString(); 
    }
     
    public String toString()
    {
        // Create a string describing the stock.
        String str = "Username: " + username
            + "\nPassword: " + password;

        // Return string
        return str;
    }

    public String getUsername() {
        return username;
    }
    
    public abstract String getRecommended();
} 