package com.galvin.interview;

import com.galvin.interview.utils.ConsoleGrabber;
import org.junit.Assert;

public class HelloWorldTestHarness
{
    public static final String UNEXPECTED_CONSOLE_OUTPUT = "Unexpected console output";
    
    public static final String HELLO_WORLD = "Hello, world!";
    public static final String HELLO_SALLY = "Hello, Sally!";
    public static final String INPUT_SALLY = "Sally";
    
    public void testBasic(){
        ConsoleGrabber.grabConsole();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        String result = ConsoleGrabber.releaseConsole().trim();
        Assert.assertEquals( UNEXPECTED_CONSOLE_OUTPUT, HELLO_WORLD, result );
    }

    public void testWithParameter(){
        HelloWorld helloWorld = new HelloWorld();

        ConsoleGrabber.grabConsole();
        helloWorld.sayHello( INPUT_SALLY );

        String result = ConsoleGrabber.releaseConsole().trim();
        Assert.assertEquals( UNEXPECTED_CONSOLE_OUTPUT, HELLO_SALLY, result );
    }
}
