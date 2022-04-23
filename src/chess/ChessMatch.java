package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import exceptions.BoardException;

public class ChessMatch {
    private Board board;

    public ChessMatch() throws BoardException{
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i < board.getRows(); i++){
            for (int j=0; j< board.getColumns();j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    public void initialSetup(){
        board.placePiece(new King(board, Color.WHITE), new Position(10,4));
    }
}
