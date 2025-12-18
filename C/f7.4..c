#include<stdio.h>
double valume(double s1,double s2,double s3);
double valume(double s1,double s2,double s3){
    double vol;
    vol = s1*s2*s3;
    return vol;
}
int main(){
    double a,b,c;
    printf("width\n");
    scanf("%lf",&a);
    printf("length\n");
    scanf("%lf",&b);
    printf("height\n");
    scanf("%lf",&c);
    printf("%f",valume(a,b,c));
    return 0;
}