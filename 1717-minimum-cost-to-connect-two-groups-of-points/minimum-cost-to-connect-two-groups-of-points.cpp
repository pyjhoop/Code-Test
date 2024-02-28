class Solution {
public:
    int n,m;
    vector<vector<int>> v;
    vector<int> mini;
    int dp[1<<13][13];
    int f(int mask1,int ind){
        //BASE CASE : if we have explored all the indexe of set 2 and we are doing it to assign optimum values to set 1 members and a ind==-1 means every member of set 1 is assigned something 
        if(ind == -1){
            //Now we will be checking if there is anyone left to be paired in set 2 if yes then we will assign it the corresponding minimum values of set 1 from the mini vectors help
            int ans1 =0;
            for(int i=0;i<m;i++){
                if((mask1&(1<<i))==0){
                    ans1 += mini[i];
                }
            }
            // returning the calculated ans to the previous function calling
            //to be added in overall answer or we can say overall cost
            return ans1;
        }
        //MEMOIZATION
        if(dp[mask1][ind]!=-1)return dp[mask1][ind];

        int ans = INT_MAX;
        //Here we are setting each member of set 1 with optimal values in set 2
        //Means we are trying every values in set 2 for particular set 1 member who is at index ind .Also marking that set 2 member which is being assigned to set 1 member so that in base case we do not find its corresponding minimum cost in set 1
        for(int i=0;i<m;i++){
            ans = min(ans,v[ind][i] + f(mask1|(1<<i),ind-1));
        }
        return dp[mask1][ind]=ans;
    }
    int connectTwoGroups(vector<vector<int>>& cost) {
        v = cost;
        n = cost.size(),m=cost[0].size();
        mini.resize(m,INT_MAX);
        //Maintaining a mini vector containing all the minimum values of set 1
        memset(dp,-1,sizeof(dp));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mini[j] = min(mini[j],cost[i][j]);
            }
        }
        return f(0,n-1);
    }
};