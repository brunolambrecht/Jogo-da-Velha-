//Codigo feito por Bruno Lambrecht e Ronald Silva 
programa {
inclua biblioteca Util
funcao inicio() { 
caracter board [3][3] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}
 

playMove(0, 2, 'X', board) 
playMove(0, 0, 'O', board) 
playMove(2, 0, 'X', board) 
playMove(2, 2, 'O', board)
playMove(1, 1, 'X', board)
playMove(2, 1, 'O', board)

}

funcao playMove(inteiro line, inteiro column, caracter move,
caracter board[][]) {
inteiro cont = 0
board[line][column] = move
showBoard(board)
cont++
checkWinner(board,cont)

}
funcao showBoard(caracter board[][]) {
limpa()
escreva("  +---+---+---+")
escreva("\n  | ", board[0][0], " | ", board[0][1], " | ", board[0][2], " | ")
escreva("\n  |---+---+---|")
escreva("\n  | ", board[1][0], " | ", board[1][1], " | ", board[1][2], " | ")
escreva("\n  |---+---+---|")
escreva("\n  | ", board[2][0], " | ", board[2][1], " | ", board[2][2], " | \n")
escreva("  +---+---+---+\n")

Util.aguarde(800)
}

funcao checkWinner(caracter board[][], inteiro cont){
    para (inteiro i = 0; i < 3; i++){
        
        se (board[0][i]=='X' e board[1][i]=='X' e board[2][i]=='X' ) {
            escreva("\nX venceu!")
        }
       se (board[i][0]=='X' e board[i][1]=='X' e board[i][2]=='X' ) {
           escreva("\nX venceu!") 
       }
       
       se (board[0][i]=='O' e board[1][i]=='O' e board[2][i]=='O' ) {
            escreva("\nO venceu!")
        }
       se (board[i][0]=='O' e board[i][1]=='O' e board[i][2]=='O' ) {
           escreva("\nO venceu!") 
        }
        
       se (board[0][0]=='X' e board[1][1]=='X' e board[2][2]=='X' ) {
            escreva("\nO venceu!") 
       }
    
       se (board[2][0]=='X' e board[1][1]=='X' e board[0][2]=='X' ) {
            escreva("\nX venceu!") 
       }
       se (board[0][0]=='O' e board[1][1]=='O'e board[2][2]=='O' ) {
            escreva("\nO venceu!") 
       }
    
       se (board[2][0]=='O' e board[1][1]=='O' e board[0][2]=='O' ) {
            escreva("\nO venceu!") 
       } 
        
    }
 se (cont ==9){
     escreva("\nDeu velha!")
 }
    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */