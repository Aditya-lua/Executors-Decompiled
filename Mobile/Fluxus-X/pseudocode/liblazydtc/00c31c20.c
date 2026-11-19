/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31c20
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int getsockname(int __fd,sockaddr *__addr,socklen_t *__len)

{
  int iVar1;
  
  iVar1 = getsockname(__fd,__addr,__len);
  return iVar1;
}

