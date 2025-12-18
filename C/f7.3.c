#include<stdio.h>
int x,y;
int add(int a,int b){
    int c;
    c=a+b;
    return c;
}

int main(){
    printf("input number 1 :");
    scanf("%d",&x);
    printf("input number 2 :");
    scanf("%d",&y);
    printf("%d + %d = %d\n",x,y,add(x,y));
    return 0;
}

