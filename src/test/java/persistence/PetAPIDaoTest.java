package persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetAPIDaoTest {

    @Test
    void getPet() {
        PetAPIDao petDao = new PetAPIDao();
        assertEquals("Diasy", petDao.getPet().getName());
        assertEquals(3, petDao.getPet().getId());
    }
}