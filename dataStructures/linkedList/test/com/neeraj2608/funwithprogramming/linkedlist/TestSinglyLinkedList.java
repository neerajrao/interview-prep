package com.neeraj2608.funwithprogramming.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TestSinglyLinkedList{

  SinglyLinkedList sll;
  
  @Before
  public void setup(){
    sll = new SinglyLinkedList();
  }
  
  @Test
  public void testisEmpty(){
    assertTrue(sll.isEmpty());
    sll.addInFront(new Integer(1));
    assertFalse(sll.isEmpty());
  }
  
  @Test
  public void testRemove(){
    sll.addInFront(new String("a"));
    sll.addInFront(new String("b"));
    sll.addInFront(new String("c"));
    assertEquals("c",sll.remove());
    assertEquals("b",sll.remove());
    assertEquals("a",sll.remove());
  }
  
  @Test(expected=RuntimeException.class)
  public void testRemoveThrowsException(){
    sll.remove();
  }
  
  @Test
  public void testReverse(){
    sll.addInFront(new String("a"));
    sll.addInFront(new String("b"));
    sll.addInFront(new String("c"));
    sll.reverse();
    assertEquals("a",sll.remove());
    assertEquals("b",sll.remove());
    assertEquals("c",sll.remove());
  }

}