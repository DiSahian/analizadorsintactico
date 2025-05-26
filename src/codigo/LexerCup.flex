package codigo;
import java_cup.runtime.Symbol;
%%
%public
%class LexerCup
%line
%column
%type java_cup.runtime.Symbol
%cup

%{
    private java_cup.runtime.Symbol symbol(int type) {
        return new java_cup.runtime.Symbol(type, yyline, yycolumn);
    }
    private java_cup.runtime.Symbol symbol(int type, Object value) {
        return new java_cup.runtime.Symbol(type, yyline, yycolumn, value);
        }
%}

LineTerminator = \r | \n | \r\n
espacio = {LineTerminator} | [ \t\f ]

//LETRAS, DIGITOS Y ESPACIOS(SALTOS, EN BLANCO, ETC)
L=[a-zA-Z_]+
D=[0-9]+

%%

// SIGNOS ADICIONALES
"=" {return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());}
";" {return new Symbol(sym.PUNTO_COMA, yyline, yycolumn, yytext());}
"," {return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
":" {return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());}

// APERTURA Y CIERRE
"(" {return new Symbol(sym.PAR_IZQ, yyline, yycolumn, yytext());}
")" {return new Symbol(sym.PAR_DER, yyline, yycolumn, yytext());}
"{" {return new Symbol(sym.LLAVE_IZQ, yyline, yycolumn, yytext());}
"}" {return new Symbol(sym.LLAVE_DER, yyline, yycolumn, yytext());}
"[" {return new Symbol(sym.CORCH_IZQ, yyline, yycolumn, yytext());}
"]" {return new Symbol(sym.CORCH_DER, yyline, yycolumn, yytext());}

// OPERADORES_ARITMÉTICOS  
"+"|"-"|"*"|"**"|"/"|"%"|"//" {return new Symbol(sym.OPERADORES_ARITMETICOS, yyline, yycolumn, yytext());}

// OPERADORES_RELACIONALES  
"<"|">"|"=="|">="|"<=" {return new Symbol(sym.OPERADORES_RELACIONALES, yyline, yycolumn, yytext());}

// OPERADORES_LOGICOS  
"&&"|and|or|not|xor {return new Symbol(sym.OPERADORES_LOGICOS, yyline, yycolumn, yytext());}

// COMILLAS
"\"" {return new Symbol(sym.COMILLAS, yyline, yycolumn, yytext());}

// INCREMENTO Y DERECREMENTO
"++"|"--" {return new Symbol(sym.INC_DEC, yyline, yycolumn, yytext());}

// INICIO Y FINAL
"start" {return new Symbol(sym.INICIO, yyline, yycolumn, yytext());}
"end" {return new Symbol(sym.FIN, yyline, yycolumn, yytext());}

// ACCESO
friend |
private |
protected |
public |
internal |
sealed |
readonly {return new Symbol(sym.ACCESO, yyline, yycolumn, yytext());}

// ALIAS
as|typedef|type|alias {return new Symbol(sym.ALIAS, yyline, yycolumn, yytext());}

// ARGUMENTO  
args|argv {return new Symbol(sym.ARGUMENTO, yyline, yycolumn, yytext());}

// ARREGLOS  
array|list|vector|tuple|slice {return new Symbol(sym.ARREGLOS, yyline, yycolumn, yytext());}

// BLOCKCHAIN  
contract|address|payable {return new Symbol(sym.BLOCKCHAIN, yyline, yycolumn, yytext());}

// CICLO  
do|do while|while|for|foreach|repeat|until|loop {return new Symbol(sym.CICLO, yyline, yycolumn, yytext());}

// CONCURRENCIA  
thread|async|await|mutex|lock|semaphore|synchronized {return new Symbol(sym.CONCURRENCIA, yyline, yycolumn, yytext());}

// CONJUNTOS  
set|hashset|frozenset {return new Symbol(sym.CONJUNTOS, yyline, yycolumn, yytext());}

// CONTEXTO  
with {return new Symbol(sym.CONTEXTO, yyline, yycolumn, yytext());}

// CONTROL_FLOW  
control|flow {return new Symbol(sym.CONTROL_FLOW, yyline, yycolumn, yytext());}

// DATOS_BOOLEANOS  
bool|boolean|True|False|on|off {return new Symbol(sym.DATOS_BOOLEANOS, yyline, yycolumn, yytext());}

// DATOS_CARACTERES  
char|wchar|rune|character {return new Symbol(sym.DATOS_CARACTERES, yyline, yycolumn, yytext());}

// DATOS_COBOL  
COMP|COMP-1|COMP-2|COMP-3|COMP-4|COMP-5|COMPUTATIONAL|COMPUTATIONAL-1|COMPUTATIONAL-2|COMPUTATIONAL-3|COMPUTATIONAL-4|COMPUTATIONAL-5|COMPUTE {return new Symbol(sym.DATOS_COBOL, yyline, yycolumn, yytext());}

// DATOS_DECIMALES  
float|double|decimal|real|number|numeric|float32_t|f32|f64|Float80|BigDecimal|Rational|complex|complex64|complex128 {return new Symbol(sym.DATOS_DECIMALES, yyline, yycolumn, yytext());}

