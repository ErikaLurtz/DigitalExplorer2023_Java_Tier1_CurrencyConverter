import javax.swing.*;

public class Ep01Runner {
    public static void main(String[] args) {
        Ep01Function f = new Ep01Function();
        Object[] option1 = {"EUR", "JPY", "GBP", "CNY", "AUD", "BTC", "Quit"};
        Object[] option2 = {"Try Again", "Quit"};

        while(true){
            String input = JOptionPane.showInputDialog(null, "Enter value to convert from USD: ");
            System.out.println(input);

            if(f.check(input) == true){
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Choose which currency you wish to convert the " + input + " USD",
                        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        option1, option1[2]);

                if(choice1 == 0) {
                    f.dollarToEUR(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else if (choice1 == 1) {
                    f.dollarToJPY(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else if (choice1 == 2) {
                    f.dollarToGBP(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else if (choice1 == 3) {
                    f.dollarToCNY(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else if (choice1 == 4) {
                    f.dollarToAUD(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else if (choice1 == 5) {
                    f.dollarToBTC(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                    if(choice2 == 0){
                    } else { break;}

                } else { break;}

            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid output");

                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);

                if(choice2 == 0){
                } else { break;}
            }
        }
    }
}
