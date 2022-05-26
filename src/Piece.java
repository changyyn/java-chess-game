import java.util.Vector;

public abstract class Piece {

    boolean isFirstMove = false;
    boolean isKilled = false;
    PieceType pieceType;

    Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public boolean isFirstMove() {
        return isFirstMove;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public abstract Vector<Square> generateLegalMoves();
}
