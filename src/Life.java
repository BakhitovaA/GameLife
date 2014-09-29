/**
 * Created by student on 29.09.2014.
 */
public class Life {
    public static void main(String[] args) {
        Display d = new Display();
        boolean[][] mask = new boolean[100][100];
        mask[30][31] = true;
        mask[30][32] = true;
        mask[30][33] = true;
        mask[30][34] = true;
        mask[30][35] = true;
        mask[31][33] = true;
        mask[32][31] = true;
        mask[32][32] = true;
        mask[32][33] = true;
        mask[32][34] = true;
        mask[32][35] = true;
        mask[40][40] = true;
        mask[39][39] = true;
        mask[38][39] = true;
        mask[39][39] = true;
        mask[50][50] = true;
        mask[50][51] = true;
        mask[50][52] = true;
        mask[5][5] = true;
        mask[10][10] = true;
        mask[52][52] = true;
        mask[60][50] = true;
        mask[53][55] = true;
        mask[51][51] = true;
        mask[50][52] = true;
        mask[53][50] = true;
        mask[53][51] = true;
        mask[63][50] = true;
        mask[63][51] = true;
        d.setMask(mask);
        Display a = new Display();
        while (true) {
            boolean[][] mask1 = new boolean[100][100];
            for (int y = 1; y < 99; y = y + 1) {
                for (int x = 1; x < 99; x = x + 1) {
                    int count = 0;
                    for (int y1 = y - 1; y1 <= y + 1; y1++) {
                        for (int x1 = x - 1; x1 <= x + 1; x1++) {
                            if (x1 == x && y1 == y)
                                continue;
                            if (mask[x1][y1])
                                count++;
                        }
                    }
                    if ((mask[x][y] == true) && (count == 3 || count == 2))
                        mask1[x][y] = true;
                    if ((mask[x][y] == true) && (count > 3 || count < 2))
                        mask1[x][y] = false;
                    if ((mask[x][y] == false) && (count == 3))
                        mask1[x][y] = true;
                }
            }
            a.setMask(mask1);
            mask = mask1;
        }
    }
}
