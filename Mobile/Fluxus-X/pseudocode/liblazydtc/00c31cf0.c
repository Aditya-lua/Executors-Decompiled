/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31cf0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_detach(pthread_t __th)

{
  int iVar1;
  
  iVar1 = pthread_detach(__th);
  return iVar1;
}

