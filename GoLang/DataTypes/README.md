# Data Types

There are **4** distinct categories of types within the Go programming language:

## 1. Basic Types

- Numeric Types
  - int8, int16, int32, int64, int
  - uint8, uint16, uint32, uint64, uint
  - float32, float64
  - complex64, complex128
  - byte
  - rune
- bool
- string

#### Integer

- They can be signed (int8, int16, int34, int64) or unsigned (uint8, uint16, uint32, uint64) and uintptr (don't use! Used mostly in implementing go libraries, garbage collections)
- Default: `var x int = 34` // It assigns 32 or 64 bit based on 32/64 bit system
- Conversion: `int(data_type)`

```sh
var a float32 = 3.4
fmt.Println(int(a))  //outputs 3
```

#### Floating point

```sh
var a float32
var b float64

a, b := 5.67, 8.97   // this is allowed too
```

- Conversion: `float32(4)`

#### Complex Numbers

- complex64: complex numbers which have float32 real and imaginary parts
- complex128: complex numbers with float64 real and imaginary parts
- built-in complex(r,i) can be used to initialize a complex number. Its func definition is `func complex(r, i FloatType) ComplexType`

```sh
c1 := complex(5, 7)
c2 := 8 + 27i
```

#### byte & rune

- `byte` and `rune` are aliases for uint8 and int32 data type used to distinguish **characters** from integer values.
- `byte` represents ASCII
- `rune` represent broader set of Unicode characters that are encoded in UTF-8 format.
- Note: default type for character values is `rune`

```sh
 my_rune := 'a'  //default
 my_byte := byte('b')

 var a byte = 't'
 var r rune = 't'
```

### Boolean

```sh
var a bool = true
var b bool = flase
```

### String

```sh
var s string = "Hello"
```

###

## 2. Aggregate Types - These are arrays and structs

#### Arrays

- Arrays can store **fixed-size** sequential collection of elements of the same type.

```sh
var a [5]int
var b = [2]string{"Hi", "aa"}
c := [5]string
d := [2][3]int { {1,2,3} , {4,5}}   // outputs: [[1 2 3] [4 5 0]]
```

- `e := [...]int{n4, n5, n6}` - use `…` to replace the length parameter and Go will calculate it for you.
- `len(a)` gives length of array

#### Structs

- Go’s structs are typed collections of fields.

```sh
type person struct {
    name string
    age  int
}

s := person {name: "Sean", age: 50}
fmt.Println(s.name)

structPointer := &s   // pointer storing address of struct s
fmt.Println(structPointer.age) //  the pointers are automatically dereferenced.
```

## 3. Reference Types - These are your pointers and slices

#### Slices

- Slice are similar to array in Go but with Dynamic Size and richer capabilities
- Under the hood slice stores values in an array. It creates new array to accomodate more data
- Slices do not own any data on their own, they are just a reference to existing arrays
- [Zero value](https://tour.golang.org/basics/12) of slice is `nil`

```sh
var a = []int {1,2,3}
var b []int
c := []int {1,2}
```

- **Length & Capacity**
- Length is the no. of elements present in the slice. `len(s)`
- The capacity of a slice is the no. of elements it can hold `cap(s)`
- Capacity is no. of elements present in the underlying array(the array to which slice is referencing to) starting from the index from which the slice is created.
- Using make: `make([]T, len, cap)` - `cap` is optional, default is set to `len`
- When capacity is met, slice doubles its capacity. See example: https://stackoverflow.com/questions/41668053/cap-vs-len-of-slice-in-golang

- To create an empty slice with non-zero length, use the builtin make `s := make([]string, 3)` // size = 3
- **copy** slice

```sh
s :=[]int{1,2,3}
c := make([]int, len(s))
copy(c, s)
```

-**append**

- appends values to end of slice and returns the updated slice which MUST be reassigned to the same slice

```sh
s := []string{"a", "b", "c"}
s = append(s, "d", "e") // Note that the return value is reassigned to the slice s
fmt.Println(s)         // o/p: [a, b, c, d, e]
```

- Slices support a “slice” operator with the syntax slice[low:high].

```sh
l := s[2:5]   // returns slice from idx 2,3 & 4
l = s[:5]  	  // from 0 till idx 4
l = s[2:]  	  // from idx 2 till end
```

## 4. Interface Types - These are your standard interfaces

## Miscellaneous

- variable can be a `func()` type

```shell script
var a func()
fmt.Printf("Type: %T, Value: %v\n", a,a)  // outputs: Type: func(), Value: <nil>
```
