package Data;

import java.time.LocalDate;
import java.util.HashMap;

import Exceptions.*;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Rafael Antunes
 * @author Nuno Oliveira
 * @author Rui Pereira
 */
public class User {

    private String mail;
    private String pw;
    private String nome;
    private String genero;
    private String morada;
    private LocalDate dn;
    private HashMap<String, User> amigos;
    private HashMap<String, User> pedidosAmigo; //users q querem ser amigos deste.
    

}    