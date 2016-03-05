package de.binarypeople.dynamicinjectionbasedonqualifiers;

import de.binarypeople.dynamicinjectionbasedonqualifiers.TestOrProdEnvironment.ImplementationType;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author Victor
 */
@Model
public class Index {
    
    @Inject
    @Any
    Instance<ServiceInterfaceThatWillBeImplementedForADummyAndARealScenario> implementations;
    
    @Inject
    ImplementationType type; // ... fix "TEST" as for now... look up IsItTestOrProdEnvironmentDecider where to add the concrete decision making
    
    public String howToUseTheServiceImplementation() {
        
        String infoWhichImplementationIsUsed = "";
        
        
        // easy way: if there is one and *only one* TEST implementation
        ServiceInterfaceThatWillBeImplementedForADummyAndARealScenario testImplementation = implementations.select(new TestOrProdEnvironmentInstance(type)).get();
        infoWhichImplementationIsUsed += " - " + testImplementation.getClass().getName();
        testImplementation.thisIsTheFirstMethodDoingSomething();
        
        
        // maybe way (not considered here): in case there are more than on TEST implementations
//        for(ServiceInterfaceThatWillBeImplementedForADummyAndARealScenario currentImpl : implementations.select(new TestOrProdEnvironmentInstance(type))) {
//            
//            currentImpl.thisIsTheFirstMethodDoingSomething();
//            
//            infoWhichImplementationIsUsed += " - " + currentImpl.getClass().getName();
//            
//        }
        
        
        return infoWhichImplementationIsUsed;
        
    }
    
}
