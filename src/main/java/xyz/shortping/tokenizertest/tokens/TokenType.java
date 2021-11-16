

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

import java.util.HashMap;
import xyz.shortping.tokenizertest.data.DataType;

public enum TokenType {
    
    
    PRINT_CONSOLE("printConsole", DataType.STRING),
    SUM_NUMBERS("sum", DataType.INT, DataType.INT);
    
    
    
    private static final HashMap<String, TokenType> syntaxMap = new HashMap<>();
    private String syntax;
    private DataType[] args;
    
    static {
        for(TokenType tokenType : values()) {
            syntaxMap.put(tokenType.getSyntax(), tokenType);
        }
    }
    
    TokenType(String syntax, DataType... expectedArguments) {
        this.syntax = syntax;
        this.args = expectedArguments;
    }

    public String getSyntax() {
        return syntax;
    }

    public DataType[] getArgs() {
        return args;
    }
    
    
    
    public static TokenType getTokenTypeBySyntax(String syntaxString) {
        return syntaxMap.get(syntaxString);
    }
    
    public static boolean isSyntaxValidToken(String syntaxField) {
        return syntaxMap.containsKey(syntaxField);
    }

}
