## References

https://medium.com/rungo/structures-in-go-76377cc106a2

## Empty Structs
- An empty struct (`struct{}`) can be used every time you are only interested in a property of a data structure rather than its value
```shell script
var myMap map[int]struct{} // here the value is empty struct since we only care about the key
```
Example: Converting slice `[]int` to `map[int]struct{}` to allow faster searching `O(1)` instead of `O(n)`
### https://medium.com/@l.peppoloni/how-to-improve-your-go-code-with-empty-structs-3bd0c66bc531#:~:text=An%20empty%20struct%20is%20a,this%20post%20by%20Dave%20Chaney.


## Non-struct types
```shell script
type MyString string
type MyInt int
```
- They are more like aliases for primitives so as to allow them to be used as receivers for methods
- Usage: 
```shell script
func(r MyString) myMethod() {
}
or
func(i MyInt) myMethod(){
}
```