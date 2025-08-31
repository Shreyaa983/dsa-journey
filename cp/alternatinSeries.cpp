
#include <bits/stdc++.h>
using namespace std;

bool lexCompareAbs(const vector<int>& A, const vector<int>& B) {
    int n = A.size();
    for (int i = 0; i < n; i++) {
        int absA = abs(A[i]);
        int absB = abs(B[i]);
        if (absA < absB) return true;  
        if (absA > absB) return false;
    }
    return true; 
}

vector<int> alternatingSeries(int n){
    vector<int> good;
    good.reserve(n);
    int pos = (n + 1) / 2 + 1;  
    for (int i = 0; i < n ; i++){
        if (i % 2 == 0) {
            good.push_back(-1);
        } else {
            good.push_back(pos);
        }
    }
    
    vector<int> posfirst;
    posfirst.reserve(n);
    for (int i = 0; i < n ; i++){
        if (i % 2 == 0) {
            posfirst.push_back(pos);
        } else {
            posfirst.push_back(-1);
        }
    }

    if (lexCompareAbs(good, posfirst)) return good;
    
    return posfirst;
    
}