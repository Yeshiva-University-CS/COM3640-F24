grammar CloudDeploy;

@header {
package antlr4;
}

deployment: network ;                              

/* network */

network: 'network' '{' networkBody '}' ;            

networkBody: cidrBlock subnet* ;                   

cidrBlock: 'cidr_block' '=' addr=STRING ;               

subnet: 'subnet' name=STRING '{' cidrBlock '}' ;


/* Lexer rules */

STRING : '"' .*? '"' ;  // String literals in double quotes: "example"
INTEGER: [0-9]+ ;

JAVA_LINE_COMMENT : '//' ~[\r\n]* -> skip ;
PYTHON_COMMENT    : '#' ~[\r\n]* -> skip ;
WS                : [ \t\r\n]+ -> skip ;
