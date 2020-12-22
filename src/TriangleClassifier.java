public class TriangleClassifier {

    public static final String TAM_GIAC_DEU = "tam_giac_deu";
    public static final String TAM_GIAC_CAN = "tam_giac_can";
    public static final String TAM_GIAC_THUONG = "tam_giac_thuong";
    public static final String KHONG_PHAI_TAM_GIAC = "khong_phai_tam_giac";

    public static String getTriangle(int canh1, int canh2, int canh3) {
        String result = "";

        if (testCoPhaiTamGiac(canh1, canh2, canh3)) {
            if (test3canhtamdeu(canh1, canh2, canh3)) {
                result = TAM_GIAC_DEU;
            } else if (testTamGiacCan(canh1, canh2, canh3)) {
                result = TAM_GIAC_CAN;
            } else
                result = TAM_GIAC_THUONG;
        } else
            result = KHONG_PHAI_TAM_GIAC;
        return result;
    }

    private static boolean testCoPhaiTamGiac(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static boolean testTamGiacCan(int a, int b, int c) {
        return a == b || a == c || b == c;
    }

    private static boolean test3canhtamdeu(int a, int b, int c) {
        return a == b && b == c;
    }

}
