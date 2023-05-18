# Implement the code in 'MoneyHelper'

There are two functions: addAll and split

There are tests describing the behaviour and the tests should be green at the end

## Remember

* Money is an example of a TypeClass.
  * It is probably a new 'pattern' to you
  * Money<Integer> is the 'typeclass' for 'how we implement Money for integer'
* MoneyHelper is also a TypeClass
  * It can add up and split money no matter what type of object we use to implement money

## Take a look at

The tests. Note how there is an abstract test for the TypeClass, and then each implementation of it is really simple to test

## For extra points

* Implement Money for Wallet
  * Wallet is a collection of currencies. 
  * A wallet can hold '15 euros + 10 dollars'
* Write the tests for the type classes for Wallet