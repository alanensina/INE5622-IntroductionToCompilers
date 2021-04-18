grammar taja;

start 
    : class_definition* EOF
    ;

function_definition 
    : FUNCTION ID '('arguments? ')' statements
    ;

function_call: ID '.' call;

class_definition
    : CLASS ID '{' class_statements* '}';

class_statements
    : assignment_typed ';'
    | assignment_empty ';'
    | constructor
    | function_definition
    ;

constructor
    : CONSTRUCTOR '(' arguments? ')' '{' statement*? '}'
    ;

arguments 
    : ID (',' ID)*?
    | assignment_empty (',' assignment_empty)*? 
    ;

statements 
    : '{' statement* '}'
    ;

statement 
    : assignments ';'
    | selectionStatement
    | iterStatement
    | labelStatement
    | jumpStatement ';'
    | expression ';'    
    | call ';'
    | function_call ';'
    ;


switchStatements : '{' CASE atomic ':' switchStatement* '}';

switchStatement: assignments ';' 
    | jumpStatement 
    | call ';'
    | labelStatement
    ;

labelStatement :     
    ID ':' statement
    |   CASE atomic ':' statement
    |   DEFAULT ':' statement
    ;

jumpStatement
    :   BREAK ';'
    |   RETURN expression? ';'
    ;

// Conditional statements
selectionStatement
    : IF '(' expression ')' statements (ELSE statements)?
    | SWITCH '(' atomic ')' switchStatements+
    | expression '?' ternaryArguments ':' ternaryArguments
    ;

ternaryArguments:
    expression | call
    ;

// Repetition statements
iterStatement
    : WHILE '(' expression ')' whileStatement
    | FOR '(' assignment_typed ',' expression ',' assignment_change ')' statements
    ;

whileStatement: 
    '{' statement* '}'
    ;

assignments
    : assignment_typed
    | assignment
    | assignment_change
    | assignment_empty
    | assignment_call
    ;

assignment_typed : ID ':' types '=' expression
    | ID ':' types '=' atomic
    ;

assignment_empty: ID ':' types;

assignment_call: ID '=' call 
    ;

assignment : ID '=' expression
    ;

assignment_change : ID '=' ID
    | assignment
    ;

types : TYPE_INT
    | TYPE_FLOAT
    | TYPE_BOOLEAN
    | TYPE_CHAR
    ;

call: ID '(' call_arguments? ')' 
     ;

call_arguments: expressions | arguments
    ;

expressions : expression (',' expression)*
      ;

expression
    :   left=summ (op=('>'|'<'|'>='|'<='|'=='|'!='|'&&'|'||') right=expression)*
    ;

summ 
    : left=mult (op=('+'|'-') right=summ)*
    ;

mult 
    : left=atomic (op=('*'|'/') right=mult)*
    ;

atomic : ID
    | INT
    | BOOL
    | CHAR
    | FLOAT
    | call ';'
    ;
    
// Keywords
TYPE_INT: 'int';
TYPE_FLOAT: 'float';
TYPE_BOOLEAN: 'bool';
TYPE_CHAR: 'char';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
CLASS: 'class';
CONSTRUCTOR: 'constructor';
FUNCTION: 'function';
DEFAULT: 'default';
BREAK: 'break';
RETURN: 'return';
CONTINUE: 'continue';
FOR: 'for';

// Regex
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '-'?[0-9]+;
FLOAT: '-'?[0-9]*.?[0-9]+;
CHAR: [a-zA-Z0-9+<>?=!.,*-];
BOOL: 'true'|'false'|'0'|'1';
WS : [ \r\n\t]+ -> skip;