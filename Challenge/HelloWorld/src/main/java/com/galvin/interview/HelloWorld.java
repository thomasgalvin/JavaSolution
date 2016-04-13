package com.galvin.interview;

/**
 * Your first test is a classic: Hello, world.
 * 
 * In the class below, there are two methods. In `sayHello()`, all you have to do 
 * is print "Hello, world!" to the console.
 * 
 * In `sayHello( String name )`, you should print "Hello, ${name}!" to the console.
 * For example, if you called `sayHello( "Tim" )`, the result would be
 * "Hello, Tim!"
 * 
 * Implement both methods.
 */
public class HelloWorld
{
    public void sayHello(){
        System.out.println( "Hello, world!" );
    }
    
    public void sayHello( String name ){
        System.out.print( "Hello, " );
        System.out.print( name );
        System.out.println( "!" );
    }
}
