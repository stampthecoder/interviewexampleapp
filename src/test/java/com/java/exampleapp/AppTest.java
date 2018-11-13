package com.java.exampleapp;

import org.junit.Test;

import static org.junit.Assert.*;
import com.java.exampleapp.ReverseSingularlyLinkedList;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {

        ReverseSingularlyLinkedList.LinkedListNode<Integer> node1 = new ReverseSingularlyLinkedList.LinkedListNode<Integer>();
        node1.setData(1);

        ReverseSingularlyLinkedList.LinkedListNode<Integer> node2 = new ReverseSingularlyLinkedList.LinkedListNode<Integer>();
        node2.setData(2);
        node1.setNextNode(node2);

        ReverseSingularlyLinkedList.LinkedListNode<Integer> node3 = new ReverseSingularlyLinkedList.LinkedListNode<Integer>();
node3.setData(3);
node2.setNextNode(node3);

assertEquals(1,node1.getCurrentNode().getData().intValue());
assertEquals(2,node2.getCurrentNode().getData().intValue());
assertEquals(3,node3.getCurrentNode().getData().intValue());

ReverseSingularlyLinkedList.LinkedListNode<Integer>  head= ReverseSingularlyLinkedList.reverse(node1);

assertEquals(3,head.getCurrentNode().getData().intValue());
assertEquals(2,head.getNextNode().getData().intValue());
assertEquals(1,head.getNextNode().getNextNode().getData().intValue());

        assertTrue(true);

    }
}
