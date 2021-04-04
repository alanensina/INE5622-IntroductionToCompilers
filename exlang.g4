grammar exlang;

start : function_definition*;

assignment : ID '=' expression;

statement : assignment ';'
    | while_stmt
    | expression ';'
    ;

statements : statement
    | '{' statements* '}'
    ;

function_definition : 'function' ID '('arguments')' statements;

expression : expression '+' expression
    | expression '-' expression
    | expression '/' expression
    | expression '*' expression
    | expression '>' expression
    | expression '<' expression
    | expression '>=' expression
    | expression '<=' expression
    | expression '==' expression
    | '(' expression ')'
    | atomic
    ;

while_stmt : 'while' expression statements;

arguments : ID (',' ID)*
    |
    ;

arguments_exp : expression (',' expression)*
    |
    ;

atomic : ID
    | INT
    | ID '('arguments_exp')'
    ;
    
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '-'?[0-9]+;
WS : [ \r\n\t]+ -> skip;