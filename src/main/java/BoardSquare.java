
public class BoardSquare {
    /**
     * Class that represents each space on the game board
     *
     * @author Kevin Chau
     * @version 1.0
     */

    public boolean empty;
    Piece piece;
    private String boardColor;

    public BoardSquare(String boardColor) {
        /**
         * constructor for BoardSquare object, set the values of boarColor and empty fields
         *
         * @param String boardColor: takes in String and sets the object's color to it
         */

        this.boardColor = boardColor;
        this.empty = true;
    }

    public boolean isEmpty() {
        /**
         * accesses the empty field
         *
         * @return boolean: BoardSquare is empty if empty = true, or occupied if empty = false
         */

        return this.empty;
    }

    public String getSquareColor() {
        /**
         * accesses the boardColor field
         *
         * @return String: color of the BoardSquare
         */

        return this.boardColor;
    }

    public Piece getPiece() {
        /**
         * accesses the piece object
         *
         * @return Piece: Piece that is occupying the BoardSquare space
         */

        return this.piece;
    }

    public void setPiece(Piece piece) {
        /**
         * mutator that changes the value of piece, setting empty to false
         *
         * @param Piece piece: piece that occupies the BoardSquare
         */

        this.piece = piece;
        this.empty = false;
    }

    public Piece removePiece() {
        /**
         * removes piece from BoardSquare using a temp value, also sets empty to true
         *
         * @return Piece: object that is removed from the BoardSquare
         */

        Piece temp = this.piece;
        this.piece = null;
        this.empty = true;
        return temp;
    }

    @Override
    public String toString() {
        /**
         * toString that calls upon the Piece classess' toString in order to print the attributes
         * of the BoardSquare's piece, if empty, "-------" is printed instead
         *
         * @return String: if empty field is true, "-------" is returned, otherwise, the piece's teamColor and
         * symbol are returned
         */

        if (this.empty == true) {
            return "-------";
        } else {
            return ("-" + piece.toString() + "-");
        }
    }
}

