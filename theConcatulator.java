
// theConcatulator concats two input took from user.

// imports
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class theConcatulator {
    
    // main method
    public static void main(String args[]){
        String firstInput;
        String secondInput;

        // read in first input from user
        firstInput = JOptionPane.showInputDialog("Enter First Number");
        
        // read in second input from user
        secondInput = JOptionPane.showInputDialog("Enter Second Number");

        // check if inputed string is negative in number or not 
        // if , then give error message
        
        int fNumber; int sNumber;
        
        fNumber = Integer.parseInt(firstInput);

        sNumber = Integer.parseInt(secondInput);
        
        // checking for negative
        if(fNumber < 0 || sNumber < 0){
           JOptionPane optionPane = new JOptionPane("ErrorMessage" , JOptionPane.ERROR_MESSAGE);
           JDialog dialog = optionPane.createDialog("Failure");
           dialog.setAlwaysOnTop(true);
           dialog.setVisible(true);
           
           // terminate the application
           System.exit(0);
        }
        
        String resultString = "";
        resultString = firstInput + secondInput;

        // display output
        JOptionPane.showMessageDialog(null,"\n\tResult = " + resultString, "theConcatulator", JOptionPane.PLAIN_MESSAGE); 

        System.exit(0); // terminate the application with window

    } // end method main

} // end class theConcatulator

/* author : Rejoan Siddiky */
