public class OverlappingRectangle {

    public int overlap(int r1bx, int r1by, int r1tx, int r1ty, int r2bx, int r2by, int r2tx, int r2ty) {
        int yDist = distanceWidth(r1bx, r2bx, r1tx, r2tx);
        int xDist = distanceLength(r1by, r2by, r1ty, r2ty);
        int field = 0;

        if (yDist <= 0 || xDist <= 0) {
            return 0;
        } else {
            field = yDist * xDist;
        }
        return field;
    }

    private int distanceLength(int r1by, int r2by, int r1ty, int r2ty) {
        return Math.min(r1ty, r2ty) - Math.max(r1by, r2by);

    }

    private int distanceWidth(int r1bx, int r2bx, int r1tx, int r2tx) {
        return Math.min(r1tx, r2tx) - Math.max(r1bx, r2bx);
    }

}
