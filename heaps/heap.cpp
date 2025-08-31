#include <iostream>
using namespace std;
#include <queue>

class heap
{
public:
    int arr[100];
    int size;
    heap()
    {
        arr[0] = -1;
        size = 0;
    }
    void insert(int val)
    {

        size = size + 1;
        int index = size;
        arr[index] = val;

        while (index > 1)
        {
            int parent = index / 2;

            if (arr[index] > arr[parent])
            {
                swap(arr[index], arr[parent]);
                index = parent;
            }
            else
            {
                return;
            }
        }
    }
    void remove()
    {
        if (size == 0)
        {
            cout << "Nothing to delete" << endl;
            return;
        };

        arr[1] = arr[size];
        size--;

        int index = 1;

        while (index < size)
        {
            int left = index * 2;
            int right = index * 2 + 1;

            if (left <= size && arr[left] > arr[index])
            {
                swap(arr[left], arr[index]);
                index = left;
            }

            else if (right <= size && arr[right] > arr[index])
            {
                swap(arr[right], arr[index]);
                index = right;
            }
            else
            {
                return;
            }
        }
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;

        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= n && arr[left] > arr[largest])
        {
            largest = left;
        }
        if (right <= n && arr[right] > arr[largest])
        {
            largest = right;
        }

        if (largest != i)
        {
            swap(arr[largest], arr[i]);
            heapify(arr, n, largest);
        }
    }

    void heapSort(int arr[], int n)
    {
        int size = n;

        while (size > 1)
        {
            swap(arr[1], arr[size]);
            size--;
            heapify(arr, size, 1);
        }
    }

    void display()
    {
        for (int i = 1; i <= size; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main()
{
    heap h;
    h.insert(10);
    h.insert(20);
    h.insert(5);

    h.display();

    h.remove();
    h.display();

    int arr[6] = {-1, 54, 53, 55, 52, 50};
    int n = 5;
    for (int i = n / 2; i > 0; i--)
    {
        h.heapify(arr, n, i);
    }
    
    cout << "Printing the array now " << endl;
    for (int i = 1; i <= n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

   
    h.heapSort(arr, n);
    cout << "Printing the sorted array " << endl;
    for (int i = 1; i <= n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;


    priority_queue<int> pq; //max heap
    pq.push(5);
    pq.push(15);
    pq.push(10);    
    cout<<"Top element is: "<<pq.top()<<endl;
    pq.pop();
    cout<<"Top element is: "<<pq.top()<<endl;
    priority_queue<int, vector<int>, greater<int>> minheap; //min heap
    minheap.push(5);
    minheap.push(15);
    minheap.push(10);    
    cout<<"Top element is: "<<minheap.top()<<endl;
    minheap.pop();
    cout<<"Top element is: "<<minheap.top()<<endl;

    return 0;
}