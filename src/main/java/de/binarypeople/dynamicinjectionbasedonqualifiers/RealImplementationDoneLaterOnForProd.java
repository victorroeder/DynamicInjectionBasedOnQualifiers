package de.binarypeople.dynamicinjectionbasedonqualifiers;

/**
 *
 * @author Victor
 */
@TestOrProdEnvironment(TestOrProdEnvironment.ImplementationType.PROD)
public class RealImplementationDoneLaterOnForProd implements ServiceInterfaceThatWillBeImplementedForADummyAndARealScenario {

    @Override
    public void thisIsTheFirstMethodDoingSomething() {
        
        // this is the real stuff here
        
    }
    
}
