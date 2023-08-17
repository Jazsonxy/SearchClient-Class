/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

/**
 *
 * @author JONATHAN
 */
import java.rmi.*;
import java.rmi.server.*;
public class SearchQuery extends UnicastRemoteObject implements Search
{
    SearchQuery() throws RemoteException
    {
        super();
    }
    
    // Implementation of the query interface
    public String query(String search) 
            throws RemoteException
    {
        String result;
        if (search.equals("Reflection in Java"))
            result = "Found";
        else
            result = "Not Found";
        return result;
    }
}
