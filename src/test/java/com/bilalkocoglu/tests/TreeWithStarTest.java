package com.bilalkocoglu.tests;

import com.bilalkocoglu.TreeWithStar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeWithStarTest {

    private TreeWithStar treeWithStar;

    @Before
    public void setUp() throws Exception {
        treeWithStar = new TreeWithStar();
    }
/*
    @Test
    public void maxStarTest(){
        Assert.assertEquals(1, treeWithStar.calculateMaxStar(1, 1));
        Assert.assertEquals(3, treeWithStar.calculateMaxStar(2, 1));
        Assert.assertEquals(7, treeWithStar.calculateMaxStar(4, 1));
        Assert.assertEquals(9, treeWithStar.calculateMaxStar(5, 1));
    }

    */
    @Test
    public void startSpaceTest(){
        Assert.assertEquals(0, treeWithStar.calculateFirstSpace(1));
        Assert.assertEquals(1, treeWithStar.calculateFirstSpace(2));
        Assert.assertEquals(2, treeWithStar.calculateFirstSpace(3));
        Assert.assertEquals(3, treeWithStar.calculateFirstSpace(4));
        Assert.assertEquals(4, treeWithStar.calculateFirstSpace(5));
        Assert.assertEquals(5, treeWithStar.calculateFirstSpace(6));
    }

    @Test
    public void treeTest(){
        String tree = "*";
        Assert.assertEquals(tree, treeWithStar.drawTree(1));
        tree = " *\n***";
        Assert.assertEquals(tree, treeWithStar.drawTree(2));
        tree = "  *\n ***\n*****";
        Assert.assertEquals(tree, treeWithStar.drawTree(3));
        tree = "   *\n  ***\n *****\n*******";
        Assert.assertEquals(tree, treeWithStar.drawTree(4));

    }
}
