package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder multiplicationTable = new StringBuilder();
        String Table = "";
        for (int i = 1; i <= tableSize; i++){
            for (int j = 1; j < tableSize + 1; j++){
                if (j*i < 10) {
                    Table = String.format("%3d |", (j*i));
                    multiplicationTable.append(Table);
                }else if (j * i < 100) {
                    Table = String.format("%3d |", (j*i));
                    multiplicationTable.append(Table);
                } else {
                    Table = String.format("%3d |", (j*i));
                    multiplicationTable.append(Table);

                }

            }
            multiplicationTable.append("\n");
        }
        return multiplicationTable.toString();
    }
}
