int findTheWinner(int n,int k) 
{
    int friends[500]; 
    for(int i=0;i<n;++i) 
    {
        friends[i]=i+1; 
    }

    int index=0;
    while(n>1) 
    {
        index=(index+k-1)%n;
        for(int j=index;j<n-1;++j) 
        {
            friends[j]=friends[j+1]; 
        }
        n--; 
    }

    return friends[0]; 
}
