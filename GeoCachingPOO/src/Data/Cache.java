
package Data;

import Exceptions.CacheNaoSuportaFuncionalidadeException;
import Exceptions.DificuldadeInvalidaException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;



/**
 *
 * @author Rafael Antunes
 * @author Nuno Oliveira
 * @author Rui Pereira
 */
public abstract class Cache {
    
    private String ref;
    private Coords coords;
    private HashSet<String> assinantes;
    private String descricao;
    private int dificuldade;
    
}
