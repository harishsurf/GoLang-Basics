## Intro

***TODO: Type Definition, Type Aliasing ? *** 

It's used to define a new type.

General format:
`type <new_type> <existing_type or type_definition>`

### Common use cases:

* Create a new type for an existing type.

Format: `type <new_type> <existing_type>` <br/>
e.g
```sh
type Seq []int
```

* Create a type while defining struct.
Format:
`type <new_type> struct { /*...*/}` <br/>
e.g
```sh
type person struct {
    name string
    age  int
}
```

* Define function type, (aka. by assigning name to a function signature).
Format:
`type <FuncName> func(<param_type_list>) <return_type>` <br/>
e.g
```sh
type AdderFunc func(int, int) int
```