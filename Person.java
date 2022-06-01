
import java.util.Date;

public class Person{
    private static String name;
    private static String lastname_1;
    private static String lastname_2;
    private static Date Date_birth;
    private static float height;
    private static int id;

public Person(String NAME, String Lastname1,String Lastname2,Date Birth,float Height){

id=id+10000000;
name=NAME;
lastname_1=Lastname1;
lastname_2=Lastname2;
Date_birth=Birth;
height=Height;


}

public String getName(){
    return name;
}
public void getinfo(){
    System.out.println("-----------------------------------------------------------");
    System.out.println("name: " + Person.name +"lastnames: " + Person.lastname_1+Person.lastname_2 + "\nID:  " + Person.id +"\nDate birth:  "+Person.Date_birth );
    System.out.println("-----------------------------------------------------------");
}

/*public Date Birthday(){

    return Date_birth;
}*/

}