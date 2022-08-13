package lab3;

enum Answer {
    Match,
    intersectAt1Point,
    intersectAt2Point,
    OneInTwo,
    TwoInOne,
    NotCrosses
}

public class Exercise5 extends Exercise4 {
    int x1, x2, y1, y2;
    int r1, r2;

    public Answer Print() {
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        int r, R;
        if (r1 > r2) {
            r = r2;
            R = r1;
        } else if (r1 < r2) {
            r = r1;
            R = r2;
        } else if (distance == 0) {
            return Answer.Match;
        } else {
            r = r1;
            R = r2;
        }
        if (distance == r + R) {
            return Answer.intersectAt1Point;
        }
        if (distance + r < R) {
            if (r == r1) {
                return Answer.OneInTwo;
            } else {
                return Answer.TwoInOne;
            }
        }
        if (distance < R + r) {
            return Answer.intersectAt2Point;
        }
        return Answer.NotCrosses;
    }
}
