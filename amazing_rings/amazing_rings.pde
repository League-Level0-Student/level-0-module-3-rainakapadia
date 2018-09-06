int x=200;
int y=200;
int q=600;
int s=5;
void setup(){
size(800,800);
}
void draw(){
  background(220);
  noFill();
  for(int i=10;i>0;i--){
  ellipse(x,y,i*10,i*10);
  
}
for(int p=10;p>0;p--){
  ellipse(q,y,p*10,p*10);
  
}
x+=s;
  y+=s;
q-=s;
  y-=s;
if(x==400||q==400){
  s=-s;
}if(x<=0||q>=width){
  s=-s;
}}