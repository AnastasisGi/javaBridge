package pricedisplay;

public class DisplayProductAndPrice {
    public String add(String product, int price) {
        String output = String.format("The price for the %s is %s",product,price);
        return output;
    }
}
