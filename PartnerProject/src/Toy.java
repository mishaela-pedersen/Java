public class Toy {
    public static String greeting;
    private String first_name;
    private String last_name;
    private String toy1;
    private String toy2;
    private double price_toy1;
    private double price_toy2;
    private double tax;
    private double subtotal;
    private double total;

    private static final double TAX = .07;

    //getters
    public String getFirst_name(){
        return first_name;
    }
    public String getLast_name(){
        return last_name;
    }
    public String getToy1(){
        return toy1;
    }
    public double getPrice_toy1(){
        return price_toy1;
    }
    public String getToy2(){
        return toy2;
    }
    public double getPrice_toy2(){
        return price_toy2;
    }

    //setters
    public void setFirst_name(String fn){
        first_name = fn;
    }
    public void setLast_name(String ln){
        last_name = ln;
    }
    public void setToy1(String t1){
        toy1 = t1;
    }
    public void setPrice_toy1(double p1){
        price_toy1 = p1;
    }
    public void setToy2(String t2){
        toy2 = t2;
    }
    public void setPrice_toy2(double p2){
        price_toy2 = p2;
    }



    //constructor
    public Toy(){
        toy1 = "Teddy";
        toy1 = "Nerf";
        toy1 = "Monopoly";
        price_toy1 = 15.75;
        toy2 = "Legos";
        price_toy2 = 12.00;
    }

    public String logo(){
       EmporiumLogo.logo();
       return logo();
    }

    //calculate
    public void calc(){
        subtotal = price_toy1 + price_toy2;
        tax = subtotal + TAX;
        total = (subtotal * TAX) + subtotal;

    }

    //receipt
    public String display(){
        return ( logo() + "\nLast Name: "+ last_name +
                "\nFirst Name: " + first_name +
                "\nTotal Bill: " + total );
    }
}
