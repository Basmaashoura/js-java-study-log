// CHAPTER EXERCISES SOLUTIONS

// 1. The Sum Of A Range
// function range(start, end, step = 1) {
//     let arr = [];
//     for (let num = start;
//          step > 0 ? num <= end : num >= end;
//          num += step) {
//         arr.push(num);
//     }
//     return arr;
// }
//
// function sum ([...arr]) {
//     let sum = 0
//     for(let num of arr) {
//         sum += num;
//     }
//     return sum;
// }
//
// console.log(sum(range(5,2, -1)))

// 2. Reversing An Array
// let arr = [5,20,15,75,6]
//
// function reverseArray(arr) {
//     let newArr = []
//     for(let num of arr) {
//         newArr.unshift(num)
//     }
//     return newArr
// }
// console.log(reverseArray(arr))
//
// function reverseArrayInPlace(arr) {
//     for (let i = 0; i < Math.floor(arr.length / 2); i++) {
//         let last = arr.length - 1 - i;
//         let temp = arr[i];
//         arr[i] = arr[last];
//         arr[last] = temp;
//     }
//     return arr;
// }
// console.log(reverseArrayInPlace(arr))

// 3. A List
function arrayToList(array) {
    let list = null;
    for (let i = array.length - 1; i >= 0; i--) {
        list = {value: array[i], rest: list};
    }
    return list;
}

function listToArray(list) {
    let current = list;
    let arr=[]
    while (current !== null) {
        arr.push(current.value)
        current = current.rest;  // step to the next link
    }
    return arr
}

function prepend(element, list) {
    let newList = {value: element, rest: list}
    return newList;
}


function nth(list, n) {
    let current = list;
    while (n > 0 && current !== null) {
        current = current.rest;
        n--;
    }
    return current !== null ? current.value : undefined;
}

let arr = [1, 2, 3]
let list = arrayToList(arr)
console.log(listToArray(list))
console.log(prepend(4, list))
console.log(nth(list, 1))