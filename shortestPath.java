
public class shortestPath {

    public static float  getShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y += 1;
            } else if (path.charAt(i) == 'E') {
                x += 1;
            } else if (path.charAt(i) == 'W') {
                x -= 1;
            } else if (path.charAt(i) == 'S') {
                y -= 1;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
