package mainWindow.login.createUser;

import javax.swing.*;

public class createUser {
    private JPanel createP;
    private JButton guardarCambiosButton;
    private JTextField crearNombreUsuario;
    private JPasswordField crearContraseñaUsuario;

    public static void main(String[] args) {
        JFrame frame = new JFrame("createUser");
        frame.setContentPane(new createUser().createP);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);

    }
}
