import javax.swing.*;

public class Ep01Function {

    public boolean check(String Minput){
        try{
            double x = Double.parseDouble(Minput);
            if(x >= 0 || x < 0);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public void dollarToEUR(double Minput) {
        double eur = Minput * 0.92;
        JOptionPane.showMessageDialog(null, "Amount in EUR: " +eur+" euro");
    }
    public void dollarToJPY(double Minput) {
        double jpy = Minput * 130.08;
        JOptionPane.showMessageDialog(null, "Amount in JPY: " +jpy+" yen");
    }
    public void dollarToGBP(double Minput) {
        double gbp = Minput * 0.81;
        JOptionPane.showMessageDialog(null, "Amount in GBP: " +gbp+" sterling");
    }
    public void dollarToCNY(double Minput) {
        double cny = Minput * 6.75;
        JOptionPane.showMessageDialog(null, "Amount in CNY: " +cny+" yuan");
    }
    public void dollarToAUD(double Minput) {
        double aud = Minput * 1.42;
        JOptionPane.showMessageDialog(null, "Amount in AUD: " +aud+" australian dollar");
    }
    public void dollarToBTC(double Minput) {
        double btc = Minput * 0.000043;
        JOptionPane.showMessageDialog(null, "Amount in BTC: " +btc+" bitcoin");
    }

}
