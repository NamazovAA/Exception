public class Main {
    public static void main(String[] args) {
        String [][]arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            int result = arrDataSizeExc(arr);
            System.out.println(result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка размера заданного массива");
            e.printStackTrace();
        }
    }
    public static int arrDataSizeExc (String[][]arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
            } if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}