import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingOneQueue {
    public static Queue queue;



    public static void main(String[] args) {
        queue = new LinkedList();
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice,newNum,temp;
        boolean loop = true;
        while(loop){
            System.out.println("\n\nSTACK USING SINGLE QUEUE :-)");
            System.out.println("Enter Your Choice to perform an action on Stack. \n\n");
            System.out.println("1 - push. ");
            System.out.println("2 - Pop. ");
            System.out.println("3 - Number of element in Stack.");
            System.out.println("4 - Exit.");
            System.out.println("What do you what ? : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("Enter the element want to push : ");
                    newNum=sc.nextInt();
                    st.push(newNum);
                    System.out.println("done.");
                    break;
                } case 2:
                {
                    System.out.println(st.pop()+"  has been poped.");
                    break;
                }
                case 3:{
                    System.out.println("Their are "+st.size()+" elements in the Stack.");
                    break;
                }
                case 4:{
                    loop = false;
                    break;
                }
                default:{
                    System.out.println("It seems you Enter a wrong choice Please try again.");
                }


            }

        }

    }


}

class Stack extends StackUsingOneQueue{
//making push costly..
    void push(int n){
        int temp;
        if(queue.peek() == null){
            queue.add(n);
        }
        else{
                queue.add(n);
            for (int i = 1 ; i < queue.size() ; i++){
             temp = (int) queue.remove();
             queue.add(temp);
            }

        }

    }
    int pop(){

int temp = (int) queue.remove();

        return temp;
    }
    int size(){
        return queue.size();
    }
        }