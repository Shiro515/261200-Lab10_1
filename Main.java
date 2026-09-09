void main(){
    System.out.println("--- Creating 2 Circles (within the per-type limit) ---");
    Shape c1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
    if (c1 != null) c1.draw();
    Shape c2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
    if (c2 != null) c2.draw();

    System.out.println();
    System.out.println("--- Trying to exceed Circle's individual limit (2) ---");
    Shape c3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
    if (c3 != null) c3.draw();

    System.out.println();
    System.out.println("--- Creating 2 Triangles (within the per-type limit) ---");
    Shape t1 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
    if (t1 != null) t1.draw();
    Shape t2 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
    if (t2 != null) t2.draw();

    System.out.println();
    System.out.println("--- Trying to exceed Triangle's individual limit (2) ---");
    Shape t3 = ShapeFactory.getShape(ShapeFactory.TYPE_TRIANGLE);
    if (t3 != null) t3.draw();

    System.out.println();
    System.out.println("--- Creating 1 Ellipse (total shape count reaches 5) ---");
    Shape e1 = ShapeFactory.getShape(ShapeFactory.TYPE_ELLIPSE);
    if (e1 != null) e1.draw();

    System.out.println();
    System.out.println("--- Trying to exceed the total shape limit (5), even though only 1 Ellipse exists ---");
    Shape e2 = ShapeFactory.getShape(ShapeFactory.TYPE_ELLIPSE);
    if (e2 != null) e2.draw();
}
