public class WordsCounter {

    private int count;

    public void process(String input) {
        for (char c: input.trim().toCharArray()){
            if (c == '-' || c== '_' || c == ' '){
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