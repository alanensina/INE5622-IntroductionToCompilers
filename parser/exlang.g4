grammar exlang;

start 
    : function_definition* EOF
    ;

function_definition 
    : FUNCTION ID '('arguments? ')' statements
    ;

class_definition
    : CLASS ID '{' class_statements '}';

class_statements
    : assignment? ';'
    | assignment_typed? ';'
    | constructor? ';'
    | function_definition*? ';'
    ;

constructor
    : CONSTRUCTOR '(' arguments ')' '{' statement*? '}'
    ;

arguments 
    : ID (',' ID)*
    ;

statements 
    : '{' statement* '}'
    | statement //vai poder chamar funcao sem chaves?
    ;

statement 
    : assignments ';'
    | selectionStatement ';'
    | iterStatement ';'
    | labelStatement ';'
    | jumpStatement ';'
    | expression ';'    
    | call ';'
    ;

switchStatement : '{' CASE atomic ':' statements+ '}';

labelStatement :     
    ID ':' statement
    |   CASE atomic ':' statement
    |   DEFAULT ':' statement
    ;

jumpStatement
    :   STOP 
    |   RETURN expression? 
    ;

// Conditional statements
selectionStatement
    : IF '(' expression ')' statements (ELSE statements)?
    | SWITCH '(' atomic ')' switchStatement+
    | expression '?' ternaryArguments ':' ternaryArguments
    ;

ternaryArguments:
    expression | call
    ;

// Repetition statements
iterStatement
    : WHILE '(' expression ')' whileStatement
    | FOR '(' arguments_repeat ')' statements
    ;

whileStatement: 
    '{' statement? '}' //nao deveria ser * tbm? pq pode ter mais de um statement dentro
    ;

assignments
    : assignment_typed
    | assignment
    | assignment_change
    ;

assignment_typed : ID ':' types '=' expression
    ;

assignment : ID '=' expression
    ;

assignment_change : ID '=' ID
    ;

types : TYPE_INT
    | TYPE_FLOAT
    | TYPE_BOOLEAN
    | TYPE_CHAR
    ;

call: ID '(' expressions? ')' 
     ;

expressions : expression (',' expression)*
      ;

expression
    :   left=summ (op=('>'|'<'|'>='|'<='|'=='|'!='|'&&'|'||') right=expression)*
    ;

arguments_exp : expression (',' expression)*
    ;

summ 
    : left=mult (op=('+'|'-') right=summ)*
    ;

mult 
    : left=atomic (op=('*'|'/') right=mult)*
    ;

arguments_repeat : INT
    ;

atomic : ID
    | INT
    | ID '('arguments_exp')'
    | call ';'
    ;
    
// Keywords
TYPE_INT: 'int';
TYPE_FLOAT: 'float';
TYPE_BOOLEAN: 'bool';
TYPE_CHAR: 'char';
WHILE: 'while';
FOR: 'repeat';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
CLASS: 'class';
CONSTRUCTOR: 'constructor';
FUNCTION: 'function';
DEFAULT: 'default';
CREATE: 'create';
STOP: 'stop';
RETURN: 'return';
CONTINUE: 'continue';

// Regex
ID : [a-zA-Z][a-zA-Z0-9]*;
INT : '-'?[0-9]+;
WS : [ \r\n\t]+ -> skip;