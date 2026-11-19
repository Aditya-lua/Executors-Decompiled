/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a20
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

wint_t getwc(__FILE *__stream)

{
  wint_t wVar1;
  
  wVar1 = getwc(__stream);
  return wVar1;
}

