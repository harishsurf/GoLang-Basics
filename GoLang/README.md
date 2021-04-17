#### Go is a statically typed, compiled programming language designed at Google

- Go supports pointers
- Go has only pass by value ([see here](goinbigdata.com/golang-pass-by-pointer-vs-pass-by-value/))

## Go commands

`go [command] <file>`

- `go build` - compile and generate binary in the same directory
- `go install` - compile, generate binary and move it `$GOPATH/bin`
- `go run` - compile and execute binary
- `go vet` - report likely mistakes in packages
- `go fmt` - gofmt (reformat) package sources

### For Loops

```sh
// 1
for j := 7; j <= 9; j++ {
    fmt.Println(j)
}

// 2
for i <= 3 {
    fmt.Println(i)
    i = i + 1
}

// 3
for {
    fmt.Println("executed once")
    break
}

```

### Switch

```sh
// 1
switch i {
  case 1:
    fmt.Println("one")
  case 2,3:
    fmt.Println("two")
}

// 2 - without condition
switch {
    case t.Hour() < 12:
        fmt.Println("It's before noon")
}

// 3 - compare types
switch t := i.(type) {     // i.(type) can only be used with switch
    case bool:
        fmt.Println("I'm a bool")
    case int:
        fmt.Println("I'm an int")
    default:
        fmt.Printf("Don't know type %T\n", t)
}
```

### if/else

```sh
if 7%2 == 0 {
    fmt.Println("7 is even")
} else {
    fmt.Println("7 is odd")
}

// 2  - If with variable initialized before the condition
if num := 9; num < 0 {
    fmt.Println(num, "is negative")
} else if num < 10 {
    fmt.Println(num, "has 1 digit")
} else {
    fmt.Println(num, "has multiple digits")
}


```
