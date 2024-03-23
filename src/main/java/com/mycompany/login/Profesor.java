/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author mint
 */
public class Profesor {
    public String nombre;
    public String apellido;
    public String usuario;
    public static String password;
    
    public Profesor (String nombre, String apellido, String usuario, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
    }
    
    public static boolean IngresoProfesor(String Usuario, String Password){
        boolean encontrado = false;
        for(Profesor p : Login.ProfesorList){
            if(p.usuario.equals(Usuario) && p.password.equals(Password)){
               encontrado = true;
            }
        }
        return encontrado;
    }
}
