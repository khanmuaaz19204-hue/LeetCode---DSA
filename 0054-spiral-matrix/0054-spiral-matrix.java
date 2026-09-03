class Solution {
    public ArrayList<Integer> spiralOrder(int[][] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int m = arr.length , n=arr[0].length;
        int  firstRow=0, lastRow=m-1, firstcol=0 ,lastcol=n-1;
        while(firstRow<=lastRow && firstcol<=lastcol){
            for(int j=firstcol;j<=lastcol;j++)
                ans.add(arr[firstRow][j]);
            firstRow++;
            if(firstRow>lastRow || firstcol>lastcol) break;
            for(int i=firstRow;i<=lastRow;i++)
                ans.add(arr[i][lastcol]);
            lastcol--;
            if(firstRow>lastRow || firstcol>lastcol) break;
            for(int j=lastcol;j>=firstcol;j--)
                ans.add(arr[lastRow][j]);
            lastRow--;
            if(firstRow>lastRow || firstcol>lastcol) break;
            for(int i=lastRow;i>=firstRow;i--)
                ans.add(arr[i][firstcol]);
            firstcol++;
        }
        return ans;
    }

}