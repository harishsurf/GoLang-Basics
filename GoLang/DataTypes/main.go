package main

import "fmt"

// Playground for different ways of using datatypes
func main() {

	// The datatype specified at the end is applicable to all variables
	var a, b int
	fmt.Printf("a: has value %v with type %T, b: has value %v with type %T\n", a,a,b,b) // output: a: has value 0 with type int, b: has value 0 with type int


	var c byte = 't'
	var r rune = 't'
	fmt.Printf("c: %c with type %T, r: %c with type %T\n",c,c,r,r) // output: c: t with type uint8, r: t with type int32

}
