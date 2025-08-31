#include <bits/stdc++.h>
using namespace std;

int lever(vector<int>& A, vector<int>& B) {
    int iterations = 1;
    for (int i = 0; i < A.size(); i++) {
        if (A[i] > B[i]) {
            iterations += (A[i] - B[i]);
        }
    }
    return iterations;
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        vector<int> A(n), B(n);
        for (int i = 0; i < n; i++) cin >> A[i];
        for (int i = 0; i < n; i++) cin >> B[i];
        cout << lever(A, B) << "\n";
    }
    return 0;
}

int main() {

    ios::sync_with_stdio(false);
    cin.tie(nullptr);


    int T;
    cin >> T;
    while (T--) {
        int n;
        cin >> n;
        vector<int> res = alternatingSeries(n);
        for (int x : res) cout << x << " ";
        cout << "\n";
    }
    return 0;
}
