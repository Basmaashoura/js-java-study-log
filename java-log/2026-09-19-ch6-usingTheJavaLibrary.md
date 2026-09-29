# Head First Java — Ch.6: Using The Java Library
**Date:** 2026-09-26

## Key concepts
- The Ch.5 bug: checkYourself() counted every match, so repeating a hit three times gave a false "kill"
- Three fix options with an int[]: a second boolean[], marking hit cells as -1, or building a new smaller array. All are clunky, since arrays can't resize 
- ArrayList (in java.util): add(), remove(), contains(), indexOf() (returns -1 if absent), isEmpty(), size(); it grows and shrinks dynamically 
- ArrayList vs array: .size() (method) vs .length (variable), no index needed on add(), normal dot-operator syntax vs special [] syntax, no size required at creation 
- Parameterized types: ArrayList<String> means a list that only holds Strings 
- Startup rewritten with ArrayList<String>: indexOf() + remove() + isEmpty() fix the bug and remove the need for numOfHits 
- The full StartupBust game on a 7×7 grid with 3 Startups: StartupBust (game), Startup, GameHelper (Ready-Bake)
- StartupBust split into small methods: setUpGame(), startPlaying(), checkUserGuess(), finishGame()
- Object collaboration: StartupBust delegates hit-checking to each Startup and never touches their cells directly 
- Boolean operators: &&, ||, !=, !
- Short-circuit (&&, ||) vs non-short-circuit (&, |); the refVar != null && refVar.method() pattern avoids a NullPointerException 
- Packages and full names (java.util.ArrayList); import vs typing the full name; import only saves typing; java.lang is auto-imported 
- Reasons for packages: organization, name collision avoidance, access security 
- Reading the API docs: Java 8 vs Java 9+ (modules, java.base), and why the docs matter (e.g. indexOf() returning -1 isn't visible from the signature)

## Exercises

- [x] Sharpen Your Pencil: ArrayList vs regular array table
- [x] Sharpen Your Pencil: test prep code for StartupBust
- [x] Sharpen Your Pencil: annotate the StartupBust code
- [x] Code Magnets (ArrayListMagnet)
- [x] JavaCross puzzle

## Confused by
- Nothing flagged yet

## Next

Ch.7 — Better Living in Objectville (inheritance)
