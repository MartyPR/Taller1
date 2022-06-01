public abstract  class transportation {
    protected String mark;
    
    protected String propietor;
    protected int id; //owner id
    public String color;
    protected String plate;

public abstract void addfine(int value);
public abstract int getfine();

public String showPlate(){
    System.out.println("plate:"+plate);
    return plate;

}
}
