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

    private void m1(){
        System.out.println("add m1");
    }

    private void f1(){
        System.out.println("f1");
    }

    private void printFork(){
        System.out.println("fork 提交2");
    }
    private void printMaster(){
        System.out.println("master 分 支");
    }

}

