//Codigo feito por Bruno Lambrecht e Ronald Silva

package br.edu.univas.main;

import java.util.Scanner;

public class Hash {
	
	static int boardSize = 3;
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String board [][] = new String [boardSize][boardSize];
			
		printBoard(board);
				
		boardStructure(board);
		
		System.out.println("Escolha uma das opções acima para fazer sua jogada!");
		
		System.out.println("\nQual o nome do primeiro Player ?");
		String player1 = sc.nextLine();
		System.out.println("Qual o nome do segundo Player ?");
		String player2 = sc.nextLine();	
		String symbolO = " O";
		String symbolX = " X";
		
		int i = 0;
		boolean won = false;
		
		do {
			gameStructure (board, player1, symbolX);
			i++;
			won = checksWinner(board, symbolX);
			
			if(won == true) {				
				winner(player1);
				break;	
			}
			
			if (i==9) {
				break;
			}
						
			gameStructure(board,player2, symbolO);
			i++;
			won = checksWinner(board, symbolO);
			
			if (won == true) {
				winner(player2);
				break;				
			}
		
	} while(true);
		old(won);
		
		sc.close();
	}
	
	// Parte da estrutura do Tabuleiro (contorno)
	public static void boardStructure (String board [][]) {
	
		System.out.println("-------------------");
		
			for (int i = 0; i < boardSize; i++) {
			
			for(int j = 0; j < boardSize; j++) {
				System.out.print("|  " + board [i][j] + " " );
			
			}
				System.out.print("|");
				System.out.println("\n-------------------");
		}
	}
	
	//Estrutura do tabuleiro (posições)
			public static void printBoard (String board [][]) {
				
				board [0][0] = "1a"; board [0][1] = "1b"; board [0][2] = "1c"; board [1][0] = "2a"; board [1][1] = "2b"; 
				board [1][2] = "2c"; board [2][0] = "3a"; board [2][1] = "3b"; board [2][2] = "3c";
				
			}
	
	//Estrutura do jogo
	public static void gameStructure (String board [][], String player, String symbol ) {
		
			System.out.println(player + " digite a posição de sua jogada: ");
			String move = sc.nextLine();
		
			for(int i = 0; i < boardSize; i++) {
			
			for (int j = 0; j < boardSize; j++) {
				
				if (board [i][j].equals(move) ) {
					board [i][j] = symbol;		
			}
				
		}
			
	}
		
		boardStructure(board);
		
	}
	
	//Verifica Vencedor 
	public static boolean checksWinner (String board [][], String symbol) {
		
		for (int i = 0; i < boardSize; i++) {			
			
			if ((board[0][i].equals(symbol)) && (board [1][i].equals(symbol)) && (board [2][i].equals(symbol)) ) {
				return true;
				
			}else if((board [i][0].equals(symbol)) && (board [i][1].equals(symbol)) && (board [i][2].equals(symbol))) {
				return true;				
			}
			
			}if ((board [0][0].equals(symbol)) && (board [1][1].equals(symbol)) && (board [2][2].equals(symbol))) {
				return true;
			
			}if ((board [2][0].equals(symbol)) && (board [1][1].equals(symbol)) && (board [0][2].equals(symbol))) {
				return true;
			
			}else {
				return false;
	
		}
						
	}
	
	//Imprime Vencedor
	public static void winner(String player) {
		
		System.out.println("Parabéns " + player + " você ganhou!");
		
	}
	
	//Imprime quando o jogo da velha
	public static void old(boolean won) {
		
		if(won == false) {
			
			System.out.println("Deu velha!");
			
		}
		
	}
	
}