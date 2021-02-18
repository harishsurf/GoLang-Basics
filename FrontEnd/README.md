### Javascript

#### Variables

- `var`, `let`, `const`: https://www.freecodecamp.org/news/var-let-and-const-whats-the-difference/
- variable types - https://javascript.info/types

  - **Primitive types:** number, string, boolean, null, undefined
  - **Reference types:** object, array, function
  - `let age = null` - `null` is a special value which represents “nothing”, “empty” or “value unknown”.
  - `null` vs `undefined` - `null` needs to be explicitly assigned to a variable, where as when a variable is declared and not defined it takes the value of `undefined`
  - ```sh
     let age
     typeof age  // undefined - is “value is not assigned”.
    ```
  - **Arrays**:

    - `let arr = ['Hi', 'world', 1]`
    - arr can have different value types
    - the size can be dynamic. Ex: `arr[3] = 4` makes `arrays.length === 4`
    - `typeof arr` // object
    - Alternative way of declaring array using `new`: `let names = new Array('bob', 'jack')`
    - 2D array: `let multiArray = [[1,2,3], [4,5,6]]`
    - All array operations : https://medium.com/better-programming/the-complete-guide-to-using-arrays-in-javascript-c77f1abab50e
      - `const nums = [1,2,3,4]`
      - **forEach** : `nums.forEach(n => console.log(n))`
        - You cannot break out of `forEach`
        - DOES NOT return a value
      - **map(mapFunction)** : `const newArray = nums.map(n => n*2)`
        - returns a new array which transforms the existing array’s element using the map function
      - **find** : `const num = nums.find( n => n == 1)`
        - returns a single element in the array matching the condition otherwise `undefined`
      - **findIndex** : `const index = nums.findIndex( n => n == 2)`
        - returns index of element in the array matching the condition otherwise `-1`
      - **filter** : `const[] filteredNums = nums.filter( n => n == 1)`
        - returns a **new** array with elements matching the condition otherwise returns `[]`
      - **includes** : `const isPresent = nums.includes(3)`
        - returns boolean
      - **some** : `const bool = nums.some( n => n == 1)`
        - returns `true` if some items match the condition
      - **every** : `const bool = nums.every( n => n == 1)`
        - returns `true` only if all the elements in the array match the condition
      - **Array.isArray()** : `const bool = Array.isArray(nums)`
        - checks if an object given is an array
      - **reduce(a,b)** : `const sum = arr.reduce((a,b)=>a+b)`
        - takes two arguments - current and next element in the array
        - returns a single value by combining all the elements using the reduce function
    - **Splice vs Slice**

      - `Splice(idx [, no.OfElements to remove [, new items to be added]])`

        - removes elements from given `idx` and returns the removed elements as a new array object
        - MODIFIES the original array
        - if 2nd argument is specified, it only removes those many elements from the given `idx`
        - if no elements are removed `[]` is returned

        ```
        // 1
        let nums = [1,2,3,4,5];
        let splicedArray = nums.splice(1);
        console.log(splicedArray);   // [2,3,4,5]
        console.log(nums);           // [1]

        // 2
        let nums = [1,2,3,4,5];
        let splicedArray = nums.splice(1,2);
        console.log(splicedArray);   // [2,3]
        console.log(nums);           // [1,4,5]
        ```

    - `Slice([startIdx [, endIdx]])`
      - returns the selected elements in an array, as a new array object
      - **slice does not alter the original array**
      - If `startIdx` is undefined, slice starts from the index 0
      - If `endIdx` is omitted, slice extracts through the end of the sequence
      - slice extracts up to but not including `endIdx`.
        Ex: `slice(1,4)` extracts the second element through the fourth element
      - A negative index can be used, indicating an offset from the end of the sequence - Ex: `slice(-2)` extracts last two elements
      -

  - **Functions**
    - no type is specified for function args
    - can return 0 or 1 value
    - Functions always return a value. In JavaScript, if no return value is specified, the function will return `undefined`.
    - Different kinds: https://codeburst.io/javascript-functions-understanding-the-basics-207dbf42ed99
      1. Function Expression:
         ```sh
         let myFunc = function (params) {
             console.log("this is a Function Expression");
         }
         ```
      2. Arrow function: shorter syntax for writing Function Expression
         ```sh
         let myfunc = (params) => {
             console.log("this is Arrow function");
         }
         ```
         Note: If the function defn is only one line, then : `let myFunc = (params) => console.log("arrow func")`
         and if no params, then `let myFunc = () => console.log('Hi')`

#### Operator Precendence

