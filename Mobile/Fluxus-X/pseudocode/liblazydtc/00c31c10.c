/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31c10
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int getpeername(int __fd,sockaddr *__addr,socklen_t *__len)

{
  int iVar1;
  
  iVar1 = getpeername(__fd,__addr,__len);
  return iVar1;
}

