class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> outDeg=new HashMap<>();

        for(List<String> path:paths){
            String st=path.get(0),end=path.get(1);
            outDeg.put(st,-1);
            if(!outDeg.containsKey(end)||outDeg.get(end)!=-1){
                outDeg.put(end,1);
            }
        }
        for(Map.Entry<String,Integer> entry:outDeg.entrySet()){
          if(entry.getValue()==1)return entry.getKey();
        }
        return "";


        
    }
}