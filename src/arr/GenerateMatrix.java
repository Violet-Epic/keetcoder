package arr;

public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        //给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，
        // 且元素按顺时针顺序螺旋排列的正方形矩阵。
        // 感觉这个是最难的哈哈，count这个直接思路打开
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int count = 1;
        int [][] matrix = new int [n][n];
        while(left <= right && top <= bottom){
            for (int i = left; i <= right; i++){
                matrix[top][i] = count++;
            }
            top ++;
            for (int j = top; j <= bottom; j++){
                matrix[j][right] = count++;
            }
            right --;
            for (int i = right; i >= left; i--){
                matrix[bottom][i] = count++;
            }
            bottom --;
            for (int j = bottom; j >= top; j--){
                matrix[j][left] = count++;
            }
            left ++;
        }
        return matrix;
    }
}
