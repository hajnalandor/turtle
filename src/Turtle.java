public class Turtle {
    private int boardWidth;
    private int boardHeight;
    private int x;
    private int y;
    private boolean penStatus;


    public Turtle(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.x = 0;
        this.y = 0;
        this.penStatus = false;
    }

    public boolean move (String str) {
        if ("jobb".equals(str)) {
            if (this.x+1 <= this.boardWidth) {
                this.x++;
                return true;
            }
        }
        if ("bal".equals(str)) {
            if (this.x-1 >= 0) {
                this.x--;
                return true;
            }
        }
        if ("fel".equals(str)) {
            if (this.y-1 >= 0) {
                this.y--;
                return true;
            }
        }
        if ("le".equals(str)) {
            if (this.y+1 <= this.boardWidth) {
                this.y++;


                return true;
            }

        }
        return false;
    }
    public void changPen(boolean penStatus) {
        this.penStatus=penStatus;
    }

    @Override
    public String toString() {
        return "Teknyoc{" +
                ", x koord=" + x +
                ", y koord=" + y +
                ", Ceruza statusza=" + penStatus +
                '}';
    }

    public int getBoardWidth() {
        return boardWidth;
    }

    public void setBoardWidth(int boardWidth) {
        this.boardWidth = boardWidth;
    }

    public int getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isPenStatus() {
        return penStatus;
    }

    public void setPenStatus(boolean penStatus) {
        this.penStatus = penStatus;
    }
}
