package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getRow(int rowLength, int multipler) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= rowLength; i++) {
            sb.append(String.format("%3d |", i * multipler)); //  i == 5 => ' 25 |'
        }
        sb.append('\n');
        return sb.toString();
    }
    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            sb.append(getRow(tableSize, i));
        }
        return sb.toString();
    }
}
