public class PieceMinion extends Piece implements Recruiter{
    protected char symbol;
    protected String teamColor;
    protected int numRecruits;
    protected int numTimesSpawned;
    protected boolean hidden;
    protected boolean original;

    public static int MAX_NUM_SPAWNED = 3;

    public PieceMinion(char symbol, String teamColor,
                       int numRecruits, int numTimesSpawned,
                       boolean hidden, boolean original) {


        super(symbol, teamColor, hidden, original);
        this.symbol = super.symbol;
        this.teamColor = super.teamColor;
        this.hidden = super.hidden;
        this.original = super.original;

        this.numRecruits = numRecruits;
        this.numTimesSpawned = numTimesSpawned;


    }

    public PieceMinion(){
        this('M',"- -",
                0,0,
                false,true);
    }
    @Override
    public  boolean validRecruitPath (int gameRow,int GameColumn,
                                      int pRow,int pColumn)
    {
        return true;
    }


    public char getSymbol() {
        return this.symbol;
    }
    public String getTeamColor() {
        return this.teamColor;
    }
    @Override
    public int getNumRecruits() {
        return this.numRecruits;
    }
    public int getNumTimesSpawned() {
        return this.numTimesSpawned;
    }
    public boolean isHidden() {
        return this.hidden;
    }
    public boolean isOriginal() {
        return this.original;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }
    public void setOriginal(boolean original){
        this.original = original;
    }
    @Override
    public void setNumRecruits(int numRecruits) {
        this.numRecruits = numRecruits;
    }

    public void speak(){
        System.out.println("Bello!");
    }
    @Override
    public boolean validMovePath(int fromSquareRow, int fromSquareCol,
                                 int toSquareRow, int toSquareCol) {
        // You will implement this method in a later step
        // each Piece will have a different valid path
        return true;
    }
    @Override
    public  boolean validSpawnPath (int fromRow,int fromColumn,
                                    int toRow,int toColumn)
    {
        if(fromRow==toRow){
            return true;
        }else{
            return false;
        }
    }
    public PieceMinion spawn(){
        return new PieceMinion(Character.toLowerCase(this.symbol),
                this.teamColor,1,
                0,
                false,
                false);
    }

    public boolean canSpawn(){
        return original && numTimesSpawned < MAX_NUM_SPAWNED;
    }

}



