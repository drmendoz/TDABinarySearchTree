/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author davidmendozaloor
 */
public class BSTNode<T,E> {
    private T key;
    private E content;
    private BinarySearchTree<T,E> left;
    private BinarySearchTree<T,E> right;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public BinarySearchTree<T,E> getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree<T,E> left) {
        this.left = left;
    }

    public BinarySearchTree<T,E> getRight() {
        return right;
    }

    public void setRight(BinarySearchTree<T,E> right) {
        this.right = right;
    }

   
    
    
}
