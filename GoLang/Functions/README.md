## TODO Links: 

* https://blog.learngoprogramming.com/go-functions-overview-anonymous-closures-higher-order-deferred-concurrent-6799008dde7b


* https://golang.org/doc/codewalk/functions/

## Variadic Functions
* The last parameter of a function can be a variadic parameter.
* Each function can have at most one variadic parameter.
* The type of a variadic parameter is always a slice type.
* To indicate the last parameter is variadic, just prefix three dots `...` to the element type of its (slice) type in its declaration
```shell script
func (values ...int64) (sum int64)   // is equivalent to slice []int64
func (sep string, tokens ...string) string
func Println(a ...interface{}) (n int, err error)  // here a is slice []interface{}
```
* Function call for a variadic function is either passing a slice or actual `,` separated arguments
```shell script
// Variadic function
func Sum(values ...int64) (sum int64) {  
}

// Function call 
a0 := Sum()
a1 := Sum(2)
a3 := Sum(2, 3, 5)
// The above three lines are equivalent to
// the following three respective lines.
b0 := Sum([]int64{}...) // <=> Sum(nil...)
b1 := Sum([]int64{2}...)
b3 := Sum([]int64{2, 3, 5}...)
```

## Anonymous functions

* Anonymous functions are functions without names - see `anonymous.go`


## Closure functions
* A closure is anonymous function that references variables(non-local) declared outside its own declaration.
* The returned anonymous function closes over the non-local variable to form a closure.
* In other words, a closure is an instance of a function, a _value_, whose non-local variables have been bound to the _value_

#### References: 
https://tour.golang.org/moretypes/25
https://levelup.gitconnected.com/anonymous-functions-and-closures-in-go-e53ccccad352 


## `defer` keyword

* postpones the execution of a function until the surrounding function returns, usually for purposes of cleanup.(Similar to `finally` in Java) 
* Syntax: `defer <has-to-be-a-func>` 
* It follows LIFO order. See below example: 
```shell script
func main() {
    fmt.Println("Hello")
    for i := 1; i <= 3; i++ {
        defer fmt.Println(i)
    }
    fmt.Println("World")
}
O/P:
Hello
3
2
1
World
```
* defer calls are executed even if the function `panic`
* `defer nil` panics

#### References:
https://blog.learngoprogramming.com/gotchas-of-defer-in-go-1-8d070894cb01


## Functions with `interface{}` as parameter
* If you see a function or a method that expects an empty interface, then you can typically pass anything into this function/method.
```shell script
func myFunc(a interface{}) {
    fmt.Println(a)
}

func main() {
    var my_age int
    my_age = 25

    myFunc(my_age)  // O/P: 25
}
```