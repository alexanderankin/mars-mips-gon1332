package mars.mips.hardware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterFileTest {

    @Test
    void test_registerNumbersAreArrayPositions() {
        Register[] regFile = RegisterFile.regFile;
        for (int i = 0; i < regFile.length; i++) {
            Register register = regFile[i];
            assertEquals(i, register.getNumber());
        }
    }

}
