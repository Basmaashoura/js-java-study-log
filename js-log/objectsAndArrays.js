// CHAPTER EXERCISES SOLUTIONS
//
// 1. The Sum Of A Range
function range (start, end, step = 1) {
    let arr = [];
    let num = step > 0 ? start : end;
    for(num; step > 0 ? num <= end : num >= start; num += step) {
        arr = [...arr, num]
    }
    return arr
}

function sum ([...arr]) {
    let sum = 0
    for(let num of arr) {
        sum += num;
        // console.log(num)
    }
    return sum;
}

console.log(sum(range(1, 10, -1)))