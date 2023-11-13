package com.miempresa.lab12.DTO;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class formularioDTO {

    @NotBlank(message = "Campo obligatorio")
    private String nombre;

    @NotBlank(message = "Campo obligatorio")
    private String apellido;

    private String sexo;

    @Range(min=0, max = 100, message = "Ingrese una edad correcta")
    private int edad;

    @NotBlank(message = "Campo Obligatorio")
    @Size(min = 4, max = 8, message = "La longitud debe ser de 4 a 8")
    @Pattern(
        regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$",
        message = "La contraseña debe contener al menos un número, una letra y tener un tamaño mínimo de 6 caracteres."
    )
    private String clave;

    @NotBlank(message = "Campo Obligatorio")
    @Email(message = "Ingrese un correo válido")
    private String correo;
    private OpcionesSexo[] opcionesSexo;

    public formularioDTO(){

    }
    public formularioDTO(String nombre, String apellido, String sexo, int edad, String clave, String correo, OpcionesSexo[] opcionesSexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
        this.opcionesSexo = opcionesSexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public OpcionesSexo[] getOpcionesSexo() {
        return opcionesSexo;
    }

    public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
        this.opcionesSexo = opcionesSexo;
    }
}
