package org.example.jvmMemoryAreas;

/**
 *<p>
 * Impact of stack frame execution on memory areas
 *</p>
 *
 * @Author: wangxiang4
 * @Since: 3/14/25
 */
public class Person {

    public int work()throws Exception{
        int x =1;
        int y =2;
        int z =(x+y)*10;
        return  z;
    }

    public static void main(String[] args) throws Exception{
        // person in stack,"new Person()" object is on the heap
        Person person = new Person();
        person.work();
        person.hashCode();
    }
}
