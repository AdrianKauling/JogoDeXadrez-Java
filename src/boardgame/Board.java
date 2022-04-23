package boardgame;

import exceptions.BoardException;

public class Board {
    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer columns) {
        if (rows < 1 || columns < 1){
            throw new BoardException("Creating board error: Rows and columns must be greater than 0");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Piece piece(int row, int column){

        if(!positionExist(row,column)){
            throw new BoardException("Creating board error: position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){

        if(!positionExist(position)){
            throw new BoardException("Creating board error: position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(!positionExist(position)){
            throw new BoardException("Creating board error: position not on the board");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExist(Position position){
        return position.getRow() >= 0 && position.getRow() < rows && position.getColumn() >= 0 && position.getColumn() < columns;
    }

    public boolean positionExist(int row, int column){
        return row >= 0 && row < rows && column >= 0 && column <= columns;
    }

    public boolean isThereAPiece(Position position){
        if(!positionExist(position)){
            throw new BoardException("Creating board error: position not on the board");
        }
        return piece(position.getRow(), position.getColumn()) != null;
    }
}
