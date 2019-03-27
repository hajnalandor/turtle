import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TurtleFunction {
    private String name;
    public List<String> list=new ArrayList<>();

    public TurtleFunction() {

    }

    public void addCommand(String str) {
        System.out.println(this.list.size());
        this.list.add(str);
    }
    public void deleteAllCommands () {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(0));

            this.list.remove(0);
            System.out.println("A lista kiuritve");
        }
    }

    @Override
    public String toString() {
        return name+"";
    }

    public int getSize() {
        return this.list.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
