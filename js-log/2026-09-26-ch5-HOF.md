# Eloquent JavaScript — Ch.3: Functions

**Date:** 2026-09-16

## Key concepts

- Arrays: ordered collections of values; zero-based indexing, so the first element is at index `0`
- Properties: accessed with dot notation (`obj.name`) or bracket notation (`obj[key]`); brackets evaluate the expression first
- Methods: properties whose values are functions; e.g. `.push()`, `.pop()`, `.toUpperCase()`
- Stack vs Queue: `push/pop` → LIFO; `push/shift` → FIFO
- Objects: named collections of properties; properties can be read, added, updated, or deleted
- `undefined` vs deleted: `obj.x = undefined` keeps the property; `delete obj.x` removes it completely
- Object utilities: `Object.keys()` returns property names; `Object.assign()` copies/merges properties into an object
- Arrays are objects: `typeof []` returns `"object"`; arrays are specialized for ordered numeric properties
- Mutability: objects/arrays can be changed in place; primitives like numbers, strings, and Booleans are immutable
- Object equality: objects are compared by identity, not content; two separate `{a: 1}` objects are not equal
- `const` with objects: prevents reassignment of the binding, but does not prevent mutation of the object's contents
- Property shorthand: `{events, squirrel}` is shorthand for `{events: events, squirrel: squirrel}`
- `for...of` gives array values directly, while `for...in` gives indices/keys
- Nested loops: useful for processing objects containing arrays and collecting unique values with `.includes()`
- Array methods: `.indexOf()`, `.lastIndexOf()`, `.slice()`, and `.concat()` for searching and creating new arrays
- `.slice(start, end)`: start is inclusive, end is exclusive — same boundary idea as `i < length`
- Strings also have methods: `.slice()`, `.indexOf()`, `.trim()`, `.padStart()`, `.split()`, `.join()`, `.repeat()`
- Phi coefficient: practiced translating Boolean combinations into array indices using `index = squirrel * 2 + event`
- Main takeaway: arrays are best for ordered data, objects for named data, and understanding references/mutability is essential when working with both


## Exercises
- [x] The Sum Of Range
- [x] Reversing An Array
- [] A List
- [] Deep Comparison

## Confused by


