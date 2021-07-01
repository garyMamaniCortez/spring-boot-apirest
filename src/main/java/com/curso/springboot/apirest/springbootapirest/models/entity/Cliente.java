package com.curso.springboot.apirest.springbootapirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table( name="clientes" )
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    //si no se hara ninguna restriccion, o cambiara el nombre
    //de la columna no es necesario poner @Column
    //esto aplica tambien a @Table
    private String nombre;
    private String apellido;
    private String email;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @PrePersist
    public void prePersist(){
        createAt= new Date();
    }
    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getEmail(){
        return email;
    }

    public Date getCreateAt(){
        return createAt;
    }

    public void setId(Long id){
        this.id=id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void setEmail(String email){
        this.email=email;
    }
    
    public void setCreateAt(Date createAt){
        this.createAt=createAt;
    }

    private static final long serialVersionUID= 1L;
}
