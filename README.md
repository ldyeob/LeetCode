# leetcode-jilu
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

