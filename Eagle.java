public class Eagle extends Bird {  

    private boolean flying;

    public Eagle(String name) {  
        super(name);  
        this.flying = false;  
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public String toString() {
        return "Eagle{name='" + getName() + "'}";
    }

    public boolean isFlying() {  
        return flying;  
    }  

    public void setFlying(boolean flying) {  
        this.flying = flying;  
    }  

    public static void main(String[] args) { 
        Eagle eagle = new Eagle("Royal Eagle");
        System.out.println(eagle);
    }
}