/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gofsingleton;

/**
 *
 * @author Friends com
 */
public class DatabaseConnectionManagerInstance {

DatabaseConnectionManager connection1 =DatabaseConnectionManager.getInstance();
connection1.executeQuery("Select from query");
DatabaseConnectionManager connection2 =DatabaseConnectionManager.getInstance();
connection2.executeQuery("Select from query");
if(connection1==connection2)




}
