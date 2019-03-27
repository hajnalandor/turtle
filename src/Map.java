import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Map {
   private Turtle turtle;
   private String[][] arr;
   private TurtleFunction turtleFunction = new TurtleFunction();
   private List<TurtleFunction> turtleFunctionList=new ArrayList<>();
   private boolean isfunc = false;

    public Map(int width, int height) {
        this.turtle = new Turtle(width,height);
        this.arr=new String[height][width];
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length;j++) {
                if (i == turtle.getX() && turtle.getY() == j) {
                    arr[i][j]="$";
                } else {
                    arr[i][j]=" ";
                }
            }
        }


    }



    public void drawMap() {
        if (!this.isfunc) {
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < this.arr[i].length; j++) {
                    System.out.print(String.valueOf(this.arr[i][j]));
                }
                System.out.println();

            }
        }

    }

    public void doCommand( String command1) {
        String[] command=command1.split(" ");
        if ("vege".equalsIgnoreCase(command[0]) && isfunc) {
            isfunc = false;
            turtleFunctionList.add(turtleFunction);

            System.out.println("Utasitas sikeresen hozzaadva");

            turtleFunction.deleteAllCommands();
        }
        else if (!"vege".equalsIgnoreCase(command[0]) && isfunc) {
            turtleFunction.addCommand(command1);
        }
        else if ("csinald".equalsIgnoreCase(command[0]) && !isfunc) {
            int j = 0;
            for (int i = 0; i < turtleFunctionList.size(); i++) {
                if (turtleFunctionList.get(i).toString().equalsIgnoreCase(command[1])) {
                    j=i;
                    break;
                }
            }
            List<String> list = turtleFunctionList.get(j).getList();
            System.out.println("Ennyi lepes van" + list.size());
            for (int i = 0; i < list.size();i++) {
            doCommand(list.get(i));
                System.out.println("lepes"+i);
            }

            // List<String> list=turtleFunction.getList();
           // System.out.println(list.get(0));
        }
        else if ("tollat le".equals(command[0]+ " "+command[1]) && !isfunc) {
            turtle.setPenStatus(true);
        }
        else if ("tollat fel".equals(command[0]+ " "+command[1])  && !isfunc) {
            turtle.setPenStatus(false);
        }
        else if ("torol".equalsIgnoreCase(command[0])  && !isfunc) {
            this.delete();
        }
        else if ("fel".equals(command[0])  && !isfunc) {
           int hMT= Integer.parseInt(command[1]);
            this.arr[turtle.getY()][turtle.getX()]=" ";

            for (int i = 0; i < hMT; i++) {
                if (turtle.isPenStatus()) {
                    this.arr[turtle.getY()][turtle.getX()]= "#";
                }
              boolean isEdge = turtle.move(command[0]);
              if (!isEdge) {
                  break;
              }
           }
            this.arr[turtle.getY()][turtle.getX()]="$";

        }
       else if ("le".equals(command[0])  && !isfunc) {
            int hMT= Integer.parseInt(command[1]);
            this.arr[turtle.getY()][turtle.getX()]=" ";

            for (int i = 0; i < hMT; i++) {

                if (turtle.isPenStatus()) {
                    this.arr[turtle.getY()][turtle.getX()]= "#";
                }
                boolean isEdge= turtle.move(command[0]);
                if (!isEdge) {
                    break;
                }
            }
            this.arr[turtle.getY()][turtle.getX()]="$";

        }
       else if ("jobb".equals(command[0])  && !isfunc) {
            int hMT= Integer.parseInt(command[1]);
            this.arr[turtle.getY()][turtle.getX()]=" ";

            for (int i = 0; i < hMT; i++) {

                if (turtle.isPenStatus()) {
                    this.arr[turtle.getY()][turtle.getX()]= "#";
                }
                boolean isEdge = turtle.move(command[0]);
                if (!isEdge) {
                    break;
                }
            }
            this.arr[turtle.getY()][turtle.getX()]="$";

        }
       else if ("bal".equals(command[0])  && !isfunc) {
            int hMT= Integer.parseInt(command[1]);
            this.arr[turtle.getY()][turtle.getX()]=" ";

            for (int i = 0; i < hMT; i++) {

                if (turtle.isPenStatus()) {
                    this.arr[turtle.getY()][turtle.getX()]= "#";
                }
                boolean isEdge = turtle.move(command[0]);
                if (!isEdge) {
                    break;
                }
            }
            this.arr[turtle.getY()][turtle.getX()]="$";

        } else if ("tanuld".equalsIgnoreCase(command[0])  && !isfunc) {
            System.out.println("tanulok");
                isfunc = true;
                turtleFunction.setName(command[1]);

            }


    }
    public void delete() {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if ("#".equals(this.arr[i][j])) {
                    this.arr[i][j] = "";
                }
            }
        }
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public String[][] getArr() {
        return arr;
    }

    public void setArr(String[][] arr) {
        this.arr = arr;
    }
}
