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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void fork(){
        System.out.println("fork");
    }
    private void master(){
        System.out.println("master");
    }

}

