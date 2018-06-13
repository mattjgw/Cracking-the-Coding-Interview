
// Given an image represented by an NxN matrix, where each pixel in the
// image is 4 bytes, write a method to rotate the image by 90 degrees.
// Can you do this in place?

public class RotateMatrix {
	
	public static void rotate(int image[][]){
		int n = image.length;
		for(int layer = 0; layer < n/2; layer++){
			int first = layer;
			int last = n-layer-1;
			for(int i = 0; i < n; i++){
				int offset = i-first;
				int temp = image[first][i]; // copy top
				image[first][i] = image[last - offset][first]; //  left to top
				image[last - offset][first] = image[last][last-offset]; // bottom to left
				image[last][last-offset] = image[i][last]; // right to bottom
				image[i][last] = temp; // top to right
			}
		}
		return;
	}
	
	// This is the solution in the book, but this looks incorrect to me. I
	// suppose I don't quite understand the solution
	
	public static void printImage(int image[][]){
		for(int i = 0; i < image.length; i++){
			for(int j = 0; j < image[i].length; j++){
				System.out.print(image[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int image[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}}; 
		printImage(image);
		rotate(image);
		System.out.println();
		printImage(image);
	}

}
