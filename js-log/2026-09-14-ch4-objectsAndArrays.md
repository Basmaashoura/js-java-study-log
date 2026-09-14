# Eloquent JavaScript — Ch.3: Functions

**Date:** 2026-09-01

## Key concepts

- Three ways to define a function: function expression, function declaration (hoisted), arrow function (not hoisted)
- Scope: global vs local; `let`/`const` are block-scoped, `var` is function-scoped; lexical scoping — inner scopes see outward, not vice versa
- Shadowing: innermost binding with the same name wins inside its scope
- Functions are values — can be stored, reassigned, passed around
- Call stack: tracks return contexts; unterminated recursion → stack overflow (`RangeError: Maximum call stack size exceeded`)
- Closures: a function = its code + the environment it was created in; each outer call creates a fresh, independent environment
- `for...in` gives indices/keys; `for...of` gives values — mixing them up silently breaks comparisons
- Naming a loop variable the same as an outer parameter shadows the parameter and makes it unreachable inside the loop
- Recursion needs a base case that the recursive step actually converges toward; a guard clause that just dodges a crash can silently return wrong answers instead of fixing the real issue
- `??` only falls through on `null`/`undefined`, never on other falsy values
- Default parameters (`x = 1`) only trigger on `undefined`, not `null`/`0`/`""`
- Pure functions (no side effects, deterministic output) vs side-effecting functions (e.g. `console.log`) — pure ones are easier to reuse and test

## Exercises

- [x] Minimum
- [x] Recursion (`isEven`, no `%`) — fixed to handle 0/1 base cases plus negative numbers by moving *toward* zero (`+2` for negatives, `-2` for positives) instead of guard-returning `false`
- [x] Bean Counting (`countBs`, `countChar`) — fixed `for...in` vs `for...of` bug (was comparing string indices instead of characters); fixed parameter/loop-variable name collision (shadowing) that made comparisons always fail

## Confused by

- Closures inside loops (`let` vs `var`) — needed several passes and a stripped-down example to get the "environment per call, not per line" model straight; still want to re-attempt the box/room analogy after a break
- Why `??` didn't fire in a buggy `isEven` attempt (`testNum - 2 ?? "ops"`) — clicked once I connected it back to `??` only checking `null`/`undefined`

## Next
- revisit `let` vs `var` in loops with the "room" analogy
- chapter 4 :)