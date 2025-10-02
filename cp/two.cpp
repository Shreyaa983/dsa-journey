#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int T;
    cin >> T;
    while (T--) {
        int k, x;
        cin >> k >> x;

        for (int i = 0; i < k; i++) {
            x = 2 * x;
        }

        cout << x << "\n";
    }
    return 0;
}
