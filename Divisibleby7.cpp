class Solution{
  public:
    int isdivisible7(string num){
          int res = 0;
        for(int i = 0; i<num.size(); i++){
            res = res * 10 + (num[i] - '0');
            res = res%7;
            
        }
        if(res == 0){
            return 1;
        }else{
            return 0;
        }
    }
};
