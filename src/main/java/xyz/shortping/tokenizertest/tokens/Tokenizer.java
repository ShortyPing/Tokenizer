

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xyz.shortping.tokenizertest.data.DataType;
import xyz.shortping.tokenizertest.exceptions.ExceptionHandler;
import xyz.shortping.tokenizertest.exceptions.types.NotEnoughArgumentsException;
import xyz.shortping.tokenizertest.exceptions.types.SyntaxErrorException;
import xyz.shortping.tokenizertest.tokens.types.PrintConsoleToken;
import xyz.shortping.tokenizertest.tokens.types.SumNumbersToken;

public class Tokenizer {
    
    public Token tokenizeString(String string) {
        String[] fields = string.split("#");
        
        
        
        
        if(TokenType.isSyntaxValidToken(fields[0])) {
            TokenType tokenType = TokenType.getTokenTypeBySyntax(fields[0]);
            List<TokenArgument> argumentList = new ArrayList<TokenArgument>();
            
            if(!(fields.length > tokenType.getArgs().length)) {
                ExceptionHandler.throwException(new NotEnoughArgumentsException());
                return null;
            }
            
            
            
            for(int i = 1; i <= tokenType.getArgs().length; i++) {
                argumentList.add(new TokenArgument(DataType.STRING, fields[i]));
            }
            
            TokenArgument[] argumentArray = Arrays.copyOf(argumentList.toArray(), argumentList.toArray().length, TokenArgument[].class);
    
            switch(tokenType) {
                case PRINT_CONSOLE:
                    new PrintConsoleToken(argumentArray).run();
                    break;
                case SUM_NUMBERS:
                    new SumNumbersToken(argumentArray).run();
                    break;
            }
        } else {
            ExceptionHandler.throwException(new SyntaxErrorException());
            return null;
        }
        return null;
    }

}
