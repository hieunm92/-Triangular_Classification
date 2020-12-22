import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("equilateral triangle")
    void testEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam_giac_deu";
        String result = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("isosceles triangle")
    void testIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam_giac_can";
        String result = TriangleClassifier.getTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Triangle")
    void testTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam_giac_thuong";
        String result = TriangleClassifier.getTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("NotATriangle")
    void testNotATriangle() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "khong_phai_tam_giac";
        String result = TriangleClassifier.getTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("NotATriangle")
    void testNotATriangle1() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "khong_phai_tam_giac";
        String result = TriangleClassifier.getTriangle(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("NotATriangle")
    void testNotATriangle2() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "khong_phai_tam_giac";
        String result = TriangleClassifier.getTriangle(a, b, c);
        assertEquals(expected, result);
    }

}