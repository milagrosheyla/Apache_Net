/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senati.proyecto_003.Clase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class conexion1 {
public Connection conectar=null;
public ResultSet rs=null;
public Statement st=null;
public PreparedStatement pst=null;

String usuario="root";
String password="1234";
String puerto="3306";
String BDD="Negocios";
String ip="localhost";
String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+BDD;




public Connection preparardb(){
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
