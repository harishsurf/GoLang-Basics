## Python

- Python is an Interpreted language. It uses the CPython Interpreter to compile the python code to byte code
- Python is dynamically typed - type checking is done at runtime
- Python supports inheritance (even multiple inheritance) - `def classC(A,B):`
- Python does not support pointers
- Python does not support interfaces
- Python does not support abstract classes. But there is a module/library called `Abstract Base Classes(ABC)` that allows this

```sh
from abc import ABC

class Polygon(ABC):
    # abstract method
    def noofsides(self):
        pass

class Triangle(Polygon):
    # overriding abstract method
    def noofsides(self):
        print("I have 3 sides")

# Driver code
R = Triangle()
R.noofsides()
```

- Python supports multiple inheritance

- Python uses:
  - Server-side development ( Django, Flask )
  - Data Science ( Pytorch, Tensor-flow )
  - Data analysis / Visualisation ( Matplotlib )
  - Scripting ( Beautiful Soup )
  - Embedded development
- Python follows "pass-by-object-reference", that is: immutables like string, whole no., tuples are all pass by value where as mutables like objects, list[] are pass by reference.

## Datatypes

- [chart](https://media.geeksforgeeks.org/wp-content/uploads/20191023173512/Python-data-structure.jpg)
- Numeric - int, float, complex
- Sequence Type - list (append, remove), tuple, string
- Boolean - True, False
- Set - Frozenset, set(add, remove)
- Dictionary - dict

- **Note**: In python there is no character data type, a character is a string of length one
- Accessing elements of String. Indexing can be negative too (starts from end)

```sh
String1 = "GeeksForGeeks"
print("\nFirst character of String is: ")
print(String1[0])   // G

print("\nLast character of String is: ")
print(String1[-1])    // s
```

- type(varible_name) - gives datatype

```sh
myString = "hello"
type(myString)  // outputs: <class 'str'>
```

- Type casting: str(), int(), float()

```sh
num = "1"
print(int(1)) // prints one
```

## if/else

```sh
// 1
if 2>3:
    print(True)
elif 3>4:
    print("true")
else:
    print("no")

// 2

if not 2>3:
    print("hi")
```

## Looping

#### While loop

```sh
while True:
    //do something
```

#### For loop

- If range(10) - loop beings from 0 till 10

```sh
for i in range(1,3):
    print("hello")  // prints hello twice
```

- You can also add an else statement in the for loop.

```sh
 for i in range(3):
     print("Hello")
 else:
    print("Finished")
```

### range(start,stop,step)

- All argument must be integers
- All three arguments can be positive or negative

## Data structures

#### List

- Lists are just like the arrays, declared in other languages which is a ordered collection of data.
- Items in a list do not need to be of the same type.
- Lists are mutable
- `append` - to add a new value to the list `nums.append(6)`
- Remove element using `remove` - it does not return a value. If the element doesn't exist, it throws `ValueError: list.remove(x): x not in list exception`.

```sh
emptyList = []
nums = [1, 2, 3, 4, 5]
nums.remove(2)

validList = [4, 10.2, "cherry", ["an other list", 1]]

// 1 - using range
for i in range(len(nums)):
    print(nums[i])

// 2
for i in nums:
    print(i)
```

#### Tuples

- Similar to `list`, but tuples are immutable i.e. tuples cannot be modified after it is created.

```sh
tupleA = ()

tupleB = (1, True, 'For')
print(tupleB[3])   // 'For'
print(tupleB[1:2]) //  True

nestedTuple = ((0, 1, 2, 3), ('python', 'geek'))
```

- tuple values cannot be changed.
- To change tuple values, convert it to list and modify and then convert it back to tuple

````sh
tup = ('A')
list = list(tup)
list[0] = 'B'
tup = tuple(list)
print(tup[0])   // outputs 'B'

```sh
tupleA[0] = 1  // TypeError: 'tuple' object does not support item assignment
````

- Once a tuple is created a new value cannot be added in it
- To add a new value, use another tuple:

```sh
  a = ('2',)
  b = 'z'
  new = a + (b,)
```

- You cannot remove a value from tuple

#### Set

- Set is an unordered collection of data type that is iterable, mutable and has no duplicate elements
- The order of elements in a set is undefined though it may consist of various elements.
- Since you cannot index into an element in set, you have to loop through
- Set elements cannot be changed, but you can add values using `add()`
- Remove element using `remove`

```sh
data = { "hello", "bye", 10, 15 }
for i in data:
    print i

// add value
data.add(3)
```

#### Frozenset()

- The frozenset() is an inbuilt function is Python which takes an iterable object as input and makes them immutable

```sh

```

#### Dictionary

```sh
dict = {1: 'Geeks', 2: 'For', 3: 'Geeks'}

// add a new key
dict['age'] = 24

for key in dict:
    print("%s --> %s" %(key, dict[key]))

for key,value in dict.items():
    print("%s --> %s" %(key,value))
```

#### List Comprehension

- Syntax - `[expression for item in list]`
- https://medium.com/swlh/list-comprehensions-in-python-e8d409bb216e

#### Lamda functions

- Anonymous functions are also called lambda functions.
- Syntax : `lambda arguments: expression`

```sh
double = lambda x: x * 2

print(double(5))
```

#### Class

```sh
class Vehicle:
    pass

// Instantiate
car = Vehicle()
```

- `__init__` method. We call it a constructor method

```sh
def __init__(self, number_of_wheels, type_of_tank, seating_capacity, maximum_velocity):
        self.number_of_wheels = number_of_wheels
        self.type_of_tank = type_of_tank
        self.seating_capacity = seating_capacity
        self.maximum_velocity = maximum_velocity

```
