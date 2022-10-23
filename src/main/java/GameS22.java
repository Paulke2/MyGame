public class GameS22 extends Game{
    /**
     * this class extends game and inplements the three abstract methods
     * isAWinner, getWinner, and isGameEnd.
     *
     * @author Paul Kearney
     * @version 1.0
     */
     if(two.getPiece('P')==null){

    }
    Piece Planktonone =two.getPiece('P');
    public GameS22(int rows,int columns,Team a,Team b){
        /**
         * constructor for the GameS22 class and calls the super class
         * to create a new GameS22
         */
        super(rows,columns,a,b);
    }
    @Override
    public boolean isAWinner(){
        /**
         * if getWinner does not return null, this method returns true
         * indicating that a team has won, if getWinner is equal to null
         * false is returned telling us that there is no winner yet.
         * @param none
         * @returns a boolean reprenting if there is a winner yet or not
         */
        if(getWinner()!=null) {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public Team getWinner(){
        /**
         * this method gets the size of team one, and if it is equal to or
         * less than 0, the second team is returned representing the winner of
         * the game.
         * if the second teams size is equal or less than 0 the first team is returned
         * @param none
         * @returns a Team representing the winner of the game
         */
        if(two.getPiece('P')==null){

        }

        if (one.getTeamPieces().size() <= 0||((PiecePlankton) Planktonone).getNumKarens() <2) {
            return two;

        } else if (two.getTeamPieces().size() <= 0) {
            return one;
        } else {
            return null;
        }

    }


}
    public Piece Planktontwo =two.getPiece('P');
    public boolean isGameEnded(){
        /**
         * if either of the teams has less than 0 pieces true is
         * returned else false is returned indicating the game is not
         * over.
         * @returns boolean representing if the game is over
         * @param none
         */
        if(two.getPiece('P')==null){

        }else{

        }
        Piece Planktonone =two.getPiece('P');
        if(two.getPiece('P')==null){
        if((one.getTeamPieces().size() <= 0)||two.getTeamPieces().size() <= 0){
            return true;
        }else {
            return false;
        }
    }

}
