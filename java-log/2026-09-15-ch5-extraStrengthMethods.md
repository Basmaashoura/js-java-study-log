# Head First Java — Ch.4: How Objects behave

**Date:** 2026-09-15

## Key concepts

- Building a program from a high-level design first — flowcharts (start/end circles, action rectangles, decision diamonds) before code.
- Thinking in objects first (Brad-style) rather than procedures (Laura-style) when designing classes.
- The three-part class development process: prep code, test code, real code.
- Prep code — pseudocode describing what to do, not how; includes instance variable declarations, method declarations, and method logic.
- Test-Driven Development (TDD) — writing test code before the real implementation exists, to clarify what a method actually needs to do.
- The enhanced for loop (for (int cell : locationCells)) — simpler iteration over arrays/collections, added in Java 5.
- The classic for loop — initialization / boolean test / iteration expression, and how it differs from a while loop.
- Pre- vs. post-increment/decrement operators (++x vs. x++) and how placement affects the result in larger expressions.
- break — exits a loop immediately, regardless of the boolean test.
- Casting primitives — explicit cast required to go from a larger type to a smaller one (or double/float to int); can silently lose data.
- Building the Simple Startup Game end-to-end — SimpleStartup, SimpleStartupGame, GameHelper classes working together.
- Objects collaborating without knowing each other's internals (main() delegating to helper.getUserInput() and theStartup.checkYourself()).
- The repeated-guess bug — checkYourself() has no memory of already-hit cells, so the same guess can trigger a false "kill".

## Exercises

- [x] Sharpen Your Pencil — prep code for SimpleStartupGame class
- [x] Sharpen Your Pencil — "what else should we test?" (test code coverage)
- [x] Cliffhanger bug — identified root cause (repeated guesses not tracked)
- [] Be the JVM
- [] Code Magnets
- [] Java Cross
- [] Mixed Messages

## Confused by
- writing prep code and test code, my mind goes directly to real code.

## Next

Solve the remaining exercises. 