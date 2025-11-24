package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void testClassifyEnergy() {
        assertEquals("high", PlaylistRecommender.classifyEnergy(List.of(150, 160, 170)));
    }

    @Test
    public void testIsValidTrackTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Title"));
        assertFalse(PlaylistRecommender.isValidTrackTitle(" aaaaaaaaaaaaaa   aaaaaaaaaaaa ")); 
        assertFalse(PlaylistRecommender.isValidTrackTitle("@Title"));
    }

    @Test
    public void testNormalizeVolume() {
        assertEquals(0, PlaylistRecommender.normalizeVolume(0));
    }

}
