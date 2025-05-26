package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
//LETRAS, DIGITOS Y ESPACIOS(SALTOS, EN BLANCO, ETC)
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

//SIGNOS ADICIONALES
"=" {lexeme=yytext(); return IGUAL;}
";" {lexeme=yytext(); return PUNTO_COMA;}
"," {lexeme=yytext(); return COMA;}
":" {lexeme=yytext(); return DOS_PUNTOS;}

//APERTURA Y CIERRE
"(" {lexeme=yytext(); return PAR_IZQ;}
")" {lexeme=yytext(); return PAR_DER;}
"{" {lexeme=yytext(); return LLAVE_IZQ;}
"}" {lexeme=yytext(); return LLAVE_DER;}
"[" {lexeme=yytext(); return CORCH_IZQ;}
"]" {lexeme=yytext(); return CORCH_DER;}


//OPERADORES_ARITMÉTICOS	
"+"|"-"|"*"|"**"|"/"|"%"|"//" {lexeme=yytext(); return OPERADORES_ARITMETICOS;}

//OPERADORES_RELACIONALES	
"<"|">"|"=="|">="|"<=" {lexeme=yytext(); return OPERADORES_RELACIONALES;}

//OPERADORES_LOGICOS	
"&&"|and|or|not|xor {lexeme=yytext(); return OPERADORES_LOGICOS;}


//SALTO DE LINEA
"\n" {return SALTAR;}

//COMILLAS
"\"" {lexeme=yytext(); return COMILLAS;}

//INCREMENTO Y DERECREMENTO
"++"|"--" {lexeme=yytext(); return INC_DEC;}

//INICIO Y FINAL
"start" {lexeme=yytext(); return INICIO;}
"end" {lexeme=yytext(); return FIN;}

//ACCESO
friend |
private |
protected |
static |
public |
internal |
sealed |
readonly {lexeme=yytext(); return ACCESO;}

 //ALIAS
as|typedef|type|alias {lexeme=yytext(); return ALIAS;}

//ARGUMENTO	
args|argv {lexeme=yytext(); return ARGUMENTO;}

//ARREGLOS	
array|list|vector|tuple|slice {lexeme=yytext(); return ARREGLOS;}

//BLOCKCHAIN	
contract|address|payable {lexeme=yytext(); return BLOCKCHAIN;}

//CICLO	
do|do while|while|for|foreach|repeat|until|loop {lexeme=yytext(); return CICLO;}

//CONCURRENCIA	
thread|async|await|mutex|lock|semaphore|synchronized {lexeme=yytext(); return CONCURRENCIA;}

//CONJUNTOS	
set|hashset|frozenset {lexeme=yytext(); return CONJUNTOS;}


//CONTEXTO	
with {lexeme=yytext(); return CONTEXTO;}


//CONTROL_FLOW	
control|flow {lexeme=yytext(); return CONTROL_FLOW;}


//DATOS_BOOLEANOS	
bool|boolean|True|False|on|off {lexeme=yytext(); return DATOS_BOOLEANOS;}


//DATOS_CARACTERES	
char|wchar|rune|character {lexeme=yytext(); return DATOS_CARACTERES;}


//DATOS_COBOL	
COMP|COMP-1|COMP-2|COMP-3|COMP-4|COMP-5|COMPUTATIONAL|COMPUTATIONAL-1|COMPUTATIONAL-2|COMPUTATIONAL-3|COMPUTATIONAL-4|COMPUTATIONAL-5|COMPUTE {lexeme=yytext(); return DATOS_COBOL;}


//DATOS_DECIMALES	
float|double|decimal|real|number|numeric|float32_t|f32|f64|Float80|BigDecimal|Rational|complex|complex64|complex128 {lexeme=yytext(); return DATOS_DECIMALES;}


//DATOS_ENTEROS	
int|integer|short|long|byte|sbyte|uint|size_t|bigint|int8_t|int32_t|i8|i32|u8|u64|isize|usize|Int32 {lexeme=yytext(); return DATOS_ENTEROS;}


