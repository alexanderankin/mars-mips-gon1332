package mars.mips.hardware;

import mars.util.*;

/*
Copyright (c) 2003-2006,  Pete Sanderson and Kenneth Vollmar

Developed by Pete Sanderson (psanderson@otterbein.edu)
and Kenneth Vollmar (kenvollmar@missouristate.edu)

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject
to the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR
ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

(MIT license, http://www.opensource.org/licenses/mit-license.html)
 */

/**
 * Represents MIPS AddressErrorException. This is generated by the assembler when the
 * source code references a memory address not valid for the context.
 *
 * @author Pete Sanderson
 * @version August 2003
 **/
public class AddressErrorException extends Exception {
    private final int address;
    private final int type;  // Exceptions.ADDRESS_EXCEPTION_LOAD,Exceptions.ADDRESS_EXCEPTION_STORE


    /**
     * Constructor for the AddressErrorException class
     *
     * @param addr The erroneous memory address.
     **/

    public AddressErrorException(String message, int exceptType, int addr) {
        super(message + Binary.intToHexString(addr));
        address = addr;
        type = exceptType;
    }

    /**
     * Get the erroneous memory address.
     *
     * @return The erroneous memory address.
     **/
    public int getAddress() {
        return address;
    }

    /**
     * Get the exception type (load or store).
     *
     * @return Exception type: Exceptions.ADDRESS_EXCEPTION_LOAD, Exceptions.ADDRESS_EXCEPTION_STORE
     **/
    public int getType() {
        return type;
    }
}
