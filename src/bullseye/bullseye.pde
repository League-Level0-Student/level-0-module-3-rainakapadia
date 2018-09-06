
void setup(){
  size(800,800);
  
  for(int i=11;i>0;i--){
    if(i%2==0){
   fill(#FF0303);
 }else{
   fill(#FFFCFC);
 }
  ellipse(400,400,i*10,i*10);
 
 }
  
  }