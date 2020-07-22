## Syntax:
```shell script
func (t Type) methodName(parameter list) {  
}
```
- The type here can be struct or non-struct type. Example of non-struct type: `type Mystring string`

## Reference
- https://golangbot.com/methods/


## Things to remember: 
- Methods with **_value_** receivers accept both pointer and value receivers. 
- Methods with **_pointer_** receivers will accept both pointer and value receivers. Note: This is not the case for pointer receivers for methods of an interface [Details here](https://golangbot.com/interfaces-part-2/)
In both cases, the value of the calling `type` can be dereferenced(*p) or passed address implicitly(&p) 

