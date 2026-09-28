# Head First Java — Ch.6: Using The Java Library
**Date:** 2026-09-26

## Key concepts
- The Ch.5 bug: checkYourself() counted every match, so repeating a hit three times gave a false "kill"
- Three fix options with an int[]: a second boolean[], marking hit cells as -1, or building a new smaller array. All are clunky, since arrays can't resize 
- ArrayList (in java.util): add(), remove(), contains(), indexOf() (returns -1 if absent), isEmpty(), size(); it grows and shrinks dynamically 
- ArrayList vs array: .size() (method) vs .length (variable), no index needed on add(), normal dot-operator syntax vs special [] syntax, no size required at creation 
- Parameterized types: ArrayList<String> means a list that only holds Strings

## Exercises

- [x] Sharpen Your Pencil 1

## Confused by

## Next

continue the chapter