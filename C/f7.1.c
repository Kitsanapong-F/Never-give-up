#include<stdio.h>
#include<conio.h>
void line(){
    int j=0;
    for(j;j<5;j++){
        printf("\xB0");
        printf("\n");
    }
}
int main(){
    printf("\n");
    line();
    printf("\xB0 i love c \xB0\n");
    line();
    getch();
    return 0;
}