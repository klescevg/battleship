public class Battlefield {
    private CellState[][] grid = new CellState[10][10];

    public Battlefield() {
        clearField();
    }

    public CellState checkCell(int x, int y){
        return grid[x][y];
    }

    public void setShip(int x, int y){
        if (grid[x][y] == CellState.EMPTY){
            grid[x][y] = CellState.SHIP;
        }
    }

    public void setHit(int x, int y){
        if (grid[x][y] == CellState.SHIP){
            grid[x][y] = CellState.HIT;
        }
    }

    public void setMiss(int x, int y){
        if (grid[x][y] == CellState.EMPTY){
            grid[x][y] = CellState.MISS;
        }
    }

    public void clearField(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = CellState.EMPTY;
            }
        }
    }
}
