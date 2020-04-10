


## TODO Links: 

* https://blog.learngoprogramming.com/go-functions-overview-anonymous-closures-higher-order-deferred-concurrent-6799008dde7b


* https://golang.org/doc/codewalk/functions/


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