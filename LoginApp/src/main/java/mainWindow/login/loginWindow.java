package mainWindow.login;

import javax.swing.*;

public class loginWindow extends JFrame{
    private JTextField loginUsuario;
    private JPasswordField loginContraseña;
    private JButton logInButton;
    private JButton newUserButton;
    private JPanel principalP;

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginWindow");
        frame.setContentPane(new loginWindow().principalP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
