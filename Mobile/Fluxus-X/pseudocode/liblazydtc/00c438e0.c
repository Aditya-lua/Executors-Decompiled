/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c438e0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutexattr_settype(pthread_mutexattr_t *__attr,int __kind)

{
  int iVar1;
  
  iVar1 = pthread_mutexattr_settype(__attr,__kind);
  return iVar1;
}

