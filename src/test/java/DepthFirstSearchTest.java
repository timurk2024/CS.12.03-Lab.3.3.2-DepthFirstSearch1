import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    private int[][] graph1;
    private int[][] graph2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        graph1 = new int[][] {
                {6,9},
                {11},
                {6,7},
                {9},
                {5,8},
                {4,7},
                {0,2,11},
                {2,5},
                {4,10},
                {0,3},
                {8},
                {1,6}
        };

        graph2 = new int[][] {
                {3,6,5,9},
                {11},
                {7,10},
                {0},
                {5},
                {0,4,7},
                {0,11},
                {2,5,8},
                {7},
                {0},
                {2},
                {1,6}
        };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

        graph1 = null;
        graph2 = null;

    }

    @org.junit.jupiter.api.Test
    void depthFirstSearch() {

        int[] path1 = DepthFirstSearch.depthFirstSearch(graph1);
        int[] path2 = DepthFirstSearch.depthFirstSearch(graph2);

        assertEquals(0, path1[0]);
        assertEquals(9, path1[1]);
        assertEquals(3, path1[2]);
        assertEquals(6, path1[3]);
        assertEquals(11, path1[4]);
        assertEquals(1, path1[5]);
        assertEquals(2, path1[6]);
        assertEquals(7, path1[7]);
        assertEquals(5, path1[8]);
        assertEquals(4, path1[9]);
        assertEquals(8, path1[10]);
        assertEquals(10, path1[11]);

        assertEquals(0, path2[0]);
        assertEquals(9, path2[1]);
        assertEquals(5, path2[2]);
        assertEquals(7, path2[3]);
        assertEquals(8, path2[4]);
        assertEquals(2, path2[5]);
        assertEquals(10, path2[6]);
        assertEquals(4, path2[7]);
        assertEquals(6, path2[8]);
        assertEquals(11, path2[9]);
        assertEquals(1, path2[10]);
        assertEquals(3, path2[11]);

    }
}