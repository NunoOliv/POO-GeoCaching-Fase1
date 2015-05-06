/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Nuno
 */
public class CacheNaoSuportaFuncionalidadeException extends Exception {
    String funcionalidade;
    String log = "Erro - Esta Cache nao suporta a funcionalidade";

}
