## Intro

* Syntax : 
```sh
  var x int
  var p *int  // declaring a pointer
  p = &x      
```

* Shorthand :
```sh
  p := &x
```

* Pointers zero value is `nil`

* Pointer to structs:
```shell script
    type Emp struct {
      Name string    
      Age int
    } 

    func main() {
      var p = &Emp{}      //  p is a pointer to an empty struct
      fmt.Println(p)      // o/p:  &{ 0}
  
      var p = &Emp{"Sam", 10}  // p is a pointer to non-empty struct
      fmt.Println(p)      //o/p: &{sam 10}

      var p = Emp{"Sam", 10}   //Not a pointer, but actual value
      fmt.Println(p)      //o/p: {sam 10}

       
      var p *Emp          // pointer of type struct Emp
      fmt.Println(p)      // o/p: <nil>

      var p &Emp          // Error: Pointer type cannot be an address
      var p = &Emp{}      // This is valid. Similar to `var x = 10`. Compiler assigns type based on value
      fmt.Println(p)      // o/p:  &{ 0}   - name's default is "" and for int, it is zero
 
      
    } 
```

