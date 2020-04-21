package main

import (
"fmt"
"time"
)

func f(from string) {
	for i := 0; i < 3; i++ {
		fmt.Println(from, ":", i)
	}
}

func main() {

	f("direct")

	go f("goroutine")

	go func(msg string) {
		fmt.Println(msg)
	}("going")

	time.Sleep(time.Second)
	fmt.Println("done")
}


//  Output:  When we run this program, we see the output of the blocking call first, then the interleaved output of the two goroutines.
//  This interleaving reflects the goroutines being run concurrently by the Go runtime.
//	direct : 0
//	direct : 1
//	direct : 2
//	goroutine : 0
//	goroutine : 1
//	going
//	goroutine : 2
//	done
