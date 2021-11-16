

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

package xyz.shortping.tokenizertest.tokens.types;

import xyz.shortping.tokenizertest.tokens.Token;
import xyz.shortping.tokenizertest.tokens.TokenArgument;

public class SumNumbersToken implements Token {

    private TokenArgument[] args;
   
    public SumNumbersToken(TokenArgument[] args) {
        this.args = args;
    }
    
    @Override
    public TokenArgument[] getArgs() {
        return this.args;
    }

    @Override
    public void run() {
        
        int summand = Integer.parseInt((String) this.args[0].getValue());
        
        int summand2 = Integer.parseInt((String) this.args[1].getValue());
        
        
        System.out.println(summand + summand2);
    }

}
