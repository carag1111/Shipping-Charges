#include <iostream>
#include <iomanip>
#include <cmath> // For ceil function
using namespace std;

int main() {
  double weight, distance, rate = 0, totalCost;

  //Ask for weight
  cout << "Enter the weight of the package in kilograms: ";
  cin >> weight;

  //Validate weight
  if (weight <= 0 || weight > 20) {
    cout << "Invalid weight. Please enter a weight between 0 and 20 kilograms." << endl;
    return 1;
    }

  //Ask for distance
  cout << "Enter the distance the package will be shipped in miles: " ;
  cin >> distance;

  //Validate distance
  if (distance < 10 || distance > 3000) {
    cout << "Invalid distance. Please enter a distance between 10 and 3000 miles." << endl;
    return 1;
    }

  //Determine rate based on weight
  if (weight <= 2)
    rate = 1.10;
  else if (weight <= 6)
    rate = 2.20;
  else if (weight <= 10)
    rate = 3.70;
  else
    rate = 4.80;

  //Calculate number of 500 mile segments (rounded up)
  int segments = ceil(distance / 500.0);

  //Calculate total cost
  totalCost = rate * segments;

  //Display total cost
  cout << "Shipping Cost: $" << fixed << setprecision(2) << totalCost << endl;

  return 0;
  }