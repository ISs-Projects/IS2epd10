/*
 * Persistencia.java
 *
 * Created on 29 de octubre de 2007, 15:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package modelo.persistencia.JDBC;

import java.sql.*;
/**
 *
 * @author Norberto D�az-D�az
 */
public class Persistencia {
        // XAMPP
    private static String login = "root";
    private static String password = "";
//    
    // COMMUNITY
//    private static String login = "root";
//    private static String password = "root1234";

    private static String url = "jdbc:mysql://192.168.1.140:3306/facturacion?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    
    private static Connection conexion=null;
    
    /**
     * La apertura de la conexi�n es implementada seg�n el patr�n singleton
     * De esta forma, a lo sumo, tendremos una s�la conexi�n abierta en la aplicaci�n
     */
    public static Connection createConnection(){
        if (conexion==null){
            try{
//                Class.forName("com.mysql.jdbc.Driver").newInstance();
                
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conexion=DriverManager.getConnection(url,login,password);
            }catch(ClassNotFoundException e){System.out.println(e);
            }catch(SQLException e){System.out.println(e);
            }catch(java.lang.InstantiationException e){System.out.println(e);
            }catch(java.lang.IllegalAccessException e){System.out.println(e);}
        }
        return conexion;
    }
    
    public static void closeConnection(){
        try{
            if(conexion!=null){
                conexion.close();
                conexion=null;
            }
        }catch(SQLException e){System.out.println(e);}
    }
    
}
