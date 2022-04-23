package boardgame;

public class Piece {
    private Position position;
    protected Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
}
