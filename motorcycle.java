public class motorcycle extends transportation{
    private int fine;
    private String model;
    public motorcycle(String Mark,String Modelo, String Plate, String owner){
        this.mark=Mark;
        this.model=Modelo;
        this.plate=Plate;
        this.propietor=owner;
         
    }

    public void addfine(int value){
        
        this.fine= 70000+(value);

    }

    public int getfine(){
        return fine;
    }

    public String showmodel(){
        
        return model;

    }
}
