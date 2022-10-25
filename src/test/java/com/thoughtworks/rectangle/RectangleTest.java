package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnAreaWhenArePositive() {
        Rectangle rectangle = new Rectangle(10, 10);
        int area = rectangle.area();
        assertThat(area, is(equalTo(100)));
    }
}
