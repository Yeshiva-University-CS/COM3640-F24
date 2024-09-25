grammar CloudDeploy;

@header {
package antlr4;
}

deployment: network ;                              

/* network */

network: 'network' '{' '}' ;            


/* Lexer rules */

STRING : '"' .*? '"' ;  // String literals in double quotes
INTEGER: [0-9]+ ;
NEWLINE: '\r'? '\n' ;

JAVA_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
PYTHON_COMMENT    : '#' ~[\r\n]* -> skip ;
WS                : [ \t]+ -> skip ;
