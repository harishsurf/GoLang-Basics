package main

import "fmt"

func main() {

	// example 1
	foo := func() {
		fmt.Println("This is an anonymous function assigned to a variable")
	}
	foo()

	// example 2
	func() {
		fmt.Println("Anonymous function called immediately")
	}()

	//example 3
	message := "This is an anonymous func which takes an arg and assigns it to a variable"
	x := func(m string) {
		fmt.Println(m)
	}
	x(message)

	//example 4
	msg := "This is an anonymous func which takes an arg and executes inline"
	func(m string) {
		fmt.Println(m)
	}(msg)


}
