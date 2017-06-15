package demo

class Person {
    PersonService personService
    String name

    static transients = ['personService']

    String hi() {
        personService.sayHello(name)
    }

    static mapping = {
        autowire true
    }
}
