#include <iostream>
using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--) {
        int a, b, k,sum;
        sum = -1;
        cin >> a >> b;

        for (int i = 1 ; i < b ; i++){
            if(b % i ==0){
               k = i;

               a = a*k;
               b = b/k;
               if(a+b % 2 == 0){
                sum = max(sum, a+b);
               }
            }
        }

        cout << sum << "\n";


    }
    return 0;
}
