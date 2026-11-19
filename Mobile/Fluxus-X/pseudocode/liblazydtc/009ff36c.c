/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ff36c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

hostent * BIO_gethostbyname(char *__name)

{
  hostent *phVar1;
  
  phVar1 = gethostbyname(__name);
  return phVar1;
}

