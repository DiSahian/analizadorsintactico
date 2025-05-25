
package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char

//LETRAS, DIGITOS Y ESPACIOS(SALTOS, EN BLANCO, ETC)
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

//SIGNOS ADICIONALES
"=" {return new Symbol(sym.IGUAL, yychar, yyline, yytext());}
";" {return new Symbol(sym.PUNTO_COMA, yychar, yyline, yytext());}
"," {return new Symbol(sym.COMA, yychar, yyline, yytext());}
":" {return new Symbol(sym.DOS_PUNTOS, yychar, yyline, yytext());}

//APERTURA Y CIERRE
"(" {return new Symbol(sym.PAR_IZQ, yychar, yyline, yytext());}
")" {return new Symbol(sym.PAR_DER, yychar, yyline, yytext());}
"{" {return new Symbol(sym.LLAVE_IZQ, yychar, yyline, yytext());}
"}" {return new Symbol(sym.LLAVE_DER, yychar, yyline, yytext());}
"[" {return new Symbol(sym.CORCH_IZQ, yychar, yyline, yytext());}
"]" {return new Symbol(sym.CORCH_DER, yychar, yyline, yytext());}


//OPERADORES_ARITMÉTICOS	
"+"|"-"|"*"|"**"|"/"|"%"|"//" {return new Symbol(sym.OPERADORES_ARITMETICOS, yychar, yyline, yytext());}

//OPERADORES_RELACIONALES	
"<"|">"|"=="|">="|"<=" {return new Symbol(sym.OPERADORES_RELACIONALES, yychar, yyline, yytext());}

//OPERADORES_LOGICOS	
"&&"|and|or|not|xor {return new Symbol(sym.OPERADORES_LOGICOS, yychar, yyline, yytext());}

//COMILLAS
"\"" {return new Symbol(sym.COMILLAS, yychar, yyline, yytext());}

//INCREMENTO Y DERECREMENTO
"++"|"--" {return new Symbol(sym.INC_DEC, yychar, yyline, yytext());}

//INICIO Y FINAL
"start" {return new Symbol(sym.INICIO, yychar, yyline, yytext());}
"end" {return new Symbol(sym.FIN, yychar, yyline, yytext());}

//ACCESO
friend |
private |
protected |
public |
internal |
sealed |
readonly {return new Symbol(sym.ACCESO, yychar, yyline, yytext());}

 //ALIAS
as|typedef|type|alias {return new Symbol(sym.ALIAS, yychar, yyline, yytext());}

//ARGUMENTO	
args|argv {return new Symbol(sym.ARGUMENTO, yychar, yyline, yytext());}

//ARREGLOS	
array|list|vector|tuple|slice {return new Symbol(sym.ARREGLOS, yychar, yyline, yytext());}

//BLOCKCHAIN	
contract|address|payable {return new Symbol(sym.BLOCKCHAIN, yychar, yyline, yytext());}

//CICLO	
do|do while|while|for|foreach|repeat|until|loop {return new Symbol(sym.CICLO, yychar, yyline, yytext());}

//CONCURRENCIA	
thread|async|await|mutex|lock|semaphore|synchronized {return new Symbol(sym.CONCURRENCIA, yychar, yyline, yytext());}

//CONJUNTOS	
set|hashset|frozenset {return new Symbol(sym.CONJUNTOS, yychar, yyline, yytext());}


//CONTEXTO	
with {return new Symbol(sym.CONTEXTO, yychar, yyline, yytext());}


//CONTROL_FLOW	
control|flow {return new Symbol(sym.CONTROL_FLOW, yychar, yyline, yytext());}


//DATOS_BOOLEANOS	
bool|boolean|True|False|on|off {return new Symbol(sym.DATOS_BOOLEANOS, yychar, yyline, yytext());}


//DATOS_CARACTERES	
char|wchar|rune|character {return new Symbol(sym.DATOS_CARACTERES, yychar, yyline, yytext());}


//DATOS_COBOL	
COMP|COMP-1|COMP-2|COMP-3|COMP-4|COMP-5|COMPUTATIONAL|COMPUTATIONAL-1|COMPUTATIONAL-2|COMPUTATIONAL-3|COMPUTATIONAL-4|COMPUTATIONAL-5|COMPUTE {return new Symbol(sym.DATOS_COBOL, yychar, yyline, yytext());}


//DATOS_DECIMALES	
float|double|decimal|real|number|numeric|float32_t|f32|f64|Float80|BigDecimal|Rational|complex|complex64|complex128 {return new Symbol(sym.DATOS_DECIMALES, yychar, yyline, yytext());}


//DATOS_ENTEROS	
int|integer|short|long|byte|sbyte|uint|size_t|bigint|int8_t|int32_t|i8|i32|u8|u64|isize|usize|Int32 {return new Symbol(sym.DATOS_ENTEROS, yychar, yyline, yytext());}


