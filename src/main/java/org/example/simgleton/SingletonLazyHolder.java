package org.example.simgleton;

public class SingletonLazyHolder {
    //a classe holder só tem a função de encapsular o holder
    public static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
        private SingletonLazyHolder() {
            super();
        }

    //não verifica se a instância é nula
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
