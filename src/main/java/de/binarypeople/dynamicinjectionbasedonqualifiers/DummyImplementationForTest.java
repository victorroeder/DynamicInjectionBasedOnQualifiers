package de.binarypeople.dynamicinjectionbasedonqualifiers;

/**
 *
 * @author Victor
 */
@TestOrProdEnvironment(TestOrProdEnvironment.ImplementationType.TEST)
public class DummyImplementationForTest implements ServiceInterfaceThatWillBeImplementedForADummyAndARealScenario {

    @Override
    public void thisIsTheFirstMethodDoingSomething() {
        
        // this is just a first dummy implementation
        
    }
    
}
