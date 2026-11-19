/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38810
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

FILE * openssl_fopen(char *__filename,char *__modes)

{
  FILE *pFVar1;
  
  pFVar1 = openssl_fopen(__filename,__modes);
  return pFVar1;
}

