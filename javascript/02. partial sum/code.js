// javascript를 이용해 부분합을 구현한다.
// 부분합이란, 배열의 각 위치(0, 1, 2...)에 대해 배열의 시작부터 현재 위치 까지의 우너소의 합을 구해 둔 배열이다.

function partialSum(arr) {
    const ret = [];
    ret[0] = arr[0];

    for (let i = 1; i < arr.length; i++) {
        // ret의 이전 값과 더해주기만 하면 된다.
        ret[i] = ret[i - 1] + arr[i];
    }

    return ret;
}

// 어떤 벡터의 부분합 psum[]이 주어질 때, 원래 벡터의 a부터 b까지의 합을 구한다.
function rangeSum(psum, a, b) {
    if(a == 0) return psum[b];
    return psum[b] - psum[a - 1];
}

// example1
const scores = [100, 97, 86, 79, 66, 52, 49, 42, 31];
const psum = partialSum(scores);

console.log('range sum:', rangeSum(psum, 1, 3));

// rangeSum의 결과값을 b - a + 1로 나누면 평균도 쉽게 구할 수 있다.
// 다른 값들도 쉽게 계산할 수 있는데, 예로 특정 구간의 분산을 구할 수 도 있다.
function variance(sqpsum, psum, a, b) {
    // 해당 구간의 평균이다.
    const mean = rangeSum(psum, a, b) / (b - a + 1);
    // 분산 공식에 맞춰서 계산식을 작성한다.
    const ret = rangeSum(sqpsum, a, b) 
        - 2 * mean * rangeSum(psum, a,b)
        + (b - a + 1) * mean * mean;
    
    return ret / (b - a + 1);
}

// example2
const sqscores = scores.map(score => score * score);
const sqpsum = partialSum(sqscores);

console.log('variance:', variance(sqpsum, psum, 1, 3));

function gridSum(psum, y1, x1, y2, x2) {
    const ret = psum[y2][x2];
    if(y1 > 0) ret -= psum[y1 - 1][x2];
    if(x1 > 0) ret -= psum[y2][x1 - 1];
    if(y1 > 0 && x1 > 0) ret += psum[y1 - 1][x1 - 1];
    return ret;
}