
import java.util.ArrayList;
import java.util.Date;

public class main{

    public static void main(String[] args) {

        bankAccount account1= new bankAccount(1131456, 123456789);
        account1.activeAccount(123456789);

        Car coche =new Car("toyota", "2017", "254ASC", "carlos jimenes", "2M");
        coche.showPlate();

        Cellphone c1= new Cellphone("LG", "Black", 31025421, "juan lopez");
        c1.callNumber("juan lopez");

        fruit f1=new fruit();
        //f1.colors.add("RED");
        System.out.println(f1.Getcolor());

        motorcycle mot1=new motorcycle("Ninja", "2015", "COZ 93D", "Guzman");
        System.out.println(mot1.showPlate());
        
        Date fecha2 = new Date(2001,01,01,12,0,0);
        Person P1=new Person("marco", "parra", "jimenez", fecha2 ,82);
        P1.getinfo();

        
        

        
    }

}