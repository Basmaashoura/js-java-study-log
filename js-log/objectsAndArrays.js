// CHAPTER EXERCISES SOLUTIONS
//
// 1. The Sum Of A Range
function range(start, end, step = 1) {
    let arr = [];
    for (let num = start;
         step > 0 ? num <= end : num >= end;
         num += step) {
        arr.push(num);
    }
    return arr;
}

function sum ([...arr]) {
    let sum = 0
    for(let num of arr) {
        sum += num;
    }
    return sum;
}

console.log(sum(range(5,2, -1)))

// 2. Reversing An Array
// function reverseArray(...arr) {
//     let newArr = []
//     for(let num of arr) {
//         newArr.unshift(num)
//     }
//     return newArr
// }
//
let arr = [5,20,15,75,6]
// console.log(reverseArray(...arr))

function reverseArrayInPlace(arr) {
    let length = arr.length
    while (length) {
        let removed = arr.shift()
        arr = [...arr, removed]
        console.log(removed, arr)
        // arr = [arr.unshift(removed), ...arr]
        length--
    }
    for(let num in arr) {
        // arr.shift(arr[num])
        // arr.pop(arr[num])
    }
    return arr;
}
console.log(reverseArrayInPlace(arr))
