public class PrintingLikeBoss {

    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int whitespaceCount = size - 1;
        while (whitespaceCount >= 0) {
            printWhitespaces(whitespaceCount);
            printStars(size - whitespaceCount);
            whitespaceCount--;
        }
    }

    public static void xmasTree(int height) {
        int width = 1;
        int count = height;
        while (count > 0) {
            int whitespaceCount = (height * 2 - width) / 2;
            printWhitespaces(whitespaceCount);
            printStars(width);
            count--;
            width += 2;
        }
        
        printWhitespaces((height * 2 - 3) / 2); 
        printStars(3);
        
        printWhitespaces((height * 2 - 3) / 2); 
        printStars(3);
 
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