//DATOS_NULOS	
void|null|nil|None|undefined|unit|Nothing|Maybe_a {lexeme=yytext(); return DATOS_NULOS;}


//DATOS_TEXTO	
string|str|text|varchar|nvarchar|StringBuffer {lexeme=yytext(); return DATOS_TEXTO;}


//DEBUG	
debugger|breakpoint|trace|log {lexeme=yytext(); return DEBUG;}


//DECLARAR	
let|var|def|func|procedure|fn {lexeme=yytext(); return DECLARAR;}


//DICCIONARIOS	
dict|map|hash|associative array|JSON|XML {lexeme=yytext(); return DICCIONARIOS;}


//ENTRADA_Y_SALIDA	
read|write|open|close|printf|scanf|console|stream {lexeme=yytext(); return ENTRADA_Y_SALIDA;}


//ESTRUCTURAS	
struct|record|class|object|interface|union|enum {lexeme=yytext(); return ESTRUCTURAS;}


//EXCEPCIONES	
try|finally|raise|except|panic|recover {lexeme=yytext(); return EXCEPCIONES;}


//GENÉRICOS	
template|generics|typename|where|extends|implements|traits {lexeme=yytext(); return GENERICOS;}


//HARDWARE	
register|volatile|atomic|interrupt|inline|asm|kernel|driver {lexeme=yytext(); return HARDWARE;}


//HERENCIA	
super {lexeme=yytext(); return HERENCIA;}


//INTERFACES_GRÁFICAS	
window|button|event|callback|canvas|render|paint|widget {lexeme=yytext(); return INTERFACES_GRAFICAS;}


//MANEJO_DE_MEMORIA	
malloc|free|new|delete|gc|alloc|pointer|reference {lexeme=yytext(); return MANEJO_DE_MEMORIA;}

//MODULARIDAD	
import|export|package|module|namespace|require|include|using {lexeme=yytext(); return MODULARIDAD;}


//OPERADOR	
in {lexeme=yytext(); return OPERADOR;}


//PATRONES_DE_DISEÑO	
singleton|factory|observer|adapter|strategy|proxy {lexeme=yytext(); return PATRONES_DE_DISENO;}


//PERSISTENCIA	
transient {lexeme=yytext(); return PERSISTENCIA;}


//PRECISION	
strictfp {lexeme=yytext(); return PRECISION;}


//REDES	
socket|http|tcp|udp|ip|dns|port|packet {lexeme=yytext(); return REDES;}


//REFERENCIA	
this {lexeme=yytext(); return REFERENCIA;}



//REFLEXIÓN	
typeof|instanceof|reflect|metadata|annotation|decorator|attribute {lexeme=yytext(); return REFLEXION;}


//RETORNO	
return|yield|throw|resume {lexeme=yytext(); return RETORNO;}


//SALTO	
goto|continue|skip|jump {lexeme=yytext(); return SALTO;}


//SEGURIDAD	
encrypt|decrypt|salt|auth|permission|role|token {lexeme=yytext(); return SEGURIDAD;}


//SERIALIZACIÓN	
serialize|deserialize|parse|stringify|marshal|unmarshal {lexeme=yytext(); return SERIALIZACION;}


//SI	
if|case|when|match {lexeme=yytext(); return SI;}


//SINO	
else|else if|default|catch|elif|unless|otherwise {lexeme=yytext(); return SINO;}


//SWITCH	
switch|select|cond {lexeme=yytext(); return SWITCH;}


//TESTING	
assert|test|unittest|mock|stub|fixture|it|describe {lexeme=yytext(); return TESTING;}



//TIEMPO	
Date|time|datetime|timestamp|sleep|interval|timeout|now {lexeme=yytext(); return TIEMPO;}

//Espacios y comentarios (se ignoran)
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}


//Identificadores y números
{L}({L}|{D})* {lexeme=yytext(); return ID;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return NUM;}

//Cualquier otro carácter (error)
 . {lexeme=yytext(); return ERROR;}