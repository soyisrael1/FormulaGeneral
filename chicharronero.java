package CHICHARRONERO;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class chicharronero {

    private JFrame frmLaChicarronera;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JLabel lblX1;
    private JLabel lblX2;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    chicharronero window = new chicharronero();
                    window.frmLaChicarronera.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public chicharronero() {
        initialize();
    }

    private void initialize() {
        frmLaChicarronera = new JFrame();
        frmLaChicarronera.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\examen\\geo.jpg"));
        frmLaChicarronera.setTitle("LA CHICHARRONERA :)");
        frmLaChicarronera.setBounds(100, 100, 577, 327);
        frmLaChicarronera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmLaChicarronera.setLocationRelativeTo(null);
        frmLaChicarronera.getContentPane().setLayout(null);

       
        JLabel lblNewLabel = new JLabel("A:");
        lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel.setBounds(29, 38, 25, 14);
        frmLaChicarronera.getContentPane().add(lblNewLabel);

        JLabel lblB = new JLabel("B:");
        lblB.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        lblB.setBounds(29, 63, 37, 24);
        frmLaChicarronera.getContentPane().add(lblB);

        JLabel lblNewLabel_1_1 = new JLabel("C:");
        lblNewLabel_1_1.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_1_1.setBounds(29, 89, 37, 27);
        frmLaChicarronera.getContentPane().add(lblNewLabel_1_1);

        txtA = new JTextField();
        txtA.setBounds(68, 32, 194, 20);
        frmLaChicarronera.getContentPane().add(txtA);
        txtA.setColumns(10);

        txtB = new JTextField();
        txtB.setColumns(10);
        txtB.setBounds(68, 62, 194, 20);
        frmLaChicarronera.getContentPane().add(txtB);

        txtC = new JTextField();
        txtC.setColumns(10);
        txtC.setBounds(68, 89, 194, 20);
        frmLaChicarronera.getContentPane().add(txtC);

        
        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        btnCalcular.setBounds(21, 118, 128, 33);
        frmLaChicarronera.getContentPane().add(btnCalcular);
        btnCalcular.addActionListener(e -> {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            double discriminante = b * b - 4 * a * c;

            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                lblX1.setText("x1: " + x1);
                lblX2.setText("x2: " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);

                lblX1.setText("x1 = x2: " + x);
                lblX2.setText("");
            } else {
                lblX1.setText("Esta ecuacion no tiene solucion");
                lblX2.setText("");
            }
        });

      
        JButton btnBorrar = new JButton("BORRAR");
        btnBorrar.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        btnBorrar.setBounds(170, 120, 117, 31);
        frmLaChicarronera.getContentPane().add(btnBorrar);
        btnBorrar.addActionListener(e -> {
            txtA.setText("");
            txtB.setText("");
            txtC.setText("");
            lblX1.setText("x1:");
            lblX2.setText("x2:");
        });

        lblX1 = new JLabel("x1:");
        lblX1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
        lblX1.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        lblX1.setBounds(24, 161, 263, 42);
        frmLaChicarronera.getContentPane().add(lblX1);

        lblX2 = new JLabel("x2:");
        lblX2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
        lblX2.setFont(new Font("Yu Mincho", Font.BOLD | Font.ITALIC, 14));
        lblX2.setBounds(24, 214, 263, 42);
        frmLaChicarronera.getContentPane().add(lblX2);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\examen\\ji.jpg"));
        lblNewLabel_1.setBounds(335, 38, 179, 185);
        frmLaChicarronera.getContentPane().add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
        lblNewLabel_2.setBounds(0, 0, 561, 288);
        frmLaChicarronera.getContentPane().add(lblNewLabel_2);
    }
}
