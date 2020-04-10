package main

import "fmt"

// anonymous function that returns a closure func of signature func(i int) int
func increment() func(i int) int {
	sum := 0

	// closure func that returns an int
	return func(i int) int {
		sum += i
		return sum
	}
}

func main() {

    // Example 1: closure is an anonymous function that references variables declared outside its own declaration.
	i := 0
	foo := func() int {
		i += 10
		return i
	}
	fmt.Println(foo())  // Prints 10
	fmt.Println(foo())  // Prints 20

	// Example 2: A closure can also be returned by a function (increment()). Here the returned function is said to “close over” the variable sum.
	var foo1 = increment()
	for i:=0; i<=4; i++ {
		fmt.Println(foo1(i))   // O/P:  0 1 3 6 10
	}

	fmt.Println("foo2 gets its own copy of closure func and hence has its own copy of sum")
	var foo2 = increment()
	fmt.Println(foo2(2))       // O/P: 2

}
