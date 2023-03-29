class Main {
  public static void main(String[] args) {
    int k=10;
    char znak='#';
for(int i=k;i>=0;i--){
      for(int j=0; j<=k;j++)
        if(i==0||j==0||i==k||j==k||i==j)
          System.out.print(znak);
        else
        System.out.print(" ");
        System.out.println();
      }
  }
}