package com.dsa.greatlearning;

import java.io.*;
 
// Class of the SkewedBst
class SkewedBst
{
    int val;
    SkewedBst left, right;
    
    // Helper function that allocates a new SkewedBst
    // with the given data and NULL left and right
    // pointers.
    SkewedBst(int item)
    {
        val = item;
        left = right = null;
    }
}
class skewedConversionLogic
{
    public static SkewedBst SkewedBst;
    static SkewedBst prevSkewedBst = null;
    static SkewedBst headSkewedBst = null;
   
    static void BTTtoConvertToString(SkewedBst root,
                                  int order)
    {
       
        // Base Case
        if(root == null)
        {
            return;
        }
       
        if(order > 0)
        {
            BTTtoConvertToString(root.right, order);
        }
        else
        {
            BTTtoConvertToString(root.left, order);
        }
        SkewedBst rightSkewedBst = root.right;
        SkewedBst leftSkewedBst = root.left;
       
        if(headSkewedBst == null)
        {
            headSkewedBst = root;
            root.left = null;
            prevSkewedBst = root;
        }
        else
        {
            prevSkewedBst.right = root;
            root.left = null;
            prevSkewedBst = root;
        }
       
        if (order > 0)
        {
            BTTtoConvertToString(leftSkewedBst, order);
        }
        else
        {
            BTTtoConvertToString(rightSkewedBst, order);
        }
    }
   
    static void traverseRightSkewed(SkewedBst root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
   
    public static void main (String[] args)
    {

        skewedConversionLogic tree = new skewedConversionLogic();
        tree.SkewedBst = new SkewedBst(50);
        tree.SkewedBst.left = new SkewedBst(30);
        tree.SkewedBst.right = new SkewedBst(60);
        tree.SkewedBst.left.left = new SkewedBst(10);
        tree.SkewedBst.right.left= new SkewedBst(55);

        int order = 0;
        BTTtoConvertToString(SkewedBst, order);
        traverseRightSkewed(headSkewedBst);
    }
}