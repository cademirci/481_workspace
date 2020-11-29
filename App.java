public class App {

    public String[] stringArray;

    public static int calculate(int a, int b, String[] arr) {
        int count = 0;
        for (String str: arr) {
            if (str.length() > a && str.length() < b) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // an example

        App a = new App();
        a.stringArray = new String[5]; // {"coffee", "plant", "X", "", "computer"};
        a.stringArray[0] = "coffee";
        a.stringArray[1] = "plant";
        a.stringArray[2] = "X";
        a.stringArray[3] = "";
        a.stringArray[4] = "computer";
        int start = 0;
        int end = 10;
        System.out.println("there are " + calculate(start,end, a.stringArray) + " strings in the array " +
                "those' lengths are between " + start + " and " + end);
    }
}