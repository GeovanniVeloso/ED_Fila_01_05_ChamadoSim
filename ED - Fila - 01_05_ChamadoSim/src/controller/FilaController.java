package controller;

import model.Fila;

public class FilaController {

	public FilaController() {
		super();
	}
	
	public void IniciaFila(Fila <Integer> F, Fila<Integer>FP) {
		for(int i = 0; i < 9; i++){
			FP.insert((int)(Math.random()*100)+1);
			FP.insert((int)(Math.random()*100)+1);
			FP.insert((int)(Math.random()*100)+1);
			F.insert((int)(Math.random()*100)+1);
		}
		System.out.println("Fila Iniciada");
	}
	
	public void AdicionaFila(Fila <Integer> F, Fila<Integer>FP, int i, int valor) {
		if(i%2==0) {
			FP.insert(valor);
			System.out.println("Valor adicionado a Fila Priorit�ria");
		}else {
			F.insert(valor);
			System.out.println("Valor adicionado a Fila n�o Priorit�ria");
		}
	}
	public void ChamaSenha(Fila <Integer> F, Fila<Integer>FP, int cont) {
		int atend = 0;
		if(FP.isEmpty() && F.isEmpty()) {
			System.err.println("As duas filas est�o vazias");
		}else {
			if(FP.isEmpty()) {
				try {
					atend = F.remove();
					System.out.println("Senha  #"+atend+" da fila n�o priorit�ria foi atendida");
				} catch (Exception e) {
					System.err.println(e);
				}
			}else {
				if(cont % 4 == 0) {
					try {
						atend = F.remove();
						System.out.println("Senha  #"+atend+" da fila n�o priorit�ria foi atendida");
					} catch (Exception e) {
						try {
							atend = FP.remove();
							System.out.println("Senha  #"+atend+" da fila priorit�ria foi atendida");
						} catch (Exception e2) {
							System.err.println(e2);
						}
					}
				}else {
					try {
						atend = FP.remove();
						System.out.println("Senha  #"+atend+" da fila priorit�ria foi atendida");
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}
		}
	}

}
