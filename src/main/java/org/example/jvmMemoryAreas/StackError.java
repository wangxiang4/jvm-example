package org.example.jvmMemoryAreas;

/**
 *<p>
 * Virtual machine stack overflow
 *</p>
 *
 * @Author: wangxiang4
 * @Since: 3/14/25
 */
public class StackError {
    public static void main(String[] args) {
        A();
    }
    public static void A(){
        A();
    }
}
