package tombola;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class TombolaPanel extends JFrame implements ActionListener {

    Font lexend, lexend1;
    JPanel pnlLogo;
    JLabel lblTitolo = new JLabel("il gioco della");
    JLabel lblTitolo1 = new JLabel("TOMBOLA");
    GridBagConstraints gbcLo;
    JLabel lblUsername = new JLabel("Username: ");
    JTextField txtUsername = new JTextField(20);
    JButton btnGioca = new JButton("Gioca");
    

    public TombolaPanel() throws FontFormatException, IOException {
        setTitle("Il gioco della Tombola");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlLogo = new JPanel() {
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                GradientPaint gp = new GradientPaint(0, 0,
                        getBackground().brighter().brighter(), 0, getHeight(),
                        getBackground().darker().darker());
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());

            }
        };
        add(pnlLogo);
        pnlLogo.setLayout(new GridBagLayout());

        gbcLo = new GridBagConstraints();
        grafica(pnlLogo, gbcLo, 1);

        pnlLogo.setBackground(new Color(239, 35, 60));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGioca) {
            /*pnlLogo.setVisible(false);
            getContentPane().removeAll();
            gbcGr = new GridBagConstraints();

            grafica(pnlGui, gbcGr, 2);
            invalidate();
            repaint();

            pnlGui.setVisible(true);
            add(pnlGui);*/
        }
    }

    private void grafica(JPanel p, GridBagConstraints gbc1, int n) {
        try {
            lexend = Font.createFont(Font.TRUETYPE_FONT, new File(".\\Font\\LexendDeca-VariableFont_wght.ttf")).deriveFont(60f);
            GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(".\\Font\\LexendDeca-VariableFont_wght.ttf")));

            lexend1 = Font.createFont(Font.TRUETYPE_FONT, new File(".\\Font\\LexendDeca-VariableFont_wght.ttf")).deriveFont(20f);
            GraphicsEnvironment g1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
            g.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(".\\Font\\LexendDeca-VariableFont_wght.ttf")));

        } catch (IOException | FontFormatException ex) {

        }
        if (n == 1) {
            gbc1.gridx = 1;
            gbc1.gridy = 0;
            gbc1.insets = new Insets(-180, -80, 40, 30);
            gbc1.anchor = GridBagConstraints.CENTER;
            lblTitolo.setFont(lexend1);
            lblTitolo.setForeground(new Color(237, 242, 244));
            p.add(lblTitolo, gbc1);

            gbc1.gridy++;
            gbc1.insets = new Insets(-100, -80, 60, 30);
            lblTitolo1.setFont(lexend);
            lblTitolo1.setForeground(new Color(237, 242, 244));
            p.add(lblTitolo1, gbc1);

            gbc1.gridx = 0;
            gbc1.gridy++;
            gbc1.insets = new Insets(40, 5, 0, 5);
            gbc1.anchor = GridBagConstraints.WEST;
            lblUsername.setFont(lexend1);
            lblUsername.setForeground(new Color(237, 242, 244));
            p.add(lblUsername, gbc1);

            gbc1.gridx = 1;
            gbc1.anchor = GridBagConstraints.CENTER;
            txtUsername.setFont(lexend1);
            txtUsername.setForeground(new Color(237, 242, 244));
            p.add(txtUsername, gbc1);

            gbc1.gridx = 1;
            gbc1.gridy = 3;
            gbc1.ipadx = 30;
            gbc1.ipady = 15;
            gbc1.insets = new Insets(140, -80, -70, 30);
            gbc1.anchor = GridBagConstraints.CENTER;
            btnGioca.setFont(lexend1);
            btnGioca.setBackground(new Color(237, 242, 244));
            btnGioca.setForeground(new Color(217, 4, 41));
            p.add(btnGioca, gbc1);
        }
        /*else if (n == 2) {
            p.setVisible(true);
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.insets = new Insets(5, 25, 15, 3);
            gbc1.ipadx = 0;
            gbc1.anchor = GridBagConstraints.LINE_START;
            lblPath.setFont(poppins);
            p.add(lblPath, gbc1);

            gbc1.gridx++;
            gbc1.ipadx = 300;
            gbc1.anchor = GridBagConstraints.CENTER;
            gbc1.insets = new Insets(5, 3, 15, 5);
            txtPath.setFont(poppins);
            txtPath.setEditable(false);
            txtPath.setToolTipText("Percorso della directory selezionata");
            p.add(txtPath, gbc1);

            gbc1.gridx++;
            gbc1.ipadx = 0;
            gbc1.anchor = GridBagConstraints.LINE_END;
            btnSfoglia.setFont(poppins);
            btnSfoglia.setToolTipText("Selezionare la directory desiderata");
            p.add(btnSfoglia, gbc1);

            gbc1.gridx = 0;
            gbc1.gridy = 1;
            gbc1.ipadx = 0;
            gbc1.anchor = GridBagConstraints.LINE_START;
            gbc1.insets = new Insets(5, 25, 15, 0);
            lblFiltro.setFont(poppins);
            p.add(lblFiltro, gbc1);

            gbc1.gridx++;
            gbc1.ipadx = 300;
            gbc1.anchor = GridBagConstraints.LINE_END;
            gbc1.insets = new Insets(5, 0, 15, 3);
            txtFiltro.setFont(poppins);
            txtFiltro.setToolTipText("Inserire il prefisso dei file desiderati");
            p.add(txtFiltro, gbc1);

            gbc1.gridx = 0;
            gbc1.gridy = 2;
            gbc1.ipadx = 10;
            gbc1.insets = new Insets(110, 100, -15, -100);
            gbc1.anchor = GridBagConstraints.LAST_LINE_START;
            btnConferma.setFont(poppins);
            btnConferma.setToolTipText("Avvia il calcolo");
            p.add(btnConferma, gbc1);

            gbc1.gridx++;
            gbc1.insets = new Insets(110, 5, -15, 5);
            gbc1.anchor = GridBagConstraints.CENTER;
            btnGrafico.setFont(poppins);
            btnGrafico.setEnabled(false);
            p.add(btnGrafico, gbc1);

            gbc1.gridx++;
            gbc1.ipadx = 10;
            gbc1.insets = new Insets(110, -100, -15, 100);
            gbc1.anchor = GridBagConstraints.LAST_LINE_START;
            btnEsci.setFont(poppins);
            btnEsci.setToolTipText("Chiude il programma");
            p.add(btnEsci, gbc1);

            UIManager.put("ToolTip.background", Color.BITMASK);
            UIManager.put("ToolTip.foreground", Color.cyan);
            UIManager.put("ToolTip.font", poppins);

        } else if (n == 3) {

            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.insets = new Insets(-180, 0, 150, 0);
            gbc1.anchor = GridBagConstraints.PAGE_START;
            lblPie.setFont(poppinsMedium);
            p.add(lblPie, gbc1);

            gbc1.gridy = 0;
            gbc1.gridy++;
            gbc1.ipadx = 0;
            gbc1.ipady = 0;
            gbc1.anchor = GridBagConstraints.CENTER;
            gbc1.insets = new Insets(10, 0, -250, 0);

            btnIndietro.setFont(poppins);
            p.add(btnIndietro, gbc1);

        } else if (n == 4) {
            gbc1.insets = new Insets(-30, 0, 0, 30);
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.anchor = GridBagConstraints.CENTER;
            lblMenu.setFont(poppinsMedium);
            p.add(lblMenu, gbc1);

            gbc1.insets = new Insets(30, -50, 0, 100);
            gbc1.gridy++;
            gbc1.anchor = GridBagConstraints.WEST;
            lblPieTit.setFont(poppinsItalic);
            lblPieTit.setForeground(Color.cyan);
            p.add(lblPieTit, gbc1);

            gbc1.insets = new Insets(5, -50, 0, 100);
            gbc1.gridy++;
            rBtnTorta.setFont(poppins);
            p.add(rBtnTorta, gbc1);

            gbc1.insets = new Insets(15, -50, 0, 100);
            gbc1.gridy++;
            lblIsTit.setFont(poppinsItalic);
            lblIsTit.setForeground(Color.cyan);
            p.add(lblIsTit, gbc1);

            gbc1.insets = new Insets(5, -50, 0, 100);
            gbc1.gridy++;
            rBtnIsNum.setFont(poppins);
            p.add(rBtnIsNum, gbc1);

            gbc1.insets = new Insets(5, -50, 0, 100);
            gbc1.gridy++;
            rBtnIsMill.setFont(poppins);
            p.add(rBtnIsMill, gbc1);

            gbc1.insets = new Insets(50, 80, 0, 10);
            gbc1.gridy++;
            gbc1.anchor = GridBagConstraints.WEST;
            btnSeleziona.setFont(poppins);
            p.add(btnSeleziona, gbc1);

            gbc1.insets = new Insets(50, 110, 0, 10);
            gbc1.anchor = GridBagConstraints.CENTER;
            btnTorna.setFont(poppins);
            p.add(btnTorna, gbc1);
            gbc1.gridy++;

        } else if (n == 5) {
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.ipadx = 0;
            gbc1.ipady = 0;
            gbc1.insets = new Insets(-180, 0, 150, 0);
            gbc1.anchor = GridBagConstraints.PAGE_START;
            lblIsNum.setFont(poppinsMedium);
            p.add(lblIsNum, gbc1);

            gbc1.gridy++;
            gbc1.ipadx = 0;
            gbc1.ipady = 0;
            gbc1.anchor = GridBagConstraints.CENTER;
            gbc1.insets = new Insets(10, 0, -250, 0);

            btnIndietroIs1.setFont(poppins);
            p.add(btnIndietroIs1, gbc1);
        } else {
            gbc1.gridx = 0;
            gbc1.gridy = 0;
            gbc1.ipadx = 0;
            gbc1.ipady = 0;
            gbc1.insets = new Insets(-180, 0, 150, 0);
            gbc1.anchor = GridBagConstraints.PAGE_START;
            lblIsMill.setFont(poppinsMedium);
            p.add(lblIsMill, gbc1);

            gbc1.gridy++;
            gbc1.ipadx = 0;
            gbc1.ipady = 0;
            gbc1.anchor = GridBagConstraints.CENTER;
            gbc1.insets = new Insets(10, 0, -250, 0);

            btnIndietroIs2.setFont(poppins);
            p.add(btnIndietroIs2, gbc1);
        }*/
    }

    public static void main(String[] args) throws FontFormatException, IOException {
        new TombolaPanel();
    }

}
