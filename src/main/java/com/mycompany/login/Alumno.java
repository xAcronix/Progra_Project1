/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;

/**
 *
 * @author mint
 */
public class Alumno {
    public static String carne;
    public String nombre;
    public String apellido;
    public static String password;
    
    public Alumno (String Carne, String Nombre, String Apellido, String password) {
        this.carne = Carne;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.password = password;
    }
    
    public static boolean IngresoAlumno(String carne, String password){
        boolean encontrado = false;
        for(Alumno p : Login.AlumnoList){
            if(p.carne.equals(carne) && p.password.equals(password)){
               encontrado = true;
            }
        }
        return encontrado;
    }  
}