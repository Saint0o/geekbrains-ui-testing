import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;


public class TriangleTest {
    private static Triangle triangle1;
    private static Triangle triangle2;
    private static Triangle triangle3;

    private static final double FIRST_TRIANGLE_AREA = 0;
    private static final double CHANGED_TRIANGLE_AREA = 2.9047375096555625;
    private static final double SECOND_TRIANGLE_AREA = 9.921567416492215;
    private static final double THIRD_TRIANGLE_AREA = 26.832815729997478;

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @BeforeAll
    public static void createTriangles() {
        triangle1 = new Triangle(1, 2, 3);
        triangle2 = new Triangle(4, 5, 6);
        triangle3 = new Triangle(7, 8, 9);

        logger.trace("Треугольники созданы!");
    }

    @BeforeEach
    public void defaultSetABC() {
        triangle1.setA(1);
        triangle1.setB(2);
        triangle1.setC(3);
        triangle2.setA(4);
        triangle2.setB(5);
        triangle2.setC(6);
        triangle3.setA(7);
        triangle3.setB(8);
        triangle3.setC(9);

        logger.info("Дефолтные параметры треугольников возвращены");
    }

    @Test
    public void printingTriangleAreas() {
        System.out.println(triangle1.area());
        System.out.println(triangle2.area());
        System.out.println(triangle3.area());

        logger.debug("Площади треугольников выведены в консоль");
    }

    @Test
    public void triangleAreasAreCorrect() {
        assertThat(triangle1.area()).isEqualTo(FIRST_TRIANGLE_AREA);
        assertThat(triangle2.area()).isEqualTo(SECOND_TRIANGLE_AREA);
        assertThat(triangle3.area()).isEqualTo(THIRD_TRIANGLE_AREA);

        logger.warn("Площади треугольников посчитаны верно");
    }

    @Test
    public void changingTriangleOptions() {
        triangle1.setA(2);
        triangle1.setB(3);
        triangle1.setC(4);
        assertThat(triangle1.getA()).isEqualTo(2);
        assertThat(triangle1.area()).isEqualTo(CHANGED_TRIANGLE_AREA);

        logger.debug("Параметры треугольника меняются корректно");
    }

    @AfterAll
    public static void cleanTriangles() {
        triangle1 = null;
        triangle2 = null;
        triangle3 = null;

        logger.warn("Объекты удалены");
    }
}
