import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook>notebooks=new ArrayList<>();

        notebooks.add(new Notebook(32, 512, "Windows", "white"));
        notebooks.add(new Notebook(8, 1, "Linux", "grey"));
        notebooks.add(new Notebook(16, 1, "MacOS", "black"));
        notebooks.add(new Notebook(32, 2, "Linux", "grey"));
        notebooks.add(new Notebook(8, 512, "Windows", "white"));
        notebooks.add(new Notebook(32, 512, "Windows", "black"));

        ArrayList<Notebook> filterNotebooks=FilterNotebook.FilterNotebooks(notebooks);
        FilterNotebook.PrintNotebooks(filterNotebooks);
    }
    
}
