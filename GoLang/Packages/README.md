## Introduction

* `Go` supports two kinds of packages: 
    - **Executable package** - which has `package main` as first line. These packages create binary.
    - **Utility package** (non-executable). These packages are used by executable packages.

* Package scoping: A package scope is a region within a package(directory) where a declared variable is accessible from
within a package. This means all the variables (declared outside a function) can be accessed from within the directory across multiple files even though they are in lowercase.

### References

- https://medium.com/rungo/everything-you-need-to-know-about-packages-in-go-b8bac62b74cc