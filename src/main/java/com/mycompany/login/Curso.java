/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;
import java.util.ArrayList;
/**
 *
 * @author mint
 */
public class Curso {
    public static ArrayList<Alumno> AlumnoList = new ArrayList<>();
    public String nombreCurso;
    public String idCurso;
    public String seccionCurso;
    public String fechaInicio;
    public String fechaFin;
    public String horaInicio;
    public String horaFin;
    public String profesorSeleccionado;
    
        public Curso (String nombreCurso, String idCurso, String seccionCurso, String fechaInicio, String fechaFin, String horaInicio, String horaFin, String profesorSeleccionado){
        this.nombreCurso = nombreCurso;
        this.idCurso = idCurso;
        this.seccionCurso = seccionCurso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.profesorSeleccionado = profesorSeleccionado;    
}
}