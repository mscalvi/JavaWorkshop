package main.java;

import main.java.views.DeckManagerUI;
import javax.swing.*;

public class DeckManager {
    public static void main(String[] args) {
        // Cria o JFrame (janela principal)
        JFrame frame = new JFrame("Deck Manager");

        // Instancia a interface criada no GUI Designer
        DeckManagerUI deckManagerUI = new DeckManagerUI();

        // Configura o JPanel criado no .form dentro do JFrame
        frame.setContentPane(deckManagerUI.getContentPane());

        // Define a operação padrão ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o tamanho da janela ou maximiza
        frame.setSize(1280, 720);  // Define o tamanho fixo da janela, ou
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // Para maximizar a janela

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        // Torna a janela visível
        frame.setVisible(true);
    }

}
