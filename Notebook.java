public class Notebook {
    
    int OZY;
    int HDcapacity;
    String op;
    String colour;
    
    public Notebook(int OZY, int HDcapacity,String op, String colour) {
        this.OZY = OZY;
        this.HDcapacity = HDcapacity;
        this.op = op;
        this.colour = colour;
    }

    @Override
    public String toString() {
        
        return String.format(" OZY: %s\n HDcapacity: %s\n op: %s\n colour: %s",
                           this.OZY, this.HDcapacity, this.op, this.colour);
    }

    
    

    


}