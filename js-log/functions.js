// CHAPTER EXERCISES SOLUTIONS
//
// 1. MINIMUM
function min(a, b) {
  return a < b ? a : b;
}

console.log(min(5, 2));

// 2. RECURSION
function isEven(testNum) {
    if (testNum === 0) return true;
    if (testNum === 1) return false;
    if (testNum < 0) return isEven(testNum + 2);
    return isEven(testNum - 2);
}

console.log(isEven(-1))

// 3.1 Bean Counting
function countBs(testText) {
    let counter = 0
    for(let char of testText){
        if (char === "B")
            counter++
    }
    return counter;
}

console.log(countBs("BoBBBBBBBBBBBBBB"))

// 3.2 Bean Counting
function countChar(testText, char) {
    let counter = 0
    for(let letter of testText){
        if (letter === char)
            counter++
    }
    return counter;
}

console.log(countChar("BoBBBBBBBBBBBBBB", "o"))