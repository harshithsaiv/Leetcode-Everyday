class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>> result= new ArrayList<List<Integer>>();
        ArrayList<Integer> l1 =new ArrayList<Integer>();
        ArrayList<Integer> l2= new ArrayList<Integer>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums2)
        {
            s2.add(i);
        }
        for(int i: nums1)
        {
            s1.add(i);
        }
        // Creating first array
        for(int j: s1 )
        {
            if(s2.contains(j)==false)
            {
                l1.add(j);
            }
        }    
        // creating second array
        for(int j: s2)
        {
            if(s1.contains(j)==false)
            {
                l2.add(j);
            }
        }
        result.add(l1);
        result.add(l2);
        return result;
    }
}