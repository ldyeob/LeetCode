# leetcode-jilu는 2024.01.20부터 자바로 shuati
erfenfa yidingyao kan lingshen 의 shipin yaoxuexi honglanransefa zuizhongyaode yidian 이미 파란 혹은 불루인 부분은 bubaohanzai qujiannei leetocde 162 154
int max = *max_element(v.begin(), v.end());
int min = *min_element(v.begin(), v.end());

## C++ lamba 함수? C++ 11

## count count_if
1. int c = count(begin(s), end(s), '1')

# *max_element(f, f + n) //f[]

# c++람다 함수 leetcode 300 심지어 람다 함수는함수안에 정의 가능? 함수 객체 
1. c++에서는 이진 탐색으로 원소를 탐색하는 lower_bound, upper_bound 함수를 제공합니다. ** lower_bound(arr, arr + 6, 6) - arr;**
2. lower_bound
용도 : 찾으려는 key 값보다 같거나 큰 숫자가 배열 몇 번째에서 처음 등장하는지 찾기 위함
3. upper_bound
용도 : 찾으려는 key 값을 초과하는 숫자가 배열 몇 번째에서 처음 등장하는지 찾기 위함
4. upper_bound 람다함수사용
template<class ForwardIt, class T, class Compare>
ForwardIt upper_bound(ForwardIt first, ForwardIt last, const T& value, Compare comp);
auto comp = [](const Type& a, const Type& b) -> bool {
    // 비교 동작을 정의
};

예: int k = upper_bound(jobs.begin(), jobs.begin() + i - 1, jobs[i - 1][0], [&](int st, const vector<int> &job) -> bool {
    return st < job[1];
});
st는 코드에서 std::upper_bound 함수에 전달되는 찾고자 하는 값(상한 값)입니다. 여기서 st는 jobs[i - 1][0]로 초기화되었습니다
二分查找[https://leetcode.cn/problems/maximum-profit-in-job-scheduling/solutions/1886554/by-sao-hei-chu-e-wei-dang-yu-min-w5rc/]

## 최대공약수
1. https://leetcode.cn/problems/insert-greatest-common-divisors-in-linked-list/solutions/2593509/2807-zai-lian-biao-zhong-cha-ru-zui-da-g-p1ee/?envType=daily-question&envId=Invalid%20Date

## 람다함수
1. https://blockdmask.tistory.com/491****
2. 람다함수는 함수내에서 정의 하고 사용가능ㅋㅋㅋ [&] 굿!
3. https://learn.microsoft.com/ko-kr/cpp/cpp/lambda-expressions-in-cpp?view=msvc-170

## dp 序列 DP
1. https://leetcode.cn/problems/arithmetic-slices-ii-subsequence/solutions/928871/gong-shui-san-xie-xiang-jie-ru-he-fen-xi-ykvk/
2. 

## swap() 지정된 두 인수의 값을 교환합니다.
WRL_NOTHROW inline void Swap(
   _Inout_ T& left,
   _Inout_ T& right
);
1. 실현방법1
   "c++int tmp = s[i];
    s[i] = s[j];
    s[j] = tmp;
   "
   "c++ s[i] ^= s[j];
s[j] ^= s[i];
s[i] ^= s[j];""
## reverse(v.begin(), v.begin() + 4)
## [queue](https://life-with-coding.tistory.com/408)
## [stack](https://life-with-coding.tistory.com/406)

## char c = s[i] | 32 deyisi
在C语言中，给定一个字符c，您提到的c = s[i] | 32操作将字符转换为其对应的小写形式（如果它是一个英文字母）。

这里使用了位运算。当您对一个字符使用按位或（|）操作符与32（或0x20）进行位运算时，它会将字符转换为小写形式（假设字符是大写字母）。

为什么这样工作呢？这与ASCII码表的编码方式有关。大写字母和小写字母之间的ASCII值相差32。通过将大写字母的第五位（从右开始）设置为1，您可以将其转换为小写字母。

例如：

'A' 的ASCII值是 65，二进制表示为 0100 0001
'a' 的ASCII值是 97，二进制表示为 0110 0001
观察二进制表示，您可以看到这两者只有第五位不同。通过与32（即 0010 0000）进行按位或操作，您可以将'A'转换为'a'。

这种技巧在某些情况下是有用的，例如在实现字符串大小写转换函数时。

# 645버킷 정렬桶排序 방법 한번 풀어야 된

