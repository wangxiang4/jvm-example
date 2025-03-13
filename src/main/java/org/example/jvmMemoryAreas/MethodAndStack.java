package org.example.jvmMemoryAreas;


/**
 *<p>
 * Java method execution and virtual machine stack
 *</p>
 *
 * @Author: wangxiang4
 * @Since: 3/14/25
 */
public class MethodAndStack {
    public static void main(String[] args) {
        A();
    }
    public static void A(){
        B();
    }
    public static void B(){
        C();
    }
    public static void C(){

    }
}
