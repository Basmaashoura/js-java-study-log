# Head First Java — Ch.4: How Objects behave

**Date:** 2026-09-03

## Key concepts

- State affects behavior — same method code, different instance variable values → different behavior (Song, Dog bark examples)
- Arguments vs. parameters — argument = caller syntax, parameter = called syntax
- Multiple parameters — argument/parameter order and type must match
- Return types and return values; `void` vs. non-void methods
- Pass-by-value (pass-by-copy) — primitives copy the bit pattern; references copy the reference itself, so both variables point at the same object but reassigning a parameter never touches the caller's original variable
- Getters and Setters — naming convention and purpose
- Encapsulation — private instance variables + public getters/setters; enables validation and lets you change internal implementation later without breaking callers' code
- Objects in arrays behave the same as anywhere else — just reached via index instead of a named variable
- Default values — instance variables always get a default (0 / false / null) automatically at object creation on the heap; local variables do NOT, compiler enforces definite assignment
- Why locals don't get defaults — stack frames are created/destroyed per method call and not zeroed out for performance, so the compiler statically forces initialization before use to prevent reading garbage memory
- `==` vs. `.equals()` — `==` compares bit patterns (primitives, or whether two references point at the same object); `.equals()` compares meaningful equivalence between distinct objects

## Exercises

- [x] Sharpen Your Pencil — "What's legal?" (calcArea method calls)
- [x] Be the compiler
- [x] Who Am I?
- [x] Pool Puzzle
- [x] Mixed Messages

## Confused by

- comprehension check (5 questions) answered correctly on first pass, with one phrasing refinement on pass-by-value for references.
- couldn't totally understand the "Five Minutes Mystery" exercise.

## Next

ch.5 Extra Strength Methods