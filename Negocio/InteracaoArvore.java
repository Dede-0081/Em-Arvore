package Negocio;

import Modeladem.ModeloArvore;

public class InteracaoArvore {

	 private InteracaoArvore constructTree(String expression, int[] index) {
	        if (index[0] >= expression.length())
	            return null;

	        char character = expression.charAt(index[0]);
	        index[0]++;

	        ModeloArvore modeloArvore = new Node(character);

	        if (Character.isLetter(character)) {
	            return node;
	        }

	        ModeloArvore.left = constructTree(expression, index);
	        ModeloArvore.right = constructTree(expression, index);

	        return ModeloArvore;
	    }

	    // Método para exibir a árvore em pré-ordem
	    private void preOrderTraversal(Node node) {
	        if (node != null) {
	            System.out.print(node.data + " ");
	            preOrderTraversal(node.left);
	            preOrderTraversal(node.right);
	        }
	    }

	    // Método público para construir e exibir a árvore
	    public void buildAndDisplayTree(String expression) {
	        int[] index = {0};
	        root = constructTree(expression, index);
	        System.out.print("Árvore pré-fixada: ");
	        preOrderTraversal(root);
	        System.out.println();
	    }

}
