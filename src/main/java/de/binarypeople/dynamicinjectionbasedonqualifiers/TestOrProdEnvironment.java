package de.binarypeople.dynamicinjectionbasedonqualifiers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 *
 * @author Victor
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TestOrProdEnvironment {
    
    ImplementationType value();
    
    enum ImplementationType {
        
        TEST, PROD;
        
    }
    
}
