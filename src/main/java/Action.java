public abstract class Action {
    /**
     * this class is an abstract class that has one consructor and
     * one abstract method
     * @author Paul Kearney
     * @version 1.0
     */
    protected GameS22 game;
    protected int fromRow;
    protected int fromColumn;
    protected int toRow;
    protected int toColumn;
    public Action(GameS22 game,
                  int fromRow, int fromColumn,
                  int toRow, int toColumn){
        /**
         * this method is a constructor for the action class
         */
        this.game = game;
        this.fromRow=fromRow;
        this.fromColumn=fromColumn;
        this.toRow = toRow;
        this.toColumn = toColumn;
    }
    public abstract void performAction();
}
