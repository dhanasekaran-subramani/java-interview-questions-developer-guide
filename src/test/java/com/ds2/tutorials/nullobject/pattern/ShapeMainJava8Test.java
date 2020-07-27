package com.ds2.tutorials.nullobject.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeMainJava8Test {

    @Test
    public void optionalEmptyTest() {
        Optional<Shape> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void optionalOfTest() {
        Shape shape = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape);
        assertTrue(nonEmpty.isPresent());
    }

    @Test
    @ExceptionHandler(NullPointerException.class)
    public void optionalOfWithNullTest() {
        Shape shape = null;
        Optional.of(shape);
    }

    @Test
    public void optionalOfNullableTest() {
        Shape shape1 = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.ofNullable(shape1);
        assertTrue(nonEmpty.isPresent());
        Shape shape2 = null;
        Optional<Shape> empty = Optional.ofNullable(shape2);
        assertFalse(empty.isPresent());
    }

    @Test
    public void optionalIsPresentTest() {
        Shape shape = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape);
        assertTrue(nonEmpty.isPresent());
        Optional<Shape> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }

    @Test
    public void optionalIfPresentTest() {
        Shape shape = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape);
        nonEmpty.ifPresent(circle -> circle.draw());
        Optional<Shape> empty = Optional.empty();
        empty.ifPresent(circle -> circle.draw());
    }

    @Test
    public void optionalGetTest() {
        Shape shape = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.ofNullable(shape);
        assertNotNull(nonEmpty.get());
    }

    @Test
    @ExceptionHandler(NoSuchElementException.class)
    public void optionalGetWithNullTest() {
        Shape shape = null;
        Optional<Shape> empty = Optional.ofNullable(shape);
        empty.get();
    }

    @Test
    public void optionalOrElseTest() {
        Shape shape = ShapeFactory.createShape("Rectangle");
        Shape shape1 = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape1);
        assertEquals(shape1, nonEmpty.orElse(shape));
        Optional<Shape> empty = Optional.empty();
        empty.ifPresent(circle -> circle.draw());
        assertEquals(shape, empty.orElse(shape));
    }

    @Test
    public void optionalOrElseGetTest() {
        Shape shape = ShapeFactory.createShape("Rectangle");
        Shape shape1 = ShapeFactory.createShape("Circle");
        Optional<Shape> nonEmpty = Optional.of(shape1);
        assertEquals(shape1, nonEmpty.orElseGet(() -> ShapeFactory.createShape("Rectangle")));
        Optional<Shape> empty = Optional.empty();
        empty.ifPresent(circle -> circle.draw());
        // comparing the area of the shape since orElseGet will create another instance of rectangle
        assertEquals(shape.area(), empty.orElseGet(() -> ShapeFactory.createShape("Rectangle")).area(), 0.001d);
    }

    @Test
    @ExceptionHandler(IllegalArgumentException.class)
    public void optionalOrElseThrowWithNullTest() {
        Shape shape = null;
        Optional<Shape> empty = Optional.ofNullable(shape);
        empty.orElseThrow(IllegalArgumentException::new);
    }
}
