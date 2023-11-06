public class GeoMenu {
    public static void geometry() {
        while (true) {
            System.out.println("Welcome to the Geometry Menu");
            System.out.println("1. Area");
            System.out.println("2. Perimeter");
            System.out.println("3. Volume");
            System.out.println("4. Surface Area");
            System.out.println("5. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> GeoArea.geoarea();
                case 2 -> GeoPerimeter.geoperimeter();
                case 3 -> GeoVolume.geovolume();
                case 4 -> GeoSurfaceArea.geosurfacearea();
                case 5 -> MathMenu.mathmenu();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
class GeoArea {
    public static void geoarea() {
        while (true) {
            System.out.println("Welcome to the Area Menu");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle is " + Geometry.areaOfCircle(radius));
                }
                case 2 -> {
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.println("Area of the rectangle is " + Geometry.areaOfRectangle(length, breadth));
                }
                case 3 -> {
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    System.out.println("Area of the square is " + Geometry.areaOfSquare(side));
                }
                case 4 -> {
                    System.out.println("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle is " + Geometry.areaOfTriangle(base, height));
                }
                case 5 -> GeoMenu.geometry();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

class GeoPerimeter {
    public static void geoperimeter() {
        while (true) {
            System.out.println("Welcome to the Perimeter Menu");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            System.out.println("5. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Perimeter of the circle is " + new Geometry().perimeterOfCircle(radius));
                }
                case 2 -> {
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.println("Perimeter of the rectangle is " + new Geometry().perimeterOfRectangle(length, breadth));
                }
                case 3 -> {
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    System.out.println("Perimeter of the square is " + new Geometry().perimeterOfSquare(side));
                }
                case 4 -> {
                    System.out.println("Enter the side1: ");
                    double side1 = scanner.nextDouble();
                    System.out.println("Enter the side2: ");
                    double side2 = scanner.nextDouble();
                    System.out.println("Enter the side3: ");
                    double side3 = scanner.nextDouble();
                    System.out.println("Perimeter of the triangle is " + new Geometry().perimeterOfTriangle(side1, side2, side3));
                }
                case 5 -> GeoMenu.geometry();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

class GeoVolume {
    public static void geovolume() {
        while (true) {
            System.out.println("Welcome to the Volume Menu");
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Sphere");
            System.out.println("6. Hemisphere");
            System.out.println("7. Pyramid");
            System.out.println("8. Prism");
            System.out.println("9. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    System.out.println("Volume of the cube is " + new Geometry().volumeOfCube(side));
                }
                case 2 -> {
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the cuboid is " + new Geometry().volumeOfCuboid(length, breadth, height));
                }
                case 3 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the cylinder is " + new Geometry().volumeOfCylinder(radius, height));
                }
                case 4 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the cone is " + new Geometry().volumeOfCone(radius, height));
                }
                case 5 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Volume of the sphere is " + new Geometry().volumeOfSphere(radius));
                }
                case 6 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Volume of the hemisphere is " + new Geometry().volumeOfHemisphere(radius));
                }
                case 7 -> {
                    System.out.println("Enter the base area: ");
                    double baseArea = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the pyramid is " + new Geometry().volumeOfPyramid(baseArea, height));
                }
                case 8 -> {
                    System.out.println("Enter the base area: ");
                    double baseArea = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the prism is " + new Geometry().volumeOfPrism(baseArea, height));
                }
                case 9 -> GeoMenu.geometry();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
class GeoSurfaceArea {
    public static void geosurfacearea() {
        while (true) {
            System.out.println("Welcome to the Surface Area Menu");
            System.out.println("1. Cube");
            System.out.println("2. Cuboid");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Sphere");
            System.out.println("6. Hemisphere");
            System.out.println("7. Pyramid");
            System.out.println("8. Prism");
            System.out.println("9. Back");
            System.out.println("Enter your choice: ");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the side: ");
                    double side = scanner.nextDouble();
                    System.out.println("Surface Area of the cube is " + new Geometry().surfaceAreaOfCube(side));
                }
                case 2 -> {
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth: ");
                    double breadth = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Surface Area of the cuboid is " + new Geometry().surfaceAreaOfCuboid(length, breadth, height));
                }
                case 3 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Surface Area of the cylinder is " + new Geometry().surfaceAreaOfCylinder(radius, height));
                }
                case 4 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Surface Area of the cone is " + new Geometry().surfaceAreaOfCone(radius, height));
                }
                case 5 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Surface Area of the sphere is " + new Geometry().surfaceAreaOfSphere(radius));
                }
                case 6 -> {
                    System.out.println("Enter the radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Surface Area of the hemisphere is " + new Geometry().surfaceAreaOfHemisphere(radius));
                }
                case 7 -> {
                    System.out.println("Enter the base area: ");
                    double baseArea = scanner.nextDouble();
                    System.out.println("Enter the base perimeter: ");
                    double basePerimeter = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Surface Area of the pyramid is " + new Geometry().surfaceAreaOfPyramid(baseArea, basePerimeter, height));
                }
                case 8 -> {
                    System.out.println("Enter the base area: ");
                    double baseArea = scanner.nextDouble();
                    System.out.println("Enter the base perimeter: ");
                    double basePerimeter = scanner.nextDouble();
                    System.out.println("Enter the height: ");
                    double height = scanner.nextDouble();
                    System.out.println("Surface Area of the prism is " + new Geometry().surfaceAreaOfPrism(baseArea, basePerimeter, height));
                }
                case 9 -> GeoMenu.geometry();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}