- Unlike other languages, JS allows non-boolean expression when using logical operators.
- Falsy values in JS: `false`, `null`, `""` (empty string), `0`, `NaN`, undefined
- Example:
  - `false || null || "" || 0 || NaN || "Hello" || undefined` // "Hello"
  - `1 && [] && {} && true && "World" && null && 2010` // null
- Reference: https://stackoverflow.com/a/3088498

### Typescript

- Crash course: https://www.youtube.com/watch?v=NjN00cM18Z4&t=400s
- Superset of Javascript (Any valid JS code is a valid TS code)
- Features: Strong typing, Object-oriented features, Compile-time errors
- Transpiler : `$ tsc <file.ts>` : compiles & converts a `<file>.ts` to a valid `<file.js>` file
- main.ts :
  ```sh
   let count = 2
   count = 'A' // valid in JS, but not in TS since `count` was declated to be number
  ```

#### Basic Types

- Same datatypes as JS + enumeration + Interface
- Enumeration:
  ```sh
  enum Color {Red, Blue, Green}; // are assigned default values 0,1,2
  let bgColor = Color.Red;
  ```
  It's good practice to initialize values and not rely on defaults: `enum Color {Red=0; Blue=1; Green=2}`
- `any` : typescript keyword which refers to anything
- Explictly specify types during declaration:
  ```sh
  let a:number;
  let b:boolean;
  let c:string;
  let d:any;
  let e:number[];
  let f:string[] = ['Hi', 'asd']
  let g:any[] = [1, 'a', true]
  ```
- https://www.typescriptlang.org/docs/handbook/basic-types.html

#### Type Assertion

- Used to make ts compiler aware of the variable's datatype (Note: It doesn't do type conversion)
- ```sh
    let message; // type is `any`
    message = 'abc';
    let endsWithC = (<string>message).endsWith('c');  // this is used more
    // or
    let alternativeWay = (message as string).endsWith('c');
  ```

#### Classes & Interfaces

- 21:05 - https://www.youtube.com/watch?v=NjN00cM18Z4&t=400s
- Access modifiers: `private`, `protected`, `public`
- `?` is for optional. Usage: `constructor(private _x?: number, private y?: number) { }`
- `_` is used as a field naming convention inside a class to differentiate class variables from setter and getter method names

#### Type Aliases

- Type aliases create a new name for a type

```sh
type Second = number;

let timeInSecond: number = 10;
let time: Second = 10;
```

- https://www.typescriptlang.org/docs/handbook/advanced-types.html#type-aliases

### Patternfly

- https://www.katacoda.com/patternfly

### React

- Mosh - https://www.youtube.com/watch?v=Ke90Tje7VS0
- React Lifecycle of Components: https://www.w3schools.com/react/react_lifecycle.asp

Things to remember:

- To use `state` variables inside of a method (say, a handler()), we need to bind the method to `this`. We could do this in 2 ways:
  1. Arrow function: `onChangeHandler () => { }` OR
  2. Binding the function with `this` **inside** the constructor: `this.onChangeHandler = this.onChangeHandler.bind(this)`
- `this.setState(updater, [callback])` : https://reactjs.org/docs/react-component.html#setstate

#### JSX in depth (includes props)

- https://reactjs.org/docs/jsx-in-depth.html
- Props:
  - `Props` Everything (A must read!) - https://medium.com/@cristi.nord/props-and-how-to-pass-props-to-components-in-react-part-1-b4c257381654
  - `Props` are only passed from parent to child component. They are readonly! where as `state` variables can be modified.
    Note: Whenever `state` or `props` change, the component is re-rendered automatically.
- PropTypes: https://reactjs.org/docs/typechecking-with-proptypes.html

#### React Hooks

- `useState` and `useEffect` example: https://www.youtube.com/watch?v=d9Pndaq9MJs
- https://reactjs.org/docs/hooks-reference.html

### React+TypeScript Cheatsheets

- https://github.com/typescript-cheatsheets/react

### Redux

- https://www.youtube.com/watch?v=9boMnm5X9ak&list=PLC3y8-rFHvwheJHvseC3I0HuYI2f46oAK

### Webpack

- https://medium.com/better-programming/webpack-4-the-complete-guide-af1b1e2e3f7a

### npm vs npx vs yarn

- `npm`
  - Node Package Manager: enables developers to share their packages or to install packages that were built by some other developers. Syntax: `npm install <package>`
- `npx`
  - npm package runner: Npx will search for that package in the local and global registry. Instead of installing (like npm), it will run that package. It is used as an experiment to decide if you want to install the package
- `yarn`
  - Yarn is the latest package manager like npm with additional capabilities
  - Yarn is faster than npm because when installing multiple packages npm installs them one at the time
    while yarn is installing them concurrently.
