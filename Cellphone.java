public class Cellphone {
    public String mark,color;
    private static int number;
    public static String owner;

    
    public  Cellphone(String type ,String color, int numberC, String proprietor){
        this.mark = type;
        this.color = color;
        number=numberC;
        owner=proprietor;
    }


    private int numberP(){
        return number;
    }

    public void callNumber(String proprietor){
        if (proprietor == Cellphone.owner){
            System.out.println("-----------------------------------------------------------");
            System.out.println("Nombre: " + Cellphone.owner + "\nnumber:  " + numberP() );
            System.out.println("-----------------------------------------------------------");
        }else{
            System.out.println("no found");

    }
    }


}
