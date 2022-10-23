
public class PieceBuzz extends Piece implements Attacker{
    private char symbol;
    private String teamColor;
    private int numAttacks;
    private int numTimesBeenAttacked;
    protected boolean workingLaser;
    private boolean hidden;
    private boolean original;

    public PieceBuzz(char symbol,
                     String teamColor,
                     int numAttacks,
                     int numTimesBeenAttacked,
                     boolean workingLaser,
                     boolean hidden,
                     boolean original) {
        super(symbol, teamColor, hidden, original);
        this.symbol = super.symbol;
        this.teamColor = super.teamColor;
        this.hidden = super.hidden;
        this.original = super.original;
        this.numAttacks = numAttacks;
        this.numTimesBeenAttacked = numTimesBeenAttacked;
        this.workingLaser = workingLaser;
    }

    public PieceBuzz() {
        this('B', "- -",
                0, 0,
                true, false, true);
    }
    @Override
    public char getSymbol() {
        return super.symbol;
    }
    @Override
    public String getTeamColor() {
        return super.teamColor;
    }
    @Override
    public int getNumAttacks() {
        return numAttacks;
    }
    public int getNumTimesBeenAttacked() {
        return numTimesBeenAttacked;
    }
    public boolean canAttack(){
        return workingLaser;
    }
    @Override
    public boolean isHidden() {
        return super.hidden;
    }
    @Override
    public boolean isOriginal(){ return original;}

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }
    public void setWorkingLaser(boolean workingLaser) {
        this.workingLaser = workingLaser;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    public void setOriginal(boolean original) {
        this.original = original;
    }
    @Override
    public void setNumAttacks(int numAttacks)  {
        this.numAttacks = numAttacks;
    }

    public void updateNumTimesBeenAttacked(){
        this.numTimesBeenAttacked += 1;
        this.workingLaser = false;
    }

    public void speak(){
        System.out.println("To Infinity and Beyond!");
    }
    @Override
    public boolean validMovePath(int fromSquareRow, int fromSquareCol,
                                 int toSquareRow, int toSquareCol) {
        // You will implement this method in a later step
        // each Piece will have a different valid path
        return true;
    }
    @Override
    public  boolean validAttackPath (int fromRow,int fromColumn,
                                     int toRow,int toColumn)
    {

        if(fromColumn==toColumn){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public  boolean validSpawnPath (int fromRow,int fromColumn,
                                     int toRow,int toColumn)
    {
       return false;
    }
    @Override
    public PieceBuzz spawn(){
        return null;
    }
    public boolean canSpawn(){
        return false;
    }

}


