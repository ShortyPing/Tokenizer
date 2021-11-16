

/*
 * Dieser Quelltext ist geistiges Eigentum von Michael Steinmötzger (ShortPing).
 * Alle Rechte unterliegen der Lizenz unter dieser, dieser Quelltext geführt wird.
 * Jegliche Vervielfältigungsrechte unterliegen dieser Lizenz.
 *
 * This source code is the intellectual property of Michael Steinmötzger (ShortPing).
 * All rights are subject to the license under which this source code is licensed.
 * Any reproduction rights are subject to this license.
 *
 * Copyright © Michael Steinmötzger 2018-2021
 *
 * Alle Rechte vorbehalten
 * All rights reserved
 */

package xyz.shortping.tokenizertest.exceptions.types;

import xyz.shortping.tokenizertest.exceptions.Exception;

public class DataTypeNotMatchException implements Exception {
    
    
    @Override
    public String getMessage() {
        return "given datatype does not match";
    }
    

}
