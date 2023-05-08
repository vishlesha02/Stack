package Day10;

import java.util.Scanner;
public class Stack {
        public int top=-1;
        Scanner sc = new Scanner(System.in);

        int size=sc.nextInt();
        public int arr[]=new int[size];
        public void push(int n){
            if(top==size-1){
                System.out.println("Stack is full");
            }
            else{
                top+=1;
                arr[top]=n;
            }
        }
        public void pop(int n){
            if(top==-1){
                System.out.println("Stack is empty");
            }
            else{
                top-=1;
            }
        }
        public void show(){
            for (int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
        public static void main(String[] args) {
            Stack st = new Stack();
            st.push(70);
            st.push(36);
            st.push(56);
            st.show();
        }
    }

