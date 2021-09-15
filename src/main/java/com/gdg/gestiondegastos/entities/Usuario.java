
package com.gdg.gestiondegastos.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    private String contrasenya;
    private String telefono;
    private String correo;
    
    
    //Uniones de Tablas
    
    //(Envia el id a UsuarioGrupo)
    @OneToMany(mappedBy = "usuario")
    private List<UsuarioGrupo> usuarioGrupo;
    
    
}