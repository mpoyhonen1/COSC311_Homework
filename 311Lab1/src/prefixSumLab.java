/**
 * Mark Poyhonen
 * https://github.com/mpoyhonen1/COSC311_Homework
 * COSC 311
 * HW 01/05
 * Winter 2017
 *   
 */
     
public class prefixSumLab {
	public static void main(String[] args) {
        int[] data = { 0, 5, 1, -3, 2, 0, 4 };
       int[] prefSum = new int[data.length];

        prefSum[0] = data[0];
        System.out.print(prefSum[0] + " ");
        for (int i = 1; i < data.length; i++) {
            prefSum[i] = prefSum[i - 1] + data[i];
            System.out.print(prefSum[i] + " ");
        }
    }
}
