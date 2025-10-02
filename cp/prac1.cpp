#include <bits/stdc++.h>
using namespace std;

string avg(int a, int b, int c){
   return (a+b) > 2 *c ? "YES" : "NO";
};

int main() {
	
	int T;
    cin >> T;

	while(T){
	    
	    int a, b, c;
	    cin >> a >> b >> c;
	    
	    string ans = avg(a,b,c);
	    
	    cout << ans << endl;
	    T--;
	}
	
	return 0;

}
