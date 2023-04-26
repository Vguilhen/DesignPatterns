package org.example;

import org.example.facade.Facade;
import org.example.simgleton.SingletonEager;
import org.example.simgleton.SingletonLazy;
import org.example.simgleton.SingletonLazyHolder;
import org.example.strategy.*;

public class Main {
    public static void main(String[] args) {
        //testando os design patterns
        //não é possível instanciar o lazy utlizando o "new", é preciso acessar pelo método get da classe
        // SingletonLazy lazy = new SingletonLazy();
        SingletonLazy lazy = SingletonLazy.getInstance();
        //verificar o endereço de memória
        System.out.println(lazy);
        //se pegar uma nova instância ele deverá retornar a mesma ou seja o mesmo endereço de memória
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        //verificar o endereço de memória
        System.out.println(eager);
        //se pegar uma nova instância ele deverá retornar a mesma ou seja o mesmo endereço de memória
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);


        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Veneclinton", "080050005");

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


    }
}