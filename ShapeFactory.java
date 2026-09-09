public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_TRIANGLE = 1;
    public static final int TYPE_ELLIPSE = 2;

    private static final int MAX_PER_TYPE = 2;
    private static final int MAX_TOTAL = 5;

    private static int circleCount = 0;
    private static int triangleCount = 0;
    private static int ellipseCount = 0;
    private static int totalCount = 0;

    public static Shape getShape(int shapeType) {
        if (totalCount >= MAX_TOTAL) {
            System.out.println("Cannot create shape: maximum total limit of " + MAX_TOTAL + " shapes reached.");
            return null;
        }

        switch (shapeType) {
            case TYPE_CIRCLE:
                if (circleCount >= MAX_PER_TYPE) {
                    System.out.println("Cannot create Circle: maximum limit of " + MAX_PER_TYPE + " Circle instances reached.");
                    return null;
                }
                circleCount++;
                totalCount++;
                return new Circle();

            case TYPE_TRIANGLE:
                if (triangleCount >= MAX_PER_TYPE) {
                    System.out.println("Cannot create Triangle: maximum limit of " + MAX_PER_TYPE + " Triangle instances reached.");
                    return null;
                }
                triangleCount++;
                totalCount++;
                return new Triangle();

            case TYPE_ELLIPSE:
                if (ellipseCount >= MAX_PER_TYPE) {
                    System.out.println("Cannot create Ellipse: maximum limit of " + MAX_PER_TYPE + " Ellipse instances reached.");
                    return null;
                }
                ellipseCount++;
                totalCount++;
                return new Ellipse();

            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }
}
