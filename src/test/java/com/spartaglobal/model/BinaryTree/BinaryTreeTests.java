package com.spartaglobal.model.BinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {

    BinaryTree binaryTree;

    @BeforeEach
    public void setup() {
        binaryTree = new BinaryTree(5);
        binaryTree.addElements(new int[]{9, 3});
    }

    @Test
    @DisplayName("Get root element test")
    public void getRootElementTest() {
        Assertions.assertEquals(5, binaryTree.getRootElement());
    }

    @Test
    @DisplayName("Get number of elements test")
    public void getNumberOfElementsTest() {
        Assertions.assertEquals(3, binaryTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Find element test")
    public void findElementTest() {
        Assertions.assertEquals(true, binaryTree.findElement(9));
    }

}
