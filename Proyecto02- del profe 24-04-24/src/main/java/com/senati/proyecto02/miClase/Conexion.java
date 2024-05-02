/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto02.miClase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Efrain
 */
public class Conexion {


public Connection conectar=null;
public ResultSet rs=null;
public Statement st=null;
public PreparedStatement pst=null;

String usuario="root";
String password="1234";
String puerto="3306";
String BDD="northwind";
String ip="localhost";
String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+BDD;




public Connection obtenerConexion(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection(cadena, usuario, password );

					
	
//	JOptionPane.showMessageDialog(null,"se conecto correctamente");
    }catch(ClassNotFoundException|SQLException vv){
	JOptionPane.showMessageDialog(null,vv.toString(),"mensaje",0);
}

	return conectar;
}
}


	

