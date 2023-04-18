package org.example.simgleton;

public class SingletonEager {
    //no momento em que a variável estática é definida  ele já atribui a instância
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){
        super();
    }
    //não verifica se a instância é nula
    public static SingletonEager getInstance(){
        return instance;
    }
}