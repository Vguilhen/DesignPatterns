package org.example.simgleton;

public class SingletonLazy {

    //Criamos uma instância do prórpio singleton
    private static SingletonLazy instance;

    //Para garantir que ninguém externamente irá instanciar esse singleton? tornando-o privado;
    private SingletonLazy(){
        //deixando a chamada do contrutor da casse pai ex   plícito (opicional)
        super();
    }

    //para garantir que essa instância vai ser exposta de alguma forma eu posso criar um método público

    public static SingletonLazy getInstance(){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
