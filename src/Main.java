import javax.swing.*;
import java.awt.*;

public class Main {
    public static void showHello(){
        JFrame frame=new JFrame("hello");
        JLabel label = new JLabel("Hello world");
        frame.add(label, BorderLayout.CENTER);
        //frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void showButton(){
        JFrame frame=new JFrame("hello2");
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.PAGE_AXIS));
        JTextField field = new JTextField();
        JButton button = new JButton("say Hello");
        JLabel label = new JLabel("Hello");
        button.addActionListener(e -> label.setText("Hello "+field.getText()));
        frame.add(field);
        frame.add(button);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
    public static void showCtoF(){
        JFrame frame = new JFrame("prevodnik");
        frame.setLayout(new GridLayout(3,3));
        JTextField field = new JTextField();
        JLabel celsium = new JLabel("°C");
        JButton convert = new JButton("Convert");
        JLabel fahren = new JLabel(" F");
        JButton convertKelvin = new JButton("Convert to K");
        JLabel Kelvin = new JLabel(" K");
        convert.addActionListener(e -> fahren.setText(Convert(field.getText())));
        convertKelvin.addActionListener(e -> fahren.setText(ConvertToK(field.getText())));
        frame.add(field);
        frame.add(celsium);
        frame.add(convert);
        frame.add(fahren);
        frame.add(convertKelvin);
        frame.add(Kelvin);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
    public static String Convert(String c){
        int celsium = Integer.parseInt(c);
        return (celsium*18)+32+" F";
    }
    public static String ConvertToK(String c){
        int celsium = Integer.parseInt(c);
        return (celsium+273.15)+" F";
    }
    public static void main(String[] args) {
        //javax.swing.SwingUtilities.invokeLater(() -> showHello());
        //javax.swing.SwingUtilities.invokeLater(() -> showButton());
        javax.swing.SwingUtilities.invokeLater(() -> showCtoF());

    }
}
