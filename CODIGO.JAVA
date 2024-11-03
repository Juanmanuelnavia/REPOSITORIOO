import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class veterinaria {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Veterinaria - Página de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);


        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(2, 3, 10, 10));


        String[][] products = {
                {"Bolsas de Comida", "comida"},
                {"Juguetería", "jugueteria"},
                {"Medicamentos", "medicamentos"},
                {"Productos de Limpieza", "limpieza"},
                {"Ropa para Mascotas", "ropa"},
                {"Collares", "collares"}
        };


        for (String[] product : products) {
            JPanel productCard = new JPanel();
            productCard.setLayout(new BorderLayout());

            JLabel nameLabel = new JLabel(product[0], JLabel.CENTER);
            JButton addButton = new JButton("Ver detalles");


            addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    JFrame detailsFrame = new JFrame("Detalles del Producto");
                    detailsFrame.setSize(400, 300);
                    detailsFrame.setLayout(new BorderLayout());

                    JLabel detailsLabel = new JLabel("Detalles de " + product[0], JLabel.CENTER);
                    detailsFrame.add(detailsLabel, BorderLayout.CENTER);

                    JButton backButton = new JButton("Volver");
                    backButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            detailsFrame.dispose();
                        }
                    });
                    detailsFrame.add(backButton, BorderLayout.SOUTH);

                    detailsFrame.setVisible(true);
                }
            });

            productCard.add(nameLabel, BorderLayout.NORTH);
            productCard.add(addButton, BorderLayout.SOUTH);

            productCard.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            productPanel.add(productCard);
        }


        frame.add(productPanel);

       
        frame.setVisible(true);
    }
}