package com.thoughtworks;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("master");
        System.out.println("test fork");
    }

    @Override
    public String toString() {
        return "App{}";
    }

    private void fork(){
        System.out.println("fork");
    }

}

