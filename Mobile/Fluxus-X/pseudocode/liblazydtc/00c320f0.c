/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c320f0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int getpwuid_r(__uid_t __uid,passwd *__resultbuf,char *__buffer,size_t __buflen,passwd **__result)

{
  int iVar1;
  
  iVar1 = getpwuid_r(__uid,__resultbuf,__buffer,__buflen,__result);
  return iVar1;
}

