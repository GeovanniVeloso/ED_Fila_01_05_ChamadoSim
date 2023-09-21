package view;

import javax.swing.JOptionPane;

import controller.FilaController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		FilaController fc = new FilaController();
		Fila<Integer> F  = new Fila<Integer>();
		Fila<Integer> FP  = new Fila<Integer>();
		
		int c = 0;
		int cont = 1;
		int cont2 = 0;
		do {
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para inicializar as filas\n"+"Digite 2 para inserir uma nova senha na fila não prioritária\n"+"Digite 3 para inserir uma nova senha na fila prioritária\n"+"Digite 4 para chamar uma senha"));
				switch (c) {
				case 1:
						fc.IniciaFila(F, FP);
					break;
				case 2:
					int i = 1;
					int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser inserido na fila não prioritária"));
					fc.AdicionaFila(F, FP, i,valor);
					break;
				case 3:
					i = 2;
					valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser inserido na fila não prioritária"));
					fc.AdicionaFila(F, FP, i,valor);
					break;
				case 4:
					fc.ChamaSenha(F, FP, cont);
					do {
						cont2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para continuar chamando\n"+"Digite 0 para finalizar os chamados"));
						if(cont2 == 1) {
							cont+=1;
							fc.ChamaSenha(F, FP, cont);
						}
					}while(cont2!=0);
					break;
				case 0:
					System.out.println("Finalizando...");
					break;
				default:
					System.err.println("Opção não encontrada");
					break;
				}
		}while(c!=0);
		
	}

}
