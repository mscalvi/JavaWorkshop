package main.java.views;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DeckManagerUI {
    private JPanel MainWindow;
    private JTabbedPane TabMain;
    private JPanel Main;
    private JPanel Finder;
    private JPanel Decks;
    private JTextField TxtFieldFinder;  // Campo de texto para busca
    private JLabel LblFinderTitle;
    private JTextPane TxtPaneFinder;    // Área para mostrar os resultados

    public DeckManagerUI() {
        // Adiciona um DocumentListener para monitorar alterações no campo de texto
        TxtFieldFinder.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscarCarta();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarCarta();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarCarta();
            }

            // Metodo chamado sempre que o texto no campo é alterado
            private void buscarCarta() {
                String searchText = TxtFieldFinder.getText();
                if (!searchText.isEmpty()) {
                    searchCard(searchText);
                }
            }
        });
    }

    public JPanel getContentPane() {
        return MainWindow;
    }

    // Método que fará a busca
    public void searchCard(String cardName) {
        // Aqui você pode implementar a lógica de busca
        System.out.println("Buscando pela carta: " + cardName);
    }
}
