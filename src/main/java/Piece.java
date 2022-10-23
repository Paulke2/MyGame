public abstract class Piece {
    /**
     * Represents abstract Piece class that creates variables and methods that are implemented in the subclasses
     *
     * @authors Kevin Chau, Paul Kearney, Philip Stoyanov
     * @version 1.0
     */

    protected char symbol;
    protected String teamColor;
    protected boolean hidden;
    protected boolean original;

    public Piece (char symbol, String teamColor, boolean hidden, boolean original){
        /**
         * Constructor for Piece class
         *
         * @param char symbol: symbol used to represent Piece
         * @param String teamColor: represents the color of the piece
         * @param boolean hidden: represents whether Piece is hidden or not
         * @param boolean original: represents if Piece is original
         */

        this.symbol = symbol;
        this.teamColor = teamColor;
        this.hidden = hidden;
        this.original = original;
    }
    public char getSymbol(){
        /**
         * accessor method to access the symbol field
         *
         * @return char: the Piece's symbol
         */

        return this.symbol;
    }
    public String getTeamColor(){
        /**
         * accessor method to access teamColor field
         *
         * @return String: the color of the Piece
         */

        return this.teamColor;
    }
    public boolean isHidden(){
        /**
         * accessor method to access hidden field
         *
         * @return boolean: Piece is either hidden or its not
         */

        return this.hidden;
    }

    public boolean isOriginal(){
        /**
         * accessor method to access original field
         *
         * @return boolean: Piece is either hidden or its not
         */

        return this.original;
    }
    public void setSymbol(char symbol){
        /**
         * mutator method to set the symbol field
         */

        this.symbol = symbol;
    }
    public void setTeamColor(String teamColor){
        /**
         * mutator method to set the teamColor field
         */

        this.teamColor = teamColor;
    }
    public void setHidden(boolean hidden){
        /**
         * mutator method to set the hidden field
         */

        this.hidden = hidden;
    }
    public void setOriginal(boolean original){
        /**
         * mutator method to set the original field
         */

        this.original = original;
    }
    public abstract Piece spawn();
    /**
     * abstract method that creates the spawn() method to be implemented in subclasses
     *
     * @return Piece: object that is created in subclasses
     */


    public abstract void speak();

    /**
     * prints the sound the object makes
     */

    public abstract boolean validMovePath(int fromSquareRow, int fromSquareCol,
                                          int toSquareRow, int toSquareCol);
    public abstract boolean validSpawnPath(int fromSquareRow, int fromSquareCol,
                                           int toSquareRow, int toSquareCol);

    @Override
    public String toString(){
        /**
         * toString display teamColor and symbol fields
         *
         * @return String: text that displays teamColor and symbol
         */

        return this.teamColor + " " + this.symbol;
    }

}

