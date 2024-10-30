grammar CloudDeploy;

@header {
package antlr4;
}

deployment: network EOF;

/* network */

network: 'network' '{' cidrBlock subnet* '}' ;            

cidrBlock: 'cidr_block' '=' addr=STRING ;               

subnet: 'subnet' name=STRING '{' cidrBlock '}' ;


/* Lexer rules */
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;
STRING : '"' .*? '"' ;  // String literals in double quotes: "example"
INTEGER: [0-9]+ ;

JAVA_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
PYTHON_COMMENT    : '#' ~[\r\n]* -> skip ;
WS                : [ \t\r\n]+ -> skip ;
