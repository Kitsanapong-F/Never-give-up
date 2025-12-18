#include<stdio.h>
#include<conio.h>

int add(int a,int b){
    int c;
    c=a+b;
    return c;
}

int main(){
    
    printf("3+5=%d", add(10,90));
    getch();
    return 0;
}