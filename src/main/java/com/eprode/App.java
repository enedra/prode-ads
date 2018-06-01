package com.eprode;

/**
 * Startup class
 */
public class App
{

    public static void main( String[] args )
    {
        get("/hello", (req, res) -> "Hello World");
    }

}
