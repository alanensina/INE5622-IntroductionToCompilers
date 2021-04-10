grammar exlang;

start 
    : function_definition* EOF
    ;

function_definition 
    : 'function' name=ID '('arguments? ')' statements
    ;

arguments 
    : ID (',' ID)*
    ;

arguments_exp : expression (',' expression)*
    ;

statements 
    : '{' statement* '}'
    | statement
    ;

statement 
    : assignment ';'
    | selectionStatement
    | iterStatement
    | expression ';'
    ;

selectionStatement
    : 'if' '(' expression ')' statement ('else' statement)?
    | 'switch' '(' expression ')'statement
    ;

iterStatement
    : 'while' '(' expression ')' statement
    | 'foreach' '(' forCond ')' statement
    ;

forCond
    : INT ',' expression
    ;

assignment : ID '=' expression
    ;

expression
    :   left=summ (op=('>'|'<'|'>='|'<='|'=='|'!=') right=expression)*
    ;

summ 
    : left=mult (op=('+'|'-') right=summ)*
    ;

mult 
    : left=atomic (op=('*'|'/') right=mult)*
    ;

atomic : ID
    | INT
    | ID '('arguments_exp')'
    ;
    
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '-'?[0-9]+;
WS : [ \r\n\t]+ -> skip;