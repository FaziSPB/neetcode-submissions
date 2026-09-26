class DataEntry {
    String value;
    int timestamp;

    public DataEntry(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
class TimeMap {
    private Map<String, List<DataEntry>> map;
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<>());
        map.get(key).add(new DataEntry(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<DataEntry> list = map.get(key);
        int left = 0;
        int right = list.size() - 1;
        String res = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                res = list.get(mid).value; 
                left = mid + 1;             
            } else {
                right = mid - 1;         
            }
        }
        
        return res;
    }
}
