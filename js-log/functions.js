// CHAPTER EXERCISES SOLUTIONS
//
// 1. MINIMUM
// function min(a, b) {
//   return a < b ? a : b;
// }
//
// console.log(min(5, 5));

// 2. RECURSION
function isEven(testNum) {
    if (testNum === 0) return true;
    if (testNum === 1) return false;
    if (testNum < 0) return isEven(testNum + 2);
    return isEven(testNum - 2);
}

console.log(isEven(-1))