public class Assign3Q6 {
    public static void main(String[] args) {
        // Rectangle
        System.out.println("Rectangle:");
        int rowCount = 0;
        do {
            int colCount = 0;
            do {
                System.out.print("*");
                colCount++;
            } while (colCount < 10);
            System.out.println();
            rowCount++;
        } while (rowCount < 4);
        System.out.println();

        // Ascending Lines
        System.out.println("Ascending Lines:");
        int lineCount = 1;
        do {
            int starCount = 0;
            do {
                System.out.print("*");
                starCount++;
            } while (starCount < lineCount);
            System.out.println();
            lineCount++;
        } while (lineCount <= 5);
        System.out.println();

        // Descending Lines
        System.out.println("Descending Lines:");
        int lineCountDesc = 5;
        do {
            int starCountDesc = 0;
            do {
                System.out.print("*");
                starCountDesc++;
            } while (starCountDesc < lineCountDesc);
            System.out.println();
            lineCountDesc--;
        } while (lineCountDesc >= 1);
        System.out.println();

        // Triangle
        System.out.println("Triangle:");
        int rowCountTriangle = 1;
        do {
            int colCountTriangle = 0;
            do {
                System.out.print("*");
                colCountTriangle++;
            } while (colCountTriangle < rowCountTriangle);
            System.out.println();
            rowCountTriangle++;
        } while (rowCountTriangle <= 5);
        System.out.println();

        // Numerical Triangle
        System.out.println("Numerical Triangle:");
        int rowCountNumerical = 1;
        do {
            int colCountNumerical = 1;
            do {
                System.out.print(rowCountNumerical);
                colCountNumerical++;
            } while (colCountNumerical <= rowCountNumerical);
            System.out.println();
            rowCountNumerical++;
        } while (rowCountNumerical <= 5);
        System.out.println();

        // Custom Pattern
        System.out.println("Custom Pattern:");
        int rowCountCustom = 1;
        do {
            int colCountCustom = 1;
            int numCustom = rowCountCustom;
            do {
                System.out.print(numCustom);
                if (colCountCustom < rowCountCustom) {
                    numCustom--;
                } else {
                    numCustom++;
                }
                colCountCustom++;
            } while (colCountCustom <= rowCountCustom * 2 - 1);
            System.out.println();
            rowCountCustom++;
        } while (rowCountCustom <= 5);
    }
}
