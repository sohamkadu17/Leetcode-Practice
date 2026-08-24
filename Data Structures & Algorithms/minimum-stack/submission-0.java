class MinStack {
    ArrayList<Integer> st;
    
    public MinStack() {
        st = new ArrayList<>(); 
    }
    
    public void push(int val) {
        
        st.add(val);
        
    }
    
    public void pop() {
        st.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        int m = Integer.MAX_VALUE;
        for(int n: st){
            m = Math.min(m,n);
        }
        return m;
    }
}
