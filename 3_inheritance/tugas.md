# Shape

mempunyai variabel color (String) dan filled (boolean).
- 2 constructor: a no-arg (no-argument) yang meninisialisasi color = "green" dan filled = True, dan constructor yang menginisialisasi color, dan filled sesuai argumen.
- Getter and setter for all the instance variables. Seluruh getter dan setter untuk instance variable (untuk boolean getter dan setter diganti isFilled)
- sebuah method toString() yang return "A Shape with color of 'xxx' and 'filled/Not filled'".
- Write a test program to test all the methods defined in Shape.
- test program untuk seluruh method yang ada di shape

## Write two subclasses of Shape called Circle and Rectangle, as shown in the class diagram.

### Circle class berisi:

- instance variable radius (double).
- 3 constructor, dimana no-arg constructor secara default membuat radius = 1
- Getter and setter untuk seluruh instance variable.
- Methods getArea() dan getPerimeter().
- Override the toString() method inherited, to return "A Circle with radius=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.


### The Rectangle class contains:

- Two instance variables width (double) and length (double).
- Three constructors as shown. The no-arg constructor initializes the width and length to 1.0.
- Getter and setter for all the instance variables.
- Methods getArea() and getPerimeter().
- Override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.


### Challenge 
Buatlah sebuah kelas bernama square, subclass dari rectangle. Ubahlah class rectangle supaya dapat dimodelkan sebagai kelas. Kelas square tidak mempunya instance variable tapi 'inherit' instance variable dari width dan length dari superclass Rectangle 
Hint:
public Square(double side) {
   super(side, side);  // Panggil superclass Rectangle(double, double)
}

*Override toString()* method jadi return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString() method from the superclass.
Do you need to override the getArea() and getPerimeter()? Try them out.
Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.