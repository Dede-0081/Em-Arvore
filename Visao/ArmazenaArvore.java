package Visao;

import javax.swing.JOptionPane;

import Modeladem.ModeloArvore;

public class ArmazenaArvore {
	 private ModeloArvore[] vetor;

	  String expression = JOptionPane.showInputDialog("Digite a expressão pré-fixada:");

      Tree tree = new Tree();
      tree.buildAndDisplayTree(expression);
}
