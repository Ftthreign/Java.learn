import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guiTest {
    public static void main(String[] args) {

        JFrame application = new JFrame("Aplikasi Sederhana");
        application.setSize(720, 720);
        application.setVisible(true);
        application.setResizable(true);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setLocationRelativeTo(null);
        application.setLayout(null);

        ImageIcon gambar = new ImageIcon("akali1.jpg");

        JLabel judul = new JLabel("APLIKASI VARIASI LOOPING ");
        judul.setBounds(240, 80, 480, 480);
        application.add(judul);
        application.getContentPane().setBackground(Color.PINK);
        judul.setIcon(gambar);
        judul.setHorizontalTextPosition(JLabel.CENTER);
        judul.setVerticalTextPosition(JLabel.TOP);
        judul.setForeground(Color.BLUE);
        judul.setIconTextGap(20);
        judul.setFont(new Font("Comic Sans", Font.ITALIC, 10));

    }
}