class RecentCounter {
    Queue<Integer> recentCounter;

    public RecentCounter() {
        recentCounter = new LinkedList<>();
    }

    public int ping(int t) {
        recentCounter.offer(t);
        while (recentCounter.peek() < t - 3000) {
            recentCounter.poll();
        }
        return recentCounter.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */