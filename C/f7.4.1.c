#include<stdio.h>
 double volume(double s1,double s2,double s3);
 double volume(double s1,double s2,double s3){
    return s1*s2*s3;
}
int main(){
    double vol;
    vol = volume(12.,5.67,9.03);
    printf("%f",vol);
}
