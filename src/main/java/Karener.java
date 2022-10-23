public interface Karener {

    public abstract int getNumKarens();
    public abstract void setNumKarens(int karens);
    public abstract boolean validKarenPath (int gameRow,int GameColumn,
                                             int pRow,int pColumn);

}
