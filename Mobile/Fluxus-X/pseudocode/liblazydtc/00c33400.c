/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c33400
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

__off_t ftello(FILE *__stream)

{
  __off_t _Var1;
  
  _Var1 = ftello(__stream);
  return _Var1;
}

