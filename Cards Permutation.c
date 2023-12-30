#include<stdio.h>
int n, a[300100], pos[300100], 
mod = 1e9 + 7, occ[300100], 
les[300100], grt[300100], st[300100],
 lst[300100], gst[300100], bitree[300050];
void add(int idx,int val)
{
while( idx<=n )
{
bitree[idx]+=val;
idx+=(idx&-idx);
}
}
int get(int idx)
{
int ans=0;
while(idx>0)
{
ans+=bitree[idx];
idx-=(idx&-idx);
}
return ans;
}
long long fact[300100],factsumfr[300100],ans=0;
long long pwr(long long a, long long b)
{
if(b==0)
{
return 1ll;
}
long long temp=pwr(a,b/2);
temp=(temp*temp)%mod;
if(b&1)
{
temp=(temp*a)%mod;
}
return temp;
}
long long inv(long long a)
{
return pwr(a,mod-2);
}
int main()
{
int i;
scanf("%d", &n);
for(i=1;i<=n;i++)
{
scanf("%d",&a[i]);
pos[a[i]]=i;
if(a[i])
{
st[a[i]]=1;
}
if(a[i])
{
occ[i]=1;
}
}
fact[0]=1;
for(i=1;i<=n;i++)
{
les[i]=les[i-1]+occ[i],lst[i]=lst[i-1]+st[i],fact[i]=(fact[i-1]*i)%mod;
}
for(i=n;i>=1;i--)
{
grt[i]=grt[i+1]+occ[i],gst[i]=gst[i+1]+st[i];
}
int k=les[n];
long long faci=fact[n-k],faci1=fact[n-k-1],sumfrfr=0;
for(i=1;i<=n;i++)
{
if(a[i]==0 )
{
sumfrfr=(sumfrfr+((fact[n-i]*(n-i-grt[i+1]))%mod*inv(n-k-1))%mod)%mod;
factsumfr[i]=(factsumfr[i-1]+fact[n-i])%mod;    
}
else
{
factsumfr[i]=factsumfr[i-1];
}
}
for(i=1;i<=n;i++)
{
long long inc=0;
if(st[i]==0)
{
inc+=(inc+((sumfrfr*(i-1-lst[i]))%mod*fact[n-k-1])%mod)%mod;
}
else
{
inc=(inc+(((n-i+1-gst[i])*factsumfr[pos[i]])%mod*fact[n-k-1])%mod)%mod;
inc=(inc+(((((i-lst[i])*fact[n-pos[i]])%mod*fact[n-k])%mod*(n-pos[i]+1-grt[pos[i]]))%mod*inv(n-k))%mod)%mod;
add(pos[i],1);
int inv1=get(n)-get(pos[i]);
inc=(inc+((fact[n-pos[i]]*fact[n-k])%mod*inv1)%mod)%mod;
}
ans=(ans+inc)%mod;
}
ans=(ans+fact[n-k])%mod;
printf("%lld\n",ans);
return 0;
}
