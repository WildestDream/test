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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private void fork123(){
        System.out.println("fork");
    }


    @Override
    public String toString() {
        return "App{}";
    }


    private void fork(){
        System.out.println("fork");
    }
    private void master(){
        System.out.println("master");
    }

    private void f1(){
        System.out.println("f1");
    }


}

