package Singleton;


import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

public class Singleton {

    private static Logger log = Logger.getLogger(Singleton.class.getName());
    public static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
     public IClass getClassName(Class className){
         IClass instance = null;
         try {
              instance = (IClass) className.getDeclaredConstructor().newInstance();
         } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
             e.printStackTrace();
         }
         log.info(instance.getClass().getSimpleName());
         return instance;
     }
}

