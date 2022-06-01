
public class bankAccount{
    public static int accountNumber;
    private static int password;
    boolean activated;
    public bankAccount(int account,int Password){

        accountNumber=account;
        password=Password;

}


    private void setActived(boolean active){

        if (active==true){System.out.println("activated account");}else{{System.out.println("Error :c");}}
        
        this.activated = active;

    }
    public void activeAccount(int Password){
        if(Password==bankAccount.password){

            setActived(true);
        }
        else{
            setActived(false);
        }

    }


    public boolean getActived(){
        return activated;
    }

}