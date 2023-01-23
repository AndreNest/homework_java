public class lib {
    static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    static int sq_num(int n){
        int sum = 0;
        if (n == 1) return 1;
        if (n == 0) return 0;
        else{
            for (int i = 0; i < n + 1; i++) {
                sum = sum + i;
            }
            return sum;
        }
    }

    static int nat_num(int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(n%(i+1) == 0){
                count++;
            }
        }
        if(count <= 2) return n;
        else return 0;
        
    }
}

