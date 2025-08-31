#include <bits/stdc++.h>
using namespace std;

// -------------------- Fast IO --------------------
#define fast_io                  \
    ios::sync_with_stdio(false); \
    cin.tie(nullptr)

// -------------------- Type Aliases --------------------
using ll = long long;
using ld = long double;
using vi = vector<int>;
using vll = vector<long long>;
using vd = vector<double>;

// -------------------- Binary Search --------------------
int binarySearch(const vll &nums, ll target)
{
    int low = 0, high = (int)nums.size() - 1;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            high = mid - 1;
        else
            low = mid + 1;
    }
    return -1;
}

int binarySearchFloor(const vll &nums, ll target)
{
    int low = 0, high = (int)nums.size() - 1, floorIdx = -1;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (nums[mid] <= target)
        {
            floorIdx = mid;
            low = mid + 1;
        }
        else
            high = mid - 1;
    }
    return floorIdx;
}

int binarySearchCeil(const vll &nums, ll target)
{
    int low = 0, high = (int)nums.size() - 1, ceilIdx = -1;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if (nums[mid] >= target)
        {
            ceilIdx = mid;
            high = mid - 1;
        }
        else
            low = mid + 1;
    }
    return ceilIdx;
}

// -------------------- Sieve --------------------
vector<int> getSieve(int n)
{
    vector<int> prime(n + 1, 1);
    prime[0] = prime[1] = 0;
    for (int i = 2; i * i <= n; i++)
    {
        if (prime[i])
        {
            for (int j = i * i; j <= n; j += i)
                prime[j] = 0;
        }
    }
    return prime;
}

// -------------------- Factor Sieve --------------------
vector<int> getFactorSieve(int n)
{
    vector<int> sieve(n + 1, 1);
    sieve[0] = 0;
    for (int i = 2; i <= n; i++)
    {
        if (sieve[i] == 1)
        {
            for (int j = i; j <= n; j += i)
                sieve[j] = i;
        }
    }
    return sieve;
}

int getFactorizationCount(int num, const vector<int> &sieve)
{
    unordered_set<int> factors;
    while (num != 1)
    {
        factors.insert(sieve[num]);
        num /= sieve[num];
    }
    return (int)factors.size();
}

int lever(vector<int> &A, vector<int> &B)
{
    int iterations = 1;
    for (int i = 0; i < A.size(); i++)
    {
        if (A[i] > B[i])
        {
            iterations += (A[i] - B[i]);
        }
    }
    return iterations;
}

int main()
{

    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--)
    {
    }
    return 0;
}
