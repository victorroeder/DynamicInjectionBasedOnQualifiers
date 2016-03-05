package de.binarypeople.dynamicinjectionbasedonqualifiers;

import de.binarypeople.dynamicinjectionbasedonqualifiers.TestOrProdEnvironment.ImplementationType;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Victor
 */
public class IsItTestOrProdEnvironmentDecider {
    
    @Produces
    public ImplementationType decideWhetherWeAreOnTestOrProd() {
        
        // read database or text file or hostname to find out whether we are running in test or prod env
        // ... using fix TEST for now :)
        return ImplementationType.valueOf("TEST");
        
    }
    
}
