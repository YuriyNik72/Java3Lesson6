public class HomeWork {

        public static int[] findAfterFour(int[] values) {
            if (values == null || values.length == 0) {
                throw new RuntimeException("Array cannot be empty");
            }

            int index = -1;
            for (int i = values.length-1; i >= 0; i--) {
                if (values[i] == 4) {
                    index = i + 1;
                    break;
                }
            }

            if (index == -1) {
                throw new RuntimeException("There was not found - 4");
            }

            int[] copied = new int[values.length - index];
            System.arraycopy(values, index, copied, 0, copied.length);
            return copied;
        }

        public static boolean checkOneAndFour (int [] arr){
            boolean val1=true;
            for (int i = 0; i < arr.length; i++) {
                if(!(arr[i] ==1) || !(arr[i] ==4)){
                    val1=false;
                }else {
                    return true;
                }
            }
            return val1;
        }
}

