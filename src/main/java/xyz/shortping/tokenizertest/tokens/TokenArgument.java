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
package xyz.shortping.tokenizertest.tokens;

import xyz.shortping.tokenizertest.data.DataType;
import xyz.shortping.tokenizertest.exceptions.ExceptionHandler;
import xyz.shortping.tokenizertest.exceptions.types.DataTypeNotMatchException;

public class TokenArgument {

    private Object value;

    public TokenArgument(DataType dataType, Object value) {
        if(dataType.getClazz().isInstance(value)) {
            this.value = value;
        } else {
            ExceptionHandler.throwException(new DataTypeNotMatchException());
        }
    }

    public Object getValue() {
        return value;
    }

}
