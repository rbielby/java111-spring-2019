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

        System.out.println("value of instanceDog: " + instanceDog.size);
        System.out.println("value of parameterDog: " + parameterDog.size);

        parameterDog.size = 10;

        System.out.println("value of instanceDog: " + instanceDog.size);
        System.out.println("value of parameterDog: " + parameterDog.size);

        instanceDog = new Dog();
        System.out.println("value of instanceDog after creating new instance: " + instanceDog.size);

    }

    /**
     *  Main processing method for the DemoOfPassObjectByValue object.
     */
    void run() {
        instanceDog.size = 20;
        go(instanceDog);
    }
}
