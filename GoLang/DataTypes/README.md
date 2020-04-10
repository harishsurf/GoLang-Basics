# Data Types
There are **4** distinct categories of types within the Go programming language:

## 1. Basic Types 

* Numeric Types
	* int8, int16, int32, int64, int
	* uint8, uint16, uint32, uint64, uint
	* float32, float64
	* complex64, complex128
	* byte
	* rune
* bool
* string

### Integer
* They can be signed (int8, int16, int34, int64) or unsigned (uint8, uint16, uint32, uint64) and uintptr (don't use! Used mostly in implementing go libraries, garbage collections)
* Default: `var x int = 34`  // It assigns 32 or 64 bit based on 32/64 bit system
* Conversion: `int(data_type)`
```sh
var a float32 = 3.4
fmt.Println(int(a))  //outputs 3
```

### Floating point

```sh
var a float32
var b float64

a, b := 5.67, 8.97   // this is allowed too
```
* Conversion: `float32(4)`

### Complex Numbers
* complex64: complex numbers which have float32 real and imaginary parts
* complex128: complex numbers with float64 real and imaginary parts
* built-in complex(r,i) can be used to initialize a complex number. Its func definition is `func complex(r, i FloatType) ComplexType`

```sh
c1 := complex(5, 7)
c2 := 8 + 27i
```

### byte & rune

* `byte` and `rune` are aliases for uint8 and int32 data type used to distinguish **characters** from integer values.
* `byte` represents ASCII 
* `rune` represent broader set of Unicode characters that are encoded in UTF-8 format.
* Note: default type for character values is `rune`  

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
## 3. Reference Types - These are your pointers and slices
## 4. Interface Types - These are your standard interfaces


## Miscellaneous

* variable can be a `func()` type
```shell script
var a func()
fmt.Printf("Type: %T, Value: %v\n", a,a)  // outputs: Type: func(), Value: <nil>
```
