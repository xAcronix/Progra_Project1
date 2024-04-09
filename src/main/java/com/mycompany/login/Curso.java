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
    private static ArrayList<Alumno> AlumnoList = new ArrayList<>();
    private String nombreCurso;
    private String idCurso;
    private String seccionCurso;
    private String fechaInicio;
    private String fechaFin;
    private String horaInicio;
    private String horaFin;
    private String profesorSeleccionado;
    


    /**
     * @return the AlumnoList
     */
    public static ArrayList<Alumno> getAlumnoList() {
        return AlumnoList;
    }

    /**
     * @param aAlumnoList the AlumnoList to set
     */
    public static void setAlumnoList(ArrayList<Alumno> aAlumnoList) {
        AlumnoList = aAlumnoList;
    }

    /**
     * @return the nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the nombreCurso to set
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the idCurso
     */
    public String getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the seccionCurso
     */
    public String getSeccionCurso() {
        return seccionCurso;
    }

    /**
     * @param seccionCurso the seccionCurso to set
     */
    public void setSeccionCurso(String seccionCurso) {
        this.seccionCurso = seccionCurso;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * @return the profesorSeleccionado
     */
    public String getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    /**
     * @param profesorSeleccionado the profesorSeleccionado to set
     */
    public void setProfesorSeleccionado(String profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }
        
        
}