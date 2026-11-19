/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31ce0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int getaddrinfo(char *__name,char *__service,addrinfo *__req,addrinfo **__pai)

{
  int iVar1;
  
  iVar1 = getaddrinfo(__name,__service,__req,__pai);
  return iVar1;
}

