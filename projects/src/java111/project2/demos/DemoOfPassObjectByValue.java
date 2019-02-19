/**
 *  This class demonstrates passing objects as values
 *
 *@author    eknapp
 */
public class DemoOfPassObjectByValue {

    Dog  instanceDog  = new Dog();

    /**
     *  This method demos pass by value for objects.
     *
     *@param  parameterDog A new Dog object
     */
    void go(Dog parameterDog) {

        System.out.println("value of instanceDog: " + instanceDog.getSize());
        System.out.println("value of parameterDog: " + parameterDog.getSize());

        parameterDog.setSize(10);

        System.out.println("value of instanceDog: " + instanceDog.getSize());
        System.out.println("value of parameterDog: " + parameterDog.getSize());

        instanceDog = new Dog();
        System.out.println("value of instanceDog after creating new instance: " + instanceDog.getSize());

    }

    /**
     *  Main processing method for the DemoOfPassObjectByValue object.
     */
    void run() {
        instanceDog.setSize(20);
        go(instanceDog);
    }
}