// DATOS_ENTEROS  
int|integer|short|long|byte|sbyte|uint|size_t|bigint|int8_t|int32_t|i8|i32|u8|u64|isize|usize|Int32 {return new Symbol(sym.DATOS_ENTEROS, yyline, yycolumn, yytext());}

// DATOS_NULOS  
void|null|nil|None|undefined|unit|Nothing|Maybe_a {return new Symbol(sym.DATOS_NULOS, yyline, yycolumn, yytext());}

// DATOS_TEXTO  
string|str|text|varchar|nvarchar|StringBuffer {return new Symbol(sym.DATOS_TEXTO, yyline, yycolumn, yytext());}

// DEBUG  
debugger|breakpoint|trace|log {return new Symbol(sym.DEBUG, yyline, yycolumn, yytext());}

// DECLARAR  
let|var|def|func|procedure|fn {return new Symbol(sym.DECLARAR, yyline, yycolumn, yytext());}

// DICCIONARIOS  
dict|map|hash|associative array|JSON|XML {return new Symbol(sym.DICCIONARIOS, yyline, yycolumn, yytext());}

// ENTRADA_Y_SALIDA  
read|write|open|close|printf|scanf|console|stream {return new Symbol(sym.ENTRADA_Y_SALIDA, yyline, yycolumn, yytext());}

// ESTRUCTURAS  
struct|record|class|object|interface|union|enum {return new Symbol(sym.ESTRUCTURAS, yyline, yycolumn, yytext());}

// EXCEPCIONES  
try|finally|raise|except|panic|recover {return new Symbol(sym.EXCEPCIONES, yyline, yycolumn, yytext());}

// GENÉRICOS  
template|generics|typename|where|extends|implements|traits {return new Symbol(sym.GENERICOS, yyline, yycolumn, yytext());}

// HARDWARE  
register|volatile|atomic|interrupt|inline|asm|kernel|driver {return new Symbol(sym.HARDWARE, yyline, yycolumn, yytext());}

// HERENCIA  
super {return new Symbol(sym.HERENCIA, yyline, yycolumn, yytext());}

// INTERFACES_GRÁFICAS  
window|button|event|callback|canvas|render|paint|widget {return new Symbol(sym.INTERFACES_GRAFICAS, yyline, yycolumn, yytext());}

// MANEJO_DE_MEMORIA  
malloc|free|new|delete|gc|alloc|pointer|reference {return new Symbol(sym.MANEJO_DE_MEMORIA, yyline, yycolumn, yytext());}

// MODULARIDAD  
import|export|package|module|namespace|require|include|using {return new Symbol(sym.MODULARIDAD, yyline, yycolumn, yytext());}

// OPERADOR  
in {return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext());}

// PATRONES_DE_DISEÑO  
singleton|factory|observer|adapter|strategy|proxy {return new Symbol(sym.PATRONES_DE_DISENO, yyline, yycolumn, yytext());}

// PERSISTENCIA  
transient {return new Symbol(sym.PERSISTENCIA, yyline, yycolumn, yytext());}

// PRECISION  
strictfp {return new Symbol(sym.PRECISION, yyline, yycolumn, yytext());}

// REDES  
socket|http|tcp|udp|ip|dns|port|packet {return new Symbol(sym.REDES, yyline, yycolumn, yytext());}

// REFERENCIA  
this {return new Symbol(sym.REFERENCIA, yyline, yycolumn, yytext());}

// REFLEXIÓN  
typeof|instanceof|reflect|metadata|annotation|decorator|attribute {return new Symbol(sym.REFLEXION, yyline, yycolumn, yytext());}

// RETORNO  
return|yield|throw|resume {return new Symbol(sym.RETORNO, yyline, yycolumn, yytext());}

// SALTO  
goto|continue|skip|jump {return new Symbol(sym.SALTO, yyline, yycolumn, yytext());}

// SEGURIDAD  
encrypt|decrypt|salt|auth|permission|role|token {return new Symbol(sym.SEGURIDAD, yyline, yycolumn, yytext());}

// SERIALIZACIÓN  
serialize|deserialize|parse|stringify|marshal|unmarshal {return new Symbol(sym.SERIALIZACION, yyline, yycolumn, yytext());}

// SI  
if|case|when|match {return new Symbol(sym.SI, yyline, yycolumn, yytext());}

// SINO  
else|else if|default|catch|elif|unless|otherwise {return new Symbol(sym.SINO, yyline, yycolumn, yytext());}

// SWITCH  
switch|select|cond {return new Symbol(sym.SWITCH, yyline, yycolumn, yytext());}

// TESTING  
assert|test|unittest|mock|stub|fixture|it|describe {return new Symbol(sym.TESTING, yyline, yycolumn, yytext());}

// TIEMPO  
Date|time|datetime|timestamp|sleep|interval|timeout|now {return new Symbol(sym.TIEMPO, yyline, yycolumn, yytext());}

// Espacios y comentarios (se ignoran)
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}

// Identificadores y números
{L}({L}|{D})* {return new Symbol(sym.ID, yyline, yycolumn, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.NUM, yyline, yycolumn, yytext());}

// Cualquier otro carácter (error)
 . {return new Symbol(sym.ERROR, yyline, yycolumn, yytext());}
