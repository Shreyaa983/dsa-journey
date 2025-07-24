// Problem: Set Matrix Zeros(https://leetcode.com/problems/set-matrix-zeroes/)
// Approach: Use first row and column to mark zeros, then set the rest of the matrix accordingly.
// Time Complexity: O(m * n), Space Complexity: O(1)

#include <vector>
using std::vector;

class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
    int rows = matrix.size();
    int cols = matrix[0].size();

    // Flags to track whether first row and column should be zero
    bool firstRowZero = false, firstColZero = false;

    // Step 1: Check if first row has any zero
    for (int j = 0; j < cols; j++) {
        if (matrix[0][j] == 0) {
            firstRowZero = true;
            break;
        }
    }

    // Step 2: Check if first column has any zero
    for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }

    // Step 3: Use first row and column to mark zeros
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Step 4: Set matrix cells to 0 using the marks in first row and column
    for (int i = 1; i < rows; i++) {
        if (matrix[i][0] == 0) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    for (int j = 1; j < cols; j++) {
        if (matrix[0][j] == 0) {
            for (int i = 1; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    }

    // Step 5: Handle first row and column separately
    if (firstRowZero) {
        for (int j = 0; j < cols; j++) {
            matrix[0][j] = 0;
        }
    }

    if (firstColZero) {
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }
}

};