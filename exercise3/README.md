# Simple FP examples

Earlier we had three exercises: one for integers, one for doubles, one for strings.

This is how we can do it for 'T'. i.e. we can abstract it so that we can use the same code for integers, doubles and strings

## Remember

* We are working with higher order functions here
  * A higher order function either takes a function as an argument or returns one

## Take note of

* The tests
  * We have abstract tests and we can extend them for each T
  * This makes it really easy to check that we can use this code on a particular T
* The code
  * In the 'add' example we are passing in the 'typeclass' adder. Later we will learn how to hide this a little better.