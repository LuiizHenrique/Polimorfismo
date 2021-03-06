package PolimInterface;

public class exemplo {

}
//Animal.java
package entidades;

public class Animal {

private String nome;

// opera›es
public void emitirSom() {

}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

}

//Cachorro.java
package entidades;

public class Cachorro extends Animal {

@Override
public void emitirSom() {
super.emitirSom();

System.out.println("Latindo...");
}

}

//Gato.java
package entidades;

public class Gato extends Animal {

@Override
public void emitirSom() {
super.emitirSom();

System.out.println("Miando...");
}

}


//PetShop.java
import entidades.Animal;
import entidades.Cachorro;
import entidades.Gato;


public class PetShop {

/**
* POLIMORFISMO (aula pratica - parte 2)
* 
* Objetivos:
* 
* 1) Entender o conceito de Polimorfismo na pratica
*    usando as classes definidas pelo usuario.
*    
*    - definicao de hierarquia classes
*    - implementacao de exemplos
* 
* @author Douglas Frari
* @see http://profdouglas.blogspot.com.br
*/


public static void main(String[] args) {

// criar dois objetos
Cachorro cachorro1 = new Cachorro();
Gato gato1 = new Gato();

Animal animal1 = gato1;

cachorro1.setNome("Totoh");
gato1.setNome("Lu");

cachorro1.emitirSom();
gato1.emitirSom();

// qual eh o metodo que serah usado? (cachorro ou gato)?
animal1.emitirSom();

animal1 = cachorro1;
animal1.emitirSom();




}

}

