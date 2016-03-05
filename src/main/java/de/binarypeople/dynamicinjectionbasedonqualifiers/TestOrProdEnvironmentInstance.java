package de.binarypeople.dynamicinjectionbasedonqualifiers;

import de.binarypeople.dynamicinjectionbasedonqualifiers.TestOrProdEnvironment.ImplementationType;
import java.lang.annotation.Annotation;

/**
 *
 * @author Victor
 */
public class TestOrProdEnvironmentInstance implements TestOrProdEnvironment {
    
    ImplementationType type;
    
    public TestOrProdEnvironmentInstance(ImplementationType type) {
        
        this.type = type;
        
    }

    @Override
    public ImplementationType value() {
        
        return this.type;
        
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        
        return TestOrProdEnvironment.class;
        
    }
    
    
    
    
}
