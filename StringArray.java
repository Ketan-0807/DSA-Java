public class StringArray {
    public static void main(String[] args) {
        String[] arr1 = {"vetal", "Joh", "disha", "Ketan"};

        String res = SearchKey(arr1);

        System.out.println(res);
    }

    static String SearchKey(String[] arr) {
        String key = "disha";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return arr[i]; 
            }
        }
        return "Key not found"; 
    }
}