//DATOS_NULOS	
void|null|nil|None|undefined|unit|Nothing|Maybe_a {return new Symbol(sym.DATOS_NULOS, yychar, yyline, yytext());}


//DATOS_TEXTO	
string|str|text|varchar|nvarchar|StringBuffer {return new Symbol(sym.DATOS_TEXTO, yychar, yyline, yytext());}


//DEBUG	
debugger|breakpoint|trace|log {return new Symbol(sym.DEBUG, yychar, yyline, yytext());}


//DECLARAR	
let|var|def|func|procedure|fn {return new Symbol(sym.DECLARAR, yychar, yyline, yytext());}


//DICCIONARIOS	
dict|map|hash|associative array|JSON|XML {return new Symbol(sym.DICCIONARIOS, yychar, yyline, yytext());}


//ENTRADA_Y_SALIDA	
read|write|open|close|printf|scanf|console|stream {return new Symbol(sym.ENTRADA_Y_SALIDA, yychar, yyline, yytext());}


//ESTRUCTURAS	
struct|record|class|object|interface|union|enum {return new Symbol(sym.ESTRUCTURAS, yychar, yyline, yytext());}


//EXCEPCIONES	
try|finally|raise|except|panic|recover {return new Symbol(sym.EXCEPCIONES, yychar, yyline, yytext());}

//GENÉRICOS	
template|generics|typename|where|extends|implements|traits {return new Symbol(sym.GENERICOS, yychar, yyline, yytext());}


//HARDWARE	
register|volatile|atomic|interrupt|inline|asm|kernel|driver {return new Symbol(sym.HARDWARE, yychar, yyline, yytext());}


//HERENCIA	
super {return new Symbol(sym.HERENCIA, yychar, yyline, yytext());}


//INTERFACES_GRÁFICAS	
window|button|event|callback|canvas|render|paint|widget {return new Symbol(sym.INTERFACES_GRAFICAS, yychar, yyline, yytext());}


//MANEJO_DE_MEMORIA	
malloc|free|new|delete|gc|alloc|pointer|reference {return new Symbol(sym.MANEJO_DE_MEMORIA, yychar, yyline, yytext());}


//MODULARIDAD	
import|export|package|module|namespace|require|include|using {return new Symbol(sym.MODULARIDAD, yychar, yyline, yytext());}


//OPERADOR	
in {return new Symbol(sym.OPERADOR, yychar, yyline, yytext());}


//PATRONES_DE_DISEÑO	
singleton|factory|observer|adapter|strategy|proxy {return new Symbol(sym.PATRONES_DE_DISENO, yychar, yyline, yytext());}


//PERSISTENCIA	
transient {return new Symbol(sym.PERSISTENCIA, yychar, yyline, yytext());}


//PRECISION	
strictfp {return new Symbol(sym.PRECISION, yychar, yyline, yytext());}


//REDES	
socket|http|tcp|udp|ip|dns|port|packet {return new Symbol(sym.REDES, yychar, yyline, yytext());}


//REFERENCIA	
this {return new Symbol(sym.REFERENCIA, yychar, yyline, yytext());}



//REFLEXIÓN	
typeof|instanceof|reflect|metadata|annotation|decorator|attribute {return new Symbol(sym.REFLEXION, yychar, yyline, yytext());}


//RETORNO	
return|yield|throw|resume {return new Symbol(sym.RETORNO, yychar, yyline, yytext());}


//SALTO	
goto|continue|skip|jump {return new Symbol(sym.SALTO, yychar, yyline, yytext());}


//SEGURIDAD	
encrypt|decrypt|salt|auth|permission|role|token {return new Symbol(sym.SEGURIDAD, yychar, yyline, yytext());}


//SERIALIZACIÓN	
serialize|deserialize|parse|stringify|marshal|unmarshal {return new Symbol(sym.SERIALIZACION, yychar, yyline, yytext());}


//SI	
if|case|when|match {return new Symbol(sym.SI, yychar, yyline, yytext());}


//SINO	
else|else if|default|catch|elif|unless|otherwise {return new Symbol(sym.SINO, yychar, yyline, yytext());}


//SWITCH	
switch|select|cond {return new Symbol(sym.SWITCH, yychar, yyline, yytext());}


//TESTING	
assert|test|unittest|mock|stub|fixture|it|describe {return new Symbol(sym.TESTING, yychar, yyline, yytext());}



//TIEMPO	
Date|time|datetime|timestamp|sleep|interval|timeout|now {return new Symbol(sym.TIEMPO, yychar, yyline, yytext());}

//Espacios y comentarios (se ignoran)
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}


//Identificadores y números
{L}({L}|{D})* {return new Symbol(sym.ID, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.NUM, yychar, yyline, yytext());}

//Cualquier otro carácter (error)
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}