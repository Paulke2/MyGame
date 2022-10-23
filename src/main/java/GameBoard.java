
public class GameBoard {
    /**
     * Class that handles the game's game board that the Pieces will traverse through
     *
     * @author Kevin Chau
     * @version 1.0
     */

    protected int rows;
    protected int columns;
    public BoardSquare[][] squares;


    public GameBoard(int rows, int columns) {
        /**
         * constructor for GameBoard object, sets the number of rows and columns the game will have, then stores
         * those rows and columns into a BoardSquare 2-d array
         *
         * @param int rows: number of rows that make up the GameBoard
         * @param int columns: number of columns that make up the GameBoard
         */

        this.rows = rows;
        this.columns = columns;
        this.squares = new BoardSquare[rows][columns];
        setUpEmptyBoard();


    }

    public int getNumRows() {
        /**
         * accesses the rows field
         *
         * @return int: number of rows
         */

        return this.rows;
    }

    public int getNumColumns() {
        /**
         * accesses the columns field
         *
         * @return int: number of columns
         */

        return this.columns;
    }

    public BoardSquare[][] getSquares() {

        /**
         * accesses the squares field
         *
         * @return BoardSquare[][]: position of the square on the GameBoard
         */

        return this.squares;
    }

    public boolean inBounds(int rowIndex, int columnIndex) {
        /**
         * method that checks rows and columns to see whether a piece is within the GameBoard bounds
         *
         * @param rowIndex: syncs index of row array to its value
         * @param columnIndex: syncs index of column array to its value
         * @return boolean: if rowIndex and columnIndex are less than their respective fields - 1 and greater than 0,
         * return true, otherwise return false
         */

        if (rowIndex > this.rows - 1 || columnIndex > this.columns - 1) {
            return false;
        } else if (rowIndex < 0 || columnIndex < 0) {
            return false;
        } else {
            return true;
        }
    }


    private void setUpEmptyBoard() {
        /**
         * sets up an empty GameBoard, ready for pieces to be put onto
         */

        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                if (((j + 1) % 2) == 0) {
                    squares[i][j] = new BoardSquare("Blue");
                } else {
                    squares[i][j] = new BoardSquare("Red");
                }
            }
        }
    }

    public BoardSquare findRandomEmptySpace() {
        /**
         * finds a random, empty space on the GameBoard
         *
         * @return BoardSquare: location of the space on the board that is empty
         */

        boolean booleanflag = false;
        int randomRow = (int) (Math.random() * rows);
        int randomColumn = (int) (Math.random() * columns);

        while (!booleanflag) {
            booleanflag = squares[randomRow][randomColumn].isEmpty();
            randomRow = (int) (Math.random() * rows);
            randomColumn = (int) (Math.random() * columns);
        }
        return squares[randomRow][randomColumn];
    }
    @Override
    public String toString(){
        /**
         * overridden toString that prints the GameBoard with its rows and columns
         *
         * @return String: representation of the GameBoard
         */

        StringBuilder boardString = new StringBuilder();
        boardString.append("Col :       ");

        for(int col = 0; col < squares[0].length; col++){
            boardString.append(col + "        ");
        }
        boardString.append("\n");
        for(int row = 0; row < squares.length; row++){
            boardString.append("Row : " + row + "   ");
            for(int col = 0; col < squares[row].length; col++){
                boardString.append(squares[row][col].toString() + "  ");
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }

}

