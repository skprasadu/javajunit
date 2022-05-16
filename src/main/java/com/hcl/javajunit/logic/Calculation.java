    package com.hcl.javajunit.logic;  
    public class Calculation {  
      
        public static int findMax(int arr[]){  
            int max=0;  
            for(int i=1;i<arr.length;i++){  
                if(max<arr[i])  
                    max=arr[i];  
            }  
            return max;  
        }

		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return i+j;
			//return 1;
		}

		public int substract(int i, int j) {
			// TODO Auto-generated method stub
			//return 0;
			return i - j;
		}

		public int multiply(int i, int j) {
			// TODO Auto-generated method stub
			return i*j;
		}

		public double divide(double i, double j) {
			// TODO Auto-generated method stub
			return i/j;
		}  
    }  