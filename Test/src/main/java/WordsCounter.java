import java.util.List;

public class WordsCounter {

    private int count;

    public void process(String input) {
        List<String> stringArray = List.of(input.split("[-,_ ]"));
        for (int i = 0; i < stringArray.size()-1; i++) {
            if (!stringArray.get(i).equals(stringArray.get(i+1))){
                count++;
            }
        }

        if (!input.trim().isEmpty()) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}