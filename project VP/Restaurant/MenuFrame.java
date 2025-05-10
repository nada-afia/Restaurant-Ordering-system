package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuFrame extends JFrame {

    JCheckBox pizzaCheck, burgerCheck, saladCheck, grapeLeavesCheck;
    JSpinner pizzaSpinner, burgerSpinner, saladSpinner, grapeLeavesSpinner;

    public MenuFrame() {
        setTitle("Restaurant Menu");
        setSize(600, 450);
        setLayout(new BorderLayout()); //layout for frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel itemsPanel = new JPanel(null);  // null layout for panel
        itemsPanel.setSize(600,400);
        itemsPanel.setBackground(Color.WHITE);
        // for Pizza
        JLabel pizzaImg = new JLabel(new ImageIcon("C:\\Users\\nadam\\OneDrive\\Desktop\\project VP\\p.png"));
        pizzaImg.setBounds(10, 30, 100, 100);
        pizzaCheck = new JCheckBox("Pizza - 100 LE");
        pizzaCheck.setBounds(120, 60, 200, 30);
        pizzaCheck.setBackground(Color.WHITE);
        pizzaSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        pizzaSpinner.setBounds(320, 60, 50, 30);
        // for Burger
        JLabel burgerImg = new JLabel(new ImageIcon("C:\\Users\\nadam\\OneDrive\\Desktop\\project VP\\burger.png"));
        burgerImg.setBounds(10, 120, 100, 100);
        burgerCheck = new JCheckBox("Burger - 70 LE");
        burgerCheck.setBounds(120, 150, 200, 30);
        burgerCheck.setBackground(Color.WHITE);
        burgerSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        burgerSpinner.setBounds(320, 150, 50, 30);
        // Salad
        JLabel saladImg = new JLabel(new ImageIcon("C:\\Users\\nadam\\OneDrive\\Desktop\\project VP\\salad.png"));
        saladImg.setBounds(20, 210, 80, 80);
        saladCheck = new JCheckBox("Salad - 50 LE");
        saladCheck.setBounds(120, 240, 200, 30);
        saladCheck.setBackground(Color.WHITE);
        saladSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        saladSpinner.setBounds(320, 240, 50, 30);
        // Grape Leaves
        JLabel grapeImg = new JLabel(new ImageIcon("C:\\Users\\nadam\\OneDrive\\Desktop\\project VP\\grapeLeaves.png"));
        grapeImg.setBounds(20, 300, 80, 80);
        grapeLeavesCheck = new JCheckBox("Grape Leaves - 60 LE");
        grapeLeavesCheck.setBounds(120, 330, 200, 30);
        grapeLeavesCheck.setBackground(Color.WHITE);
        grapeLeavesSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        grapeLeavesSpinner.setBounds(320, 330, 50, 30);

        //  viewcart button
        JButton viewcart = new JButton("view cart");
        viewcart.setBackground(Color.pink);
        viewcart.setBounds(400, 350, 120, 40);
        viewcart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                int pizzaCount = (int) pizzaSpinner.getValue();
                int burgerCount = (int) burgerSpinner.getValue();
                int saladCount = (int) saladSpinner.getValue();
                int grapeLeavesCount = (int) grapeLeavesSpinner.getValue();
                new CartView(
                        pizzaCheck.isSelected(), burgerCheck.isSelected(),
                        saladCheck.isSelected(), grapeLeavesCheck.isSelected(),
                        pizzaCount, burgerCount, saladCount, grapeLeavesCount,
                        MenuFrame.this
                );
            }
        });
        itemsPanel.add(pizzaImg);
        itemsPanel.add(pizzaCheck);
        itemsPanel.add(pizzaSpinner);
        itemsPanel.add(burgerImg);
        itemsPanel.add(burgerCheck);
        itemsPanel.add(burgerSpinner);
        itemsPanel.add(saladImg);
        itemsPanel.add(saladCheck);
        itemsPanel.add(saladSpinner);
        itemsPanel.add(grapeImg);
        itemsPanel.add(grapeLeavesCheck);
        itemsPanel.add(grapeLeavesSpinner);
        itemsPanel.add(viewcart);


        add(itemsPanel, BorderLayout.CENTER);
        setVisible(true);
    }


}