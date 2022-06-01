public class Car extends transportation {
    
    private int fine;
    private String model;
    public String engine_displacement;
    public Car(String Mark,String Modelo, String Plate, String owner ,String displaymen){
        this.mark=Mark;
        this.model=Modelo;
        this.plate=Plate;
        this.propietor=owner;
        this.engine_displacement=displaymen;

 
    }

    public void addfine(int value){
        
        this.fine= 100000+(value);

    }

    public int getfine(){
        return fine;
    }


    public String showmodel(){
        return model;

    }
}
