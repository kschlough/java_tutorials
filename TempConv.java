// import java.util.Scanner;

// public class TempConv {
//     public static void main(String[] args) {
//         double fahr;
//         double cel;
//         Scanner in;

//         in = new Scanner(System.in);
//         System.out.println("Enter the temperature in F: ");
//         fahr = in.nextDouble();

//         cel = (fahr - 32) * 5.0/9.0;
//         System.out.println("The temperature in C is: " + cel);
//     }
// }

// option 2 with dialogue box
import javax.swing.*;

public class TempConv {
    public static void main(String[] args) {
        String fahrString;
        double fahr, cel;

        fahrString = JOptionPane.showInputDialog("Enter the temperature in F");
        fahr = Double.parseDouble(fahrString);
        cel = (fahr - 32) * 5.0/9.0;

        JOptionPane.showMessageDialog(null, "The temperature in C is, " + cel);


    }
}