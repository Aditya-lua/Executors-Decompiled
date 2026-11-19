/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c387a0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

hostent * gethostbyname(char *__name)

{
  hostent *phVar1;
  
  phVar1 = gethostbyname(__name);
  return phVar1;
}